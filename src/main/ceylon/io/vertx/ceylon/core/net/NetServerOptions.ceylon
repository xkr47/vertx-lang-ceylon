import io.vertx.ceylon.core.net {
  JksOptions,
  PemKeyCertOptions,
  PemTrustOptions,
  PfxOptions,
  TCPSSLOptions
}
import ceylon.json {
  JsonObject=Object,
  parse
}
import io.vertx.lang.ceylon {
  BaseDataObject,
  Converter,
  ToJava
}
import io.vertx.core.net {
  NetServerOptions_=NetServerOptions
}
import io.vertx.core.json {
  JsonObject_=JsonObject
}
/* Generated from io.vertx.core.net.NetServerOptions */
shared class NetServerOptions(
  shared Integer? acceptBacklog = null,
  shared Boolean? clientAuthRequired = null,
  String? crlPaths = null,
  String? enabledCipherSuites = null,
  shared String? host = null,
  Integer? idleTimeout = null,
  JksOptions? keyStoreOptions = null,
  PemKeyCertOptions? pemKeyCertOptions = null,
  PemTrustOptions? pemTrustOptions = null,
  PfxOptions? pfxKeyCertOptions = null,
  PfxOptions? pfxTrustOptions = null,
  shared Integer? port = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  Integer? sendBufferSize = null,
  Integer? soLinger = null,
  Boolean? ssl = null,
  Boolean? tcpKeepAlive = null,
  Boolean? tcpNoDelay = null,
  Integer? trafficClass = null,
  JksOptions? trustStoreOptions = null,
  Boolean? usePooledBuffers = null) extends TCPSSLOptions(
  crlPaths,
  enabledCipherSuites,
  idleTimeout,
  keyStoreOptions,
  pemKeyCertOptions,
  pemTrustOptions,
  pfxKeyCertOptions,
  pfxTrustOptions,
  receiveBufferSize,
  reuseAddress,
  sendBufferSize,
  soLinger,
  ssl,
  tcpKeepAlive,
  tcpNoDelay,
  trafficClass,
  trustStoreOptions,
  usePooledBuffers) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists acceptBacklog) {
      json.put("acceptBacklog", acceptBacklog);
    }
    if (exists clientAuthRequired) {
      json.put("clientAuthRequired", clientAuthRequired);
    }
    if (exists host) {
      json.put("host", host);
    }
    if (exists port) {
      json.put("port", port);
    }
    return json;
  }
}

shared object toJavaNetServerOptions satisfies Converter<NetServerOptions, NetServerOptions_> {
  shared actual NetServerOptions_ convert(NetServerOptions src) {
    // Todo : make optimized version without json
    value json = JsonObject_(src.toJson().string);
    value ret = NetServerOptions_(json);
    return ret;
  }
}
