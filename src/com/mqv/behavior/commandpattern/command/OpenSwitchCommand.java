package com.mqv.behavior.commandpattern.command;

import com.mqv.behavior.commandpattern.receiver.BaseAuraSwitchReceiver;

public class OpenSwitchCommand extends PayloadCommand {
    private final BaseAuraSwitchReceiver auraSwitch;

    public OpenSwitchCommand(BaseAuraSwitchReceiver auraSwitch) {
        this.auraSwitch = auraSwitch;
    }

    @Override
    public void execute(String key) {
        auraSwitch.sendOnCommand(key);
    }
}
