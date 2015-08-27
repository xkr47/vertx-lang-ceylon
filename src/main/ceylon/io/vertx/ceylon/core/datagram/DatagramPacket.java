package io.vertx.ceylon.core.datagram;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.net.SocketAddress;

@DocAnnotation$annotation$(description = "todo")
public class DatagramPacket {

  private final io.vertx.core.datagram.DatagramPacket delegate;

  public DatagramPacket(io.vertx.core.datagram.DatagramPacket delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress sender() {
    SocketAddress ret = new io.vertx.ceylon.core.net.SocketAddress(delegate.sender());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer data() {
    Buffer ret = new io.vertx.ceylon.core.buffer.Buffer(delegate.data());
    return ret;
  }

}