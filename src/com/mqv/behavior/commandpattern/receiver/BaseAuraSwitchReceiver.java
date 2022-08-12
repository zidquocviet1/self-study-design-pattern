package com.mqv.behavior.commandpattern.receiver;

import com.mqv.behavior.commandpattern.repository.Repository;

public abstract class BaseAuraSwitchReceiver extends BaseAuraReceiver {
    public BaseAuraSwitchReceiver(Repository repository) {
        super(repository);
    }

    public abstract void sendOnCommand(String key);
    public abstract void sendOffCommand(String key);
}
