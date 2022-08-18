package com.mqv.creational.singleton;

import com.mqv.creational.singleton.dependencies.RestClient;
import com.mqv.creational.singleton.dependencies.WebRtcManager;
import com.mqv.creational.singleton.dependencies.WebSocketClient;

public final class ApplicationDependency {
    private static final Object LOCK = new Object();
    private static ApplicationProvider provider;

    private static volatile RestClient sRestClient;
    private static volatile WebSocketClient sWebSocketClient;
    private static volatile WebRtcManager sWebRtcManager;

    public static void initialize(ApplicationProvider provider) {
        if (ApplicationDependency.provider != null) {
            throw new IllegalStateException("Already initialized");
        }
        ApplicationDependency.provider = provider;
    }

    public static RestClient getRestClient() {
        if (sRestClient == null) {
            synchronized (LOCK) {
                if (sRestClient == null) {
                    sRestClient = provider.provideRestClient();
                }
            }
        }
        return sRestClient;
    }

    public static WebSocketClient getWebSocketClient() {
        if (sWebSocketClient == null) {
            synchronized (LOCK) {
                if (sWebSocketClient == null) {
                    sWebSocketClient = provider.provideWebSocketClient();
                }
            }
        }
        return sWebSocketClient;
    }

    public static WebRtcManager getWebRtcManager() {
        if (sWebRtcManager == null) {
            synchronized (LOCK) {
                if (sWebRtcManager == null) {
                    sWebRtcManager = provider.provideWebRtcManager();
                }
            }
        }
        return sWebRtcManager;
    }
}
