package com.mqv.behavior.commandpattern.command;

import com.mqv.behavior.commandpattern.receiver.BaseAuraSwitch;

public class OpenSwitchCommand implements BaseCommand {
    private final BaseAuraSwitch auraSwitch;

    public OpenSwitchCommand(BaseAuraSwitch auraSwitch) {
        this.auraSwitch = auraSwitch;
    }

    @Override
    public void execute() {
    }

    @Override
    public void execute(String key) {
        auraSwitch.sendOnCommand(key);
    }
}
