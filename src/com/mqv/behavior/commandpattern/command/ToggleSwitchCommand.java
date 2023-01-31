package com.mqv.behavior.commandpattern.command;

import com.mqv.behavior.commandpattern.receiver.BaseAuraSwitchReceiver;

public class ToggleSwitchCommand extends PayloadCommand {
    private final BaseAuraSwitchReceiver mSwitch;
    private boolean isTurnOn;

    public ToggleSwitchCommand(BaseAuraSwitchReceiver mSwitch) {
        this.mSwitch = mSwitch;
        this.isTurnOn = false;
    }

    @Override
    public void execute(String key) {
        if (isTurnOn) {
            mSwitch.sendOffCommand(key);
            isTurnOn = false;
        } else {
            mSwitch.sendOnCommand(key);
            isTurnOn = true;
        }
    }
}
