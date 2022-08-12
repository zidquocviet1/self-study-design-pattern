package com.mqv.behavior.commandpattern.receiver;

public abstract class BaseAuraSwitch {
    protected Repository repository;

    public BaseAuraSwitch(Repository repository) {
        this.repository = repository;
    }

    public abstract void sendOnCommand(String key);
    public abstract void sendOffCommand(String key);
}
