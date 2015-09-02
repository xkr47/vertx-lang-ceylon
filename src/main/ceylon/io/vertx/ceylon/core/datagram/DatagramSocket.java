package io.vertx.ceylon.core.datagram;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.metrics.Measured;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.ceylon.core.net.SocketAddress;

@DocAnnotation$annotation$(description = "todo")
public class DatagramSocket implements ReadStream<DatagramPacket>, Measured {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(DatagramSocket.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.datagram.DatagramSocket, DatagramSocket> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.datagram.DatagramSocket, DatagramSocket>() {
    public DatagramSocket convert(io.vertx.core.datagram.DatagramSocket src) {
      return new DatagramSocket(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<DatagramSocket, io.vertx.core.datagram.DatagramSocket> TO_JAVA = new io.vertx.lang.ceylon.Converter<DatagramSocket, io.vertx.core.datagram.DatagramSocket>() {
    public io.vertx.core.datagram.DatagramSocket convert(DatagramSocket src) {
      return src.delegate;
    }
  };

  @Ignore private SocketAddress cached_localAddress;
  @Ignore private final io.vertx.core.datagram.DatagramSocket delegate;

  public DatagramSocket(io.vertx.core.datagram.DatagramSocket delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isMetricsEnabled() {
    boolean ret = delegate.isMetricsEnabled();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket send(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @DocAnnotation$annotation$(description = "todo") Buffer packet, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.datagram::DatagramSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.convert(packet);
    int arg_1 = (int)port;
    java.lang.String arg_2 = host.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> arg_3 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.datagram.DatagramSocket>(handler) { public Object toCeylon(io.vertx.core.datagram.DatagramSocket event) { return io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(event); } };
    DatagramSocket ret = io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(delegate.send(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::PacketWritestream")
  public PacketWritestream sender(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    PacketWritestream ret = io.vertx.ceylon.core.datagram.PacketWritestream.TO_CEYLON.convert(delegate.sender(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket send(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.datagram::DatagramSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = str.toString();
    int arg_1 = (int)port;
    java.lang.String arg_2 = host.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> arg_3 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.datagram.DatagramSocket>(handler) { public Object toCeylon(io.vertx.core.datagram.DatagramSocket event) { return io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(event); } };
    DatagramSocket ret = io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(delegate.send(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket send(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String enc, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.datagram::DatagramSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = str.toString();
    java.lang.String arg_1 = enc.toString();
    int arg_2 = (int)port;
    java.lang.String arg_3 = host.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> arg_4 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.datagram.DatagramSocket>(handler) { public Object toCeylon(io.vertx.core.datagram.DatagramSocket event) { return io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(event); } };
    DatagramSocket ret = io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(delegate.send(arg_0, arg_1, arg_2, arg_3, arg_4));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void close(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) { public Object toCeylon(java.lang.Void event) { return null; } };
    delegate.close(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress localAddress() {
    if (cached_localAddress != null) {
      return cached_localAddress;
    }
    SocketAddress ret = io.vertx.ceylon.core.net.SocketAddress.TO_CEYLON.convert(delegate.localAddress());
     cached_localAddress = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket listenMulticastGroup(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String multicastAddress, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.datagram::DatagramSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = multicastAddress.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.datagram.DatagramSocket>(handler) { public Object toCeylon(io.vertx.core.datagram.DatagramSocket event) { return io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(event); } };
    DatagramSocket ret = io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(delegate.listenMulticastGroup(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket listenMulticastGroup(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String multicastAddress, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String networkInterface, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String source, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.datagram::DatagramSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = multicastAddress.toString();
    java.lang.String arg_1 = networkInterface.toString();
    java.lang.String arg_2 = source.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> arg_3 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.datagram.DatagramSocket>(handler) { public Object toCeylon(io.vertx.core.datagram.DatagramSocket event) { return io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(event); } };
    DatagramSocket ret = io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(delegate.listenMulticastGroup(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket unlistenMulticastGroup(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String multicastAddress, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.datagram::DatagramSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = multicastAddress.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.datagram.DatagramSocket>(handler) { public Object toCeylon(io.vertx.core.datagram.DatagramSocket event) { return io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(event); } };
    DatagramSocket ret = io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(delegate.unlistenMulticastGroup(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket unlistenMulticastGroup(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String multicastAddress, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String networkInterface, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String source, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.datagram::DatagramSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = multicastAddress.toString();
    java.lang.String arg_1 = networkInterface.toString();
    java.lang.String arg_2 = source.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> arg_3 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.datagram.DatagramSocket>(handler) { public Object toCeylon(io.vertx.core.datagram.DatagramSocket event) { return io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(event); } };
    DatagramSocket ret = io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(delegate.unlistenMulticastGroup(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket blockMulticastGroup(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String multicastAddress, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String sourceToBlock, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.datagram::DatagramSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = multicastAddress.toString();
    java.lang.String arg_1 = sourceToBlock.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.datagram.DatagramSocket>(handler) { public Object toCeylon(io.vertx.core.datagram.DatagramSocket event) { return io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(event); } };
    DatagramSocket ret = io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(delegate.blockMulticastGroup(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket blockMulticastGroup(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String multicastAddress, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String networkInterface, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String sourceToBlock, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.datagram::DatagramSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = multicastAddress.toString();
    java.lang.String arg_1 = networkInterface.toString();
    java.lang.String arg_2 = sourceToBlock.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> arg_3 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.datagram.DatagramSocket>(handler) { public Object toCeylon(io.vertx.core.datagram.DatagramSocket event) { return io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(event); } };
    DatagramSocket ret = io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(delegate.blockMulticastGroup(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket listen(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.datagram::DatagramSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.datagram.DatagramSocket>(handler) { public Object toCeylon(io.vertx.core.datagram.DatagramSocket event) { return io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(event); } };
    DatagramSocket ret = io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(delegate.listen(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket pause() {
    DatagramSocket ret = io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(delegate.pause());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket resume() {
    DatagramSocket ret = io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(delegate.resume());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket endHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$(); } };
    DatagramSocket ret = io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(delegate.endHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.datagram::DatagramPacket)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.datagram.DatagramPacket> arg_0 = new io.vertx.core.Handler<io.vertx.core.datagram.DatagramPacket>() { public void handle(io.vertx.core.datagram.DatagramPacket event) { handler.$call$((Object)io.vertx.ceylon.core.datagram.DatagramPacket.TO_CEYLON.convert(event)); } };
    DatagramSocket ret = io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(delegate.handler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    DatagramSocket ret = io.vertx.ceylon.core.datagram.DatagramSocket.TO_CEYLON.convert(delegate.exceptionHandler(arg_0));
    return this;
  }

}
