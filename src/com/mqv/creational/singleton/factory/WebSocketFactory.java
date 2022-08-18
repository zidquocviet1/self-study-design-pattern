package com.mqv.creational.singleton.factory;

import com.mqv.creational.singleton.model.WebSocketConnection;

public interface WebSocketFactory {
    WebSocketConnection createWebSocket();
    WebSocketConnection createPresenceWebSocket();
}
