import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
/* Generated from io.vertx.core.net.NetClientOptions */
shared class NetClientOptions(
  shared Integer connectTimeout,
  shared String crlPaths,
  shared Buffer crlValues,
  shared String enabledCipherSuites,
  shared Integer idleTimeout,
  shared JksOptions keyStoreOptions,
  shared PemKeyCertOptions pemKeyCertOptions,
  shared PemTrustOptions pemTrustOptions,
  shared PfxOptions pfxKeyCertOptions,
  shared PfxOptions pfxTrustOptions,
  shared Integer receiveBufferSize,
  shared Integer reconnectAttempts,
  shared Integer reconnectInterval,
  shared Boolean reuseAddress,
  shared Integer sendBufferSize,
  shared Integer soLinger,
  shared Boolean ssl,
  shared Boolean tcpKeepAlive,
  shared Boolean tcpNoDelay,
  shared Integer trafficClass,
  shared Boolean trustAll,
  shared JksOptions trustStoreOptions,
  shared Boolean usePooledBuffers) {
}
