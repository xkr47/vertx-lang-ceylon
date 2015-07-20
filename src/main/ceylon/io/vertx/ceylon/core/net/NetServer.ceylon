import java.lang {
  String_=String
}
import io.vertx.ceylon.core.net {
  NetSocketStream,
  NetSocket
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.metrics {
  Measured
}
import io.vertx.core.net {
  NetServer_=NetServer
}
/* Generated from io.vertx.core.net.NetServer */
shared abstract class NetServer(NetServer_ delegate) satisfies Delegating
  & Measured {

  shared  NetSocketStream(*<[]>) connectStream => flatten(connectStream_impl);

  shared  NetServer(*<[Anything(NetSocket)]>) connectHandler => flatten(connectHandler_impl);

  shared  NetServer(*<[]|[Anything(Throwable|NetServer)]|[Integer]|[Integer,String]|[Integer,Anything(Throwable|NetServer)]|[Integer,String,Anything(Throwable|NetServer)]>) listen => flatten(listen_impl);

  shared  Anything(*<[]|[Anything(Throwable?)]>) close => flatten(close_impl);

  shared  Integer(*<[]>) actualPort => flatten(actualPort_impl);

  NetSocketStream connectStream_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetServer connectHandler_impl([Anything(NetSocket)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  NetServer listen_impl([]|[Anything(Throwable|NetServer)]|[Integer]|[Integer,String]|[Integer,Anything(Throwable|NetServer)]|[Integer,String,Anything(Throwable|NetServer)] args) {
    if (is [] args) {
      // Invoke method
    }
    if (is [Anything(Throwable|NetServer)] args) {
      // Invoke method
    }
    if (is [Integer] args) {
      // Invoke method
    }
    if (is [Integer,String] args) {
      // Invoke method
    }
    if (is [Integer,Anything(Throwable|NetServer)] args) {
      // Invoke method
    }
    if (is [Integer,String,Anything(Throwable|NetServer)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([]|[Anything(Throwable?)] args) {
    if (is [] args) {
      // Invoke method
    }
    if (is [Anything(Throwable?)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer actualPort_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
