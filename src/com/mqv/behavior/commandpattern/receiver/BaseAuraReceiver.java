package com.mqv.behavior.commandpattern.receiver;

import com.mqv.behavior.commandpattern.repository.Repository;

public abstract class BaseAuraReceiver {
    protected Repository repository;

    public BaseAuraReceiver(Repository repository) {
        this.repository = repository;
    }
}
