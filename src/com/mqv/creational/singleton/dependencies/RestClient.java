package com.mqv.creational.singleton.dependencies;

import com.mqv.creational.singleton.model.IceCandidate;

public record RestClient(String url, String token) {
    public IceCandidate fetchRemoteCandidate(String userId) {
        return new IceCandidate("172.16.39.158", "5005", "TCP");
    }
}
