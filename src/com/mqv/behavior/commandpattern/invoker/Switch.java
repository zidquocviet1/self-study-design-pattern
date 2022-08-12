package com.mqv.behavior.commandpattern.invoker;

import com.mqv.behavior.commandpattern.command.BaseCommand;

import java.util.Objects;

public final class Switch {
    private final BaseCommand onCommand;
    private final BaseCommand offCommand;

    public Switch(BaseCommand onCommand, BaseCommand offCommand) {
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
