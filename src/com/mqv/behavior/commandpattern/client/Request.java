package com.mqv.behavior.commandpattern.client;

public record Request(String topic, String key, int data) {
    @Override
    public String toString() {
        return "Request{" +
                "topic='" + topic + '\'' +
                ", key='" + key + '\'' +
                ", data=" + data +
                '}';
    }
}
