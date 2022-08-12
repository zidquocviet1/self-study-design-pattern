package com.mqv.behavior.commandpattern.repository;

import com.mqv.behavior.commandpattern.model.Request;

public class AuraRepository implements Repository {
    @Override
    public void sendRequest(Request request) {
        System.out.println("Send request complete on topic " + request.topic() + " with the key: " + request.key() + " and the value: " + (request.data() == 1 ? "true" : "false"));
        System.out.println();
    }
}
