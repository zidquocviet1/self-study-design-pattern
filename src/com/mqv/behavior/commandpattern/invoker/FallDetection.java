package com.mqv.behavior.commandpattern.invoker;

import com.mqv.behavior.commandpattern.command.PayloadCommand;

import java.util.Objects;

public final class FallDetection {
    private final PayloadCommand configCommand;
    private final PayloadCommand controlCommand;

    public FallDetection(PayloadCommand configCommand, PayloadCommand controlCommand) {
        Objects.requireNonNull(configCommand);
        Objects.requireNonNull(controlCommand);

        this.configCommand = configCommand;
        this.controlCommand = controlCommand;
    }

    public void sendConfig(String key) {
        configCommand.execute(key);
    }

    public void sendControl(String key) {
        controlCommand.execute(key);
    }
}
