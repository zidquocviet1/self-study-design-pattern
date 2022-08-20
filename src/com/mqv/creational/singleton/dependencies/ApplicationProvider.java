package com.mqv.creational.singleton.dependencies;

public interface ApplicationProvider {
    WebSocketClient provideWebSocketClient();
    WebRtcManager provideWebRtcManager();
    RestClient provideRestClient();
}
