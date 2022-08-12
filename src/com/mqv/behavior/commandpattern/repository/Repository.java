package com.mqv.behavior.commandpattern.repository;

import com.mqv.behavior.commandpattern.model.Request;

public interface Repository {
    void sendRequest(Request request);
}
