package com.mqv.behavior.commandpattern.receiver;

import com.mqv.behavior.commandpattern.model.Request;
import com.mqv.behavior.commandpattern.repository.Repository;

public class AuraFallDetectionReceiver extends BaseAuraReceiver {
    private final String deviceId;

    public AuraFallDetectionReceiver(Repository repository, String deviceId) {
        super(repository);
        this.deviceId = deviceId;
    }

    public void sendConfig(String key) {
        System.out.println("Request change status of Aura Fall Detection to On at key: " + key);

        String topic = "devices/" + deviceId + "/requests";
        int turnOnData = 1;
        Request request = new Request(topic, key, turnOnData);

        repository.sendRequest(request);
    }

    public void sendControl(String key) {
        System.out.println("Request send control to Aura Fall Detection at key: " + key);

        String topic = "devices/" + deviceId + "/requests";
        int turnOnData = 1;
        Request request = new Request(topic, key, turnOnData);

        repository.sendRequest(request);
    }
}
