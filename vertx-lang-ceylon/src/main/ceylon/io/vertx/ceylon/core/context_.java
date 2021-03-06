package io.vertx.ceylon.core;

import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import com.redhat.ceylon.compiler.java.runtime.model.ReifiedType;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@Name("context")
@com.redhat.ceylon.compiler.java.metadata.Object
public class context_ implements ReifiedType {

  private static final context_ instance = new context_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(context_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.core::context")
  public static context_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Is the current thread a worker thread?\n <p>\n NOTE! This is not always the same as calling [isWorkerContext](Context.type.html#isWorkerContext). If you are running blocking code\n from an event loop context, then this will return true but [isWorkerContext](Context.type.html#isWorkerContext) will return false.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isOnWorkerThread() {
    boolean ret = io.vertx.core.Context.isOnWorkerThread();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Is the current thread an event thread?\n <p>\n NOTE! This is not always the same as calling [isEventLoopContext](Context.type.html#isEventLoopContext). If you are running blocking code\n from an event loop context, then this will return false but [isEventLoopContext](Context.type.html#isEventLoopContext) will return true.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isOnEventLoopThread() {
    boolean ret = io.vertx.core.Context.isOnEventLoopThread();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Is the current thread a Vert.x thread? That's either a worker thread or an event loop thread\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isOnVertxThread() {
    boolean ret = io.vertx.core.Context.isOnVertxThread();
    return ret;
  }

}
