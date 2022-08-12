package com.mqv.behavior.commandpattern.receiver;

import com.mqv.behavior.commandpattern.client.Request;

public class AuraRepository implements Repository {
    @Override
    public void sendRequest(Request request) {
        System.out.println("Send request complete on topic " + request.topic() + " with the key: " + request.key() + " and the value: " + (request.data() == 1 ? "true" : "false"));
    }
}
