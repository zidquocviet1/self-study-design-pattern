package com.mqv.creational.singleton;

import com.mqv.creational.singleton.dependencies.RestClient;
import com.mqv.creational.singleton.dependencies.WebRtcManager;
import com.mqv.creational.singleton.dependencies.WebSocketClient;

public interface ApplicationProvider {
    WebSocketClient provideWebSocketClient();
    WebRtcManager provideWebRtcManager();
    RestClient provideRestClient();
}
