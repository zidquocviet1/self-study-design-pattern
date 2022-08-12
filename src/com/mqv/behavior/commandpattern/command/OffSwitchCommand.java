package com.mqv.behavior.commandpattern.command;

import com.mqv.behavior.commandpattern.receiver.BaseAuraSwitchReceiver;

public class OffSwitchCommand extends PayloadCommand {
    private final BaseAuraSwitchReceiver auraSwitch;

    public OffSwitchCommand(BaseAuraSwitchReceiver auraSwitch) {
        this.auraSwitch = auraSwitch;
    }

    @Override
    public void execute(String key) {
        auraSwitch.sendOffCommand(key);
    }
}
