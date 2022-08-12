package com.mqv.behavior.commandpattern.receiver;

import com.mqv.behavior.commandpattern.client.Request;

public class AuraSwitch3 extends BaseAuraSwitch {
    private final String deviceId;

    public AuraSwitch3(Repository repository, String deviceId) {
        super(repository);
        this.deviceId = deviceId;
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
        System.out.println("Request change status of Aura Switch 3 to off at key: " + key);
    }
}
