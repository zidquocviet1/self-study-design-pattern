package com.mqv.behavior.commandpattern.command;

public interface BaseCommand {
    void execute();
    void execute(String key);
}
