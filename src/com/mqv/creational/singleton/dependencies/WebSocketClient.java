package com.mqv.creational.singleton.dependencies;

import com.mqv.creational.singleton.factory.WebSocketFactory;
import com.mqv.creational.singleton.model.WebSocketConnection;

public class WebSocketClient {
    private final WebSocketFactory factory;

    private WebSocketConnection webSocket;
    private WebSocketConnection presenceWebSocket;

    public WebSocketClient(WebSocketFactory factory) {
        this.factory = factory;
    }

    public WebSocketConnection getWebSocket() {
        if (webSocket == null) {
            webSocket = factory.createWebSocket();
        }
        return webSocket;
    }

    public WebSocketConnection getPresenceWebSocket() {
        if (presenceWebSocket == null) {
            presenceWebSocket = factory.createPresenceWebSocket();
        }
        return presenceWebSocket;
    }

    public synchronized void connect() {
        getPresenceWebSocket().connect();
        getWebSocket().connect();
    }

    public synchronized void closeAllConnection() {
        getWebSocket().close();
        getPresenceWebSocket().close();
    }
}
