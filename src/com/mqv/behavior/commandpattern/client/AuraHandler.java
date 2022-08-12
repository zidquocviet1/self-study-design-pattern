package com.mqv.behavior.commandpattern.client;

import com.mqv.behavior.commandpattern.invoker.FallDetection;
import com.mqv.behavior.commandpattern.invoker.Switch;

public final class AuraHandler implements SwitchHandler, FallDetectionHandler {
    private final Switch mSwitch;
    private final FallDetection mFallDetection;

    public AuraHandler(Switch mSwitch, FallDetection mFallDetection) {
        this.mSwitch = mSwitch;
        this.mFallDetection = mFallDetection;
    }

    @Override
    public void turnOnSwitch(String key) {
        mSwitch.turnOn(key);
    }

    @Override
    public void turnOffSwitch(String key) {
        mSwitch.turnOff(key);
    }

    @Override
    public void sendFallConfig(String key) {
        mFallDetection.sendConfig(key);
    }

    @Override
    public void sendFallControl(String key) {
        mFallDetection.sendControl(key);
    }
}
