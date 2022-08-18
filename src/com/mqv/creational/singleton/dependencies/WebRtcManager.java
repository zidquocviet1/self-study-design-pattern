package com.mqv.creational.singleton.dependencies;

import com.mqv.creational.singleton.model.IceCandidate;

public record WebRtcManager(String sessionId) {
    public void connectPeer(IceCandidate candidate) {
        System.out.println("Connect to candidate to start calling session: " + candidate.toString());
    }
}
