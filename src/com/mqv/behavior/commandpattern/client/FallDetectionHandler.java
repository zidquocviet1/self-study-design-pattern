package com.mqv.behavior.commandpattern.client;

public interface FallDetectionHandler {
    void sendFallConfig(String key);
    void sendFallControl(String key);
}
