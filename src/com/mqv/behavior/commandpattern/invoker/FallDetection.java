package com.mqv.behavior.commandpattern.invoker;

import com.mqv.behavior.commandpattern.command.BaseCommand;

import java.util.Objects;

public final class FallDetection {
    private final BaseCommand configCommand;
    private final BaseCommand controlCommand;

    public FallDetection(BaseCommand configCommand, BaseCommand controlCommand) {
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
