package com.mqv.behavior.commandpattern.receiver;

import com.mqv.behavior.commandpattern.model.Request;
import com.mqv.behavior.commandpattern.repository.Repository;

public class AuraSwitch3Receiver extends BaseAuraSwitchReceiver {
    public AuraSwitch3Receiver(Repository repository, String deviceId) {
        super(repository, deviceId);
    }

    @Override
    public void sendOnCommand(String key) {
        System.out.println("Request change status of Aura Switch 3 to On at key: " + key);

        String topic = "devices/" + deviceId + "/requests";
        int turnOnData = 1;
        Request request = new Request(topic, key, turnOnData);

        repository.sendRequest(request);
    }

    @Override
    public void sendOffCommand(String key) {
        System.out.println("Request change status of Aura Switch 3 to Off at key: " + key);

        String topic = "devices/" + deviceId + "/requests";
        int turnOnData = 0;
        Request request = new Request(topic, key, turnOnData);

        repository.sendRequest(request);
    }
}
