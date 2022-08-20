package com.mqv.creational.singleton.dependencies;

import com.mqv.creational.singleton.factory.WebSocketFactory;
import com.mqv.creational.singleton.listener.WebSocketEventListener;
import com.mqv.creational.singleton.model.WebSocketConnection;

public final class ApplicationProviderImpl implements ApplicationProvider {
    private final String baseUrl;
    private final String accessToken;
    private final String sessionId;
    private final WebSocketEventListener listener;

    public ApplicationProviderImpl(String baseUrl, String accessToken, String sessionId, WebSocketEventListener listener) {
        this.baseUrl = baseUrl;
        this.accessToken = accessToken;
        this.sessionId = sessionId;
        this.listener = listener;
    }

    @Override
    public WebSocketClient provideWebSocketClient() {
        return new WebSocketClient(new WebSocketFactory() {
            @Override
            public WebSocketConnection createWebSocket() {
                return new WebSocketConnection("Identified WS", false, listener);
            }

            @Override
            public WebSocketConnection createPresenceWebSocket() {
                return new WebSocketConnection("Unidentified WS", true, listener);
            }
        });
    }

    @Override
    public WebRtcManager provideWebRtcManager() {
        return new WebRtcManager(sessionId);
    }

    @Override
    public RestClient provideRestClient() {
        return new RestClient(baseUrl, accessToken);
    }
}
