package com.mqv.behavior.commandpattern.command;

import com.mqv.behavior.commandpattern.receiver.AuraFallDetectionReceiver;

public class FallConfigCommand extends PayloadCommand {
    private final AuraFallDetectionReceiver fallDetection;

    public FallConfigCommand(AuraFallDetectionReceiver fallDetection) {
        this.fallDetection = fallDetection;
    }

    @Override
    public void execute(String key) {
        fallDetection.sendConfig(key);
    }
}
