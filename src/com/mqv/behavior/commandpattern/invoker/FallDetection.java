package com.mqv.behavior.commandpattern.invoker;

import com.mqv.behavior.commandpattern.command.BaseCommand;

public record FallDetection(BaseCommand configCommand, BaseCommand controlCommand) {
    public void sendConfig() {
        configCommand.execute();
    }

    public void sendControl() {
        controlCommand.execute();
    }
}
