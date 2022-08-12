package com.mqv.behavior.commandpattern.command;

import com.mqv.behavior.commandpattern.receiver.AuraFallDetectionReceiver;

public class FallControlCommand extends PayloadCommand {
    private final AuraFallDetectionReceiver fallDetection;

    public FallControlCommand(AuraFallDetectionReceiver fallDetection) {
        this.fallDetection = fallDetection;
    }

    @Override
    public void execute(String key) {
        fallDetection.sendControl(key);
    }
}
