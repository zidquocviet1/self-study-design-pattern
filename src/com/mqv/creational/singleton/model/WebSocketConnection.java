package com.mqv.creational.singleton.model;

import com.mqv.creational.singleton.listener.WebSocketEventListener;

public class WebSocketConnection {
    private final String name;
    private final String url;
    private final WebSocketEventListener listener;

    public WebSocketConnection(String name, boolean isPresence, WebSocketEventListener listener) {
        if (isPresence) {
            url = "wss://localhost/api/v1/websocket-presence";
        } else {
            url = "wss://localhost/api/v1/websocket";
        }
        this.name = name;
        this.listener = listener;
    }

    public synchronized void connect() {
        System.out.println(name + " connecting to websocket with address: " + url);

        listener.onConnecting();

        try {
            Thread.sleep(3000);
            listener.onConnected();
        } catch (InterruptedException e) {
            listener.onFailure(e.getMessage());
        }
    }

    public synchronized void close() {
        System.out.println(name + " disconnecting from websocket with address: " + url);

        listener.onDisconnecting();

        try {
            Thread.sleep(3000);
            listener.onDisconnected("Close successfully", 102);
        } catch (InterruptedException e) {
            listener.onFailure(e.getMessage());
        }
    }
}
