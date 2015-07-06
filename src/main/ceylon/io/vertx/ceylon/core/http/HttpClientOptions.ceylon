import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core.net {
  JksOptions,
  PemKeyCertOptions,
  PemTrustOptions,
  PfxOptions
}
/* Generated from io.vertx.core.http.HttpClientOptions */
shared class HttpClientOptions(
  shared Integer connectTimeout,
  shared String crlPaths,
  shared Buffer crlValues,
  shared String defaultHost,
  shared Integer defaultPort,
  shared String enabledCipherSuites,
  shared Integer idleTimeout,
  shared Boolean keepAlive,
  shared JksOptions keyStoreOptions,
  shared Integer maxPoolSize,
  shared Integer maxWebsocketFrameSize,
  shared PemKeyCertOptions pemKeyCertOptions,
  shared PemTrustOptions pemTrustOptions,
  shared PfxOptions pfxKeyCertOptions,
  shared PfxOptions pfxTrustOptions,
  shared Boolean pipelining,
  shared Integer receiveBufferSize,
  shared Boolean reuseAddress,
  shared Integer sendBufferSize,
  shared Integer soLinger,
  shared Boolean ssl,
  shared Boolean tcpKeepAlive,
  shared Boolean tcpNoDelay,
  shared Integer trafficClass,
  shared Boolean trustAll,
  shared JksOptions trustStoreOptions,
  shared Boolean tryUseCompression,
  shared Boolean usePooledBuffers,
  shared Boolean verifyHost) {
}
