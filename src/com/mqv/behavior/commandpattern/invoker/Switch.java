package com.mqv.behavior.commandpattern.invoker;

import com.mqv.behavior.commandpattern.command.BaseCommand;

public record Switch(BaseCommand onCommand, BaseCommand offCommand) {
    public void turnOn() {
        onCommand.execute();
    }

    public void turnOff() {
        offCommand.execute();
    }
}
