package com.mqv.creational.singleton.listener;

public interface WebSocketEventListener {
    void onConnecting();

    void onConnected();

    void onReconnecting();

    void onDisconnecting();

    void onDisconnected(String msg, int code);

    void onFailure(String message);
}
