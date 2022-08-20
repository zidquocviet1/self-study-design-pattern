package com.mqv.creational.singleton.dependencies;

import com.mqv.creational.singleton.model.IceCandidate;

public final class RestClient {
    private final String url;
    private final String token;

    RestClient(String url, String token) {
        this.url = url;
        this.token = token;
    }

    public IceCandidate fetchRemoteCandidate(String userId) {
        return new IceCandidate("172.16.39.158", "5005", "TCP");
    }
}
