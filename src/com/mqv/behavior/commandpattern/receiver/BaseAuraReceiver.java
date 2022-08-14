package com.mqv.behavior.commandpattern.receiver;

import com.mqv.behavior.commandpattern.repository.Repository;

public abstract class BaseAuraReceiver {
    protected Repository repository;
    protected String deviceId;

    public BaseAuraReceiver(Repository repository, String deviceId) {
        this.repository = repository;
        this.deviceId = deviceId;
    }
}
