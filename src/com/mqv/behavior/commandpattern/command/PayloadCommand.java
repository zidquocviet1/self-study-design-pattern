package com.mqv.behavior.commandpattern.command;

public abstract class PayloadCommand implements BaseCommand {
    @Override
    public final void execute() {
    }

    public abstract void execute(String key);
}
