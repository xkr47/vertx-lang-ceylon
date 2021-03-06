/*
 * Copyright 2014 Red Hat, Inc.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *  The Eclipse Public License is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  The Apache License v2.0 is available at
 *  http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */

/**
 * === Writing Verticles
 *
 * Ceylon verticles are implemented as subclasses of `io.vertx.ceylon.core.Verticle`.
 *
 * The parent verticle class provides the `vertx` attribute to obtain the Vert.x instance:
 *
 * [source]
 * ----
 * shared default void start() {
 *   // Start a timer
 *   vertx.setPeriodic(1000, (Integer id) => print("Timer has fired"));
 * }
 * ----
 *
 * When the verticle is deployed the `start` method of the verticle will be executed.
 *
 * When the verticle is undeployed the `stop` method of the verticle will be executed.
 *
 * [source]
 * ----
 * shared actual void stop() {}
 *   // Cleanup here
 * }
 * ----
 *
 * === Asynchronous Verticle start and stop
 *
 * Sometimes you want to do something in your verticle start-up which takes some time and you don't want the verticle to
 * be considered deployed until that happens. For example you might want to deploy other verticles in the start method.
 *
 * You can't block waiting for the other verticles to deploy in your start method as that would break the Golden Rule.
 *
 * So how can you do this?
 *
 * The way to do it is to implement the *asynchronous* start method. This version of the method takes a Future as a parameter.
 * When the method returns the verticle will *not* be considered deployed yet. Some time later, after you've done everything
 * you need to do (e.g. start other verticles), you can call complete on the Future (or fail) to signal that you're done.
 *
 * Here's an example:
 *
 * [source]
 * ----
 * shared actual void startAsync(Future<Anything> startFuture) {
 *   // Now deploy some other verticle:
 *
 *   vertx.deployVerticle("otherVerticle.java", (String|Throwable res) {
 *     if (is String res) {
 *       startFuture.complete();
 *     } else {}
 *       startFuture.fail(res.message);
 *     }
 *   });
 * }
 * ----
 *
 * Similarly, there is an asynchronous version of the stop method too. You use this if you want to do some verticle
 * cleanup that takes some time.
 *
 * [source]
 * ----
 * shared actual void stopAsync(Future<Anything> stopFuture) {
 *   obj.doSomethingThatTakesTime((String|Throwable res) {
 *     if (is String res) {
 *       stopFuture.complete();
 *     } else {}
 *       stopFuture.fail(res.message);
 *     }
 *   });
 * end
 * ----
 *
 * INFO: You don't need to manually undeploy child verticles started by a verticle, in the verticle's stop method. Vert.x
 * will automatically undeploy any child verticles when the parent is undeployed.
 *
 * === Running Ceylon Verticles
 *
 * The Vert.x Ceylon language allows to embed Vert.x in Ceylon or run Ceylon verticles from command line.
 *
 * Ceylon can embed Vert.x and start it:
 *
 * [source]
 * ----
 * import io.vertx.ceylon.core {
 *   vertx
 * }
 * import io.vertx.ceylon.core.http { ... }
 *
 * shared void run() {
 *
 *   value vertx_ = vertx.vertx();
 *   value server = vertx_.createHttpServer();
 *
 *   server.requestHandler((HttpServerRequest req) =>
 *     req.response().
 *         putHeader("Content-Type", "text/html").
 *         end("<html><body><h1>Hello World</h1></body></html>")
 *   );
 *
 *   server.listen(8080, (HttpServer|Throwable result) => switch(result)
 *     case (is HttpServer) { print("Server started") }
 *     else { result.printStackTrace() }
 *   );
 * }
 * ----
 *
 * Vert.x can also deploy Ceylon Verticles from command line or from other languages:
 *
 * . Run the ceylon module my.module/1.0.0
 * [source]
 * ----
 * % vertx run ceylon:my.module/1.0.0
 * ----
 *
 * The module will be looked up according to the ceylon repository http://ceylon-lang.org/documentation/1.0/reference/tool/config/#_repositories_section[configuration].
 *
 * The same can be done from Java:
 *
 * [source,java]
 * ----
 * vertx.deployVerticle("ceylon:my.module/1.0.0");
 * ----
 *
 * The module is introspected to find the Verticle, if there are several verticles, one will be picked up.
 *
 * The Ceylon Vert.x language can also compile sources on the fly before running the module:
 *
 * . Compile and run the ceylon module
 * [source]
 * ----
 * % vertx run ceylon:/path/to/my/module
 * ----
 *
 * The _/path/to/my/module_ points to a Ceylon module, i.e the directory contains the `module.ceylon` file
 * and all other ceylon sources.
 *
 * === Ceylon runtime configuration
 *
 * JVM system properties can be set to control the behavior of Ceylon:
 *
 * .Verbose output
 * [source]
 * ----
 * % vertx run ceylon:my.module/1.0.0 -Dceylon.verbose=all
 * ----
 *
 * The `ceylon.verbose` system property is equivalent to the `--verbose` option of _ceylon_ tool.
 *
 * .User repo configuration
 * [source]
 * ----
 * % vertx run ceylon:my.module/1.0.0 -Dceylon.rep=/path/to/modules
 * ----
 *
 * The `ceylon.rep` system property is equivalen to the `--rep` option of _ceylon_ tool.
 */
@Document(fileName = "override/verticles.adoc")
package docoverride.verticles;

import io.vertx.docgen.Document;
