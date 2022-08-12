package com.mqv.behavior.commandpattern.receiver;

import com.mqv.behavior.commandpattern.client.Request;

public interface Repository {
    void sendRequest(Request request);
}
