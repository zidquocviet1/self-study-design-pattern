package com.mqv.behavior.commandpattern.invoker;

import com.mqv.behavior.commandpattern.command.PayloadCommand;

import java.util.Objects;

public final class Switch {
    private final PayloadCommand onCommand;
    private final PayloadCommand offCommand;

    public Switch(PayloadCommand onCommand, PayloadCommand offCommand) {
        Objects.requireNonNull(onCommand);
        Objects.requireNonNull(offCommand);

        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void turnOn(String key) {
        onCommand.execute(key);
    }

    public void turnOff(String key) {
        offCommand.execute(key);
    }
}
