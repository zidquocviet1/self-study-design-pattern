package com.mqv.creational.singleton.dependencies;

import com.mqv.creational.singleton.model.IceCandidate;

public final class WebRtcManager {
    private final String sessionId;

    WebRtcManager(String sessionId) {
        this.sessionId = sessionId;
    }

    public void connectPeer(IceCandidate candidate) {
        System.out.println("Connect to candidate to start calling session: " + candidate.toString());
    }
}
