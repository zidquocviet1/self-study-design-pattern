package com.mqv.creational.singleton;

import com.mqv.creational.singleton.dependencies.ApplicationDependency;
import com.mqv.creational.singleton.dependencies.ApplicationProvider;
import com.mqv.creational.singleton.dependencies.ApplicationProviderImpl;
import com.mqv.creational.singleton.listener.WebSocketEventListener;
import com.mqv.creational.singleton.model.IceCandidate;

import java.util.UUID;

public class MainApplication {
    public static void main(String[] args) {
        String baseUrl = "http://localhost/api/v1";
        String token = "Bearer abackjvlkss125798sabn";
        String webRtcSessionId = "23mmafb00`@%!#^919248!=+=";

        ApplicationProvider provider = new ApplicationProviderImpl(baseUrl, token, webRtcSessionId, getWebSocketEventListener());
        ApplicationDependency.initialize(provider);

        // Fetch remote user id and then create session to call
        IceCandidate candidate = ApplicationDependency.getRestClient().fetchRemoteCandidate(UUID.randomUUID().toString());
        ApplicationDependency.getWebRtcManager().connectPeer(candidate);

        // Connect to websocket
        ApplicationDependency.getWebSocketClient().connect();
    }

    private static WebSocketEventListener getWebSocketEventListener() {
        return new WebSocketEventListener() {
            @Override
            public void onConnecting() {
                System.out.println("WebSocket onConnecting()");
            }

            @Override
            public void onConnected() {
                System.out.println("WebSocket onConnected()");
            }

            @Override
            public void onReconnecting() {
                System.out.println("WebSocket onReconnecting()");
            }

            @Override
            public void onDisconnecting() {
                System.out.println("WebSocket onDisconnecting()");
            }

            @Override
            public void onDisconnected(String msg, int code) {
                System.out.println("WebSocket onDisconnected(), message: " + msg + ", code: " + code);
            }

            @Override
            public void onFailure(String message) {
                System.out.println("WebSocket onFailure(): " + message);
            }
        };
    }
}
