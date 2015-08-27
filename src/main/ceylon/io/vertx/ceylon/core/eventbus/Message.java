package io.vertx.ceylon.core.eventbus;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.MultiMap;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
@DocAnnotation$annotation$(description = "todo")
public class Message<T> {

  @Ignore
  private final io.vertx.core.eventbus.Message delegate;

  public Message(io.vertx.core.eventbus.Message delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String address() {
    ceylon.language.String ret = new ceylon.language.String(delegate.address());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap headers() {
    MultiMap ret = new io.vertx.ceylon.core.MultiMap(delegate.headers());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("T")
  public T body() {
    T ret = null;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String replyAddress() {
    ceylon.language.String ret = new ceylon.language.String(delegate.replyAddress());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void reply(
    final @TypeInfo("ceylon.language::Object") @DocAnnotation$annotation$(description = "todo") Object message) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.Helper.toJavaObject(message);
    delegate.reply(arg_0);
  }

  @TypeParameters({
    @TypeParameter(value="R",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public <R> void reply(
    final @TypeInfo("ceylon.language::Object") @DocAnnotation$annotation$(description = "todo") Object message, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.eventbus::Message<R>)") @DocAnnotation$annotation$(description = "todo") Callable<?> replyHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.Helper.toJavaObject(message);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<java.lang.Object>>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.eventbus.Message<java.lang.Object>>(replyHandler) { public Object toCeylon(io.vertx.core.eventbus.Message<java.lang.Object> event) { return new io.vertx.ceylon.core.eventbus.Message(event); } };
    delegate.reply(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void reply(
    final @TypeInfo("ceylon.language::Object") @DocAnnotation$annotation$(description = "todo") Object message, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.eventbus.DeliveryOptions options) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.Helper.toJavaObject(message);
    io.vertx.core.eventbus.DeliveryOptions arg_1 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.Helper.toJsonObject(options.toJson()));
    delegate.reply(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="R",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public <R> void reply(
    final @TypeInfo("ceylon.language::Object") @DocAnnotation$annotation$(description = "todo") Object message, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.eventbus.DeliveryOptions options, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.eventbus::Message<R>)") @DocAnnotation$annotation$(description = "todo") Callable<?> replyHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.Helper.toJavaObject(message);
    io.vertx.core.eventbus.DeliveryOptions arg_1 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.Helper.toJsonObject(options.toJson()));
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<java.lang.Object>>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.eventbus.Message<java.lang.Object>>(replyHandler) { public Object toCeylon(io.vertx.core.eventbus.Message<java.lang.Object> event) { return new io.vertx.ceylon.core.eventbus.Message(event); } };
    delegate.reply(arg_0, arg_1, arg_2);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void fail(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long failureCode, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String message) {
    int arg_0 = (int)failureCode;
    java.lang.String arg_1 = message.toString();
    delegate.fail(arg_0, arg_1);
  }

}
