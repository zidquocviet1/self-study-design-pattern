package com.mqv;

import com.mqv.behavior.commandpattern.client.AuraHandler;
import com.mqv.behavior.commandpattern.command.*;
import com.mqv.behavior.commandpattern.invoker.FallDetection;
import com.mqv.behavior.commandpattern.invoker.Switch;
import com.mqv.behavior.commandpattern.receiver.*;
import com.mqv.behavior.commandpattern.repository.AuraRepository;
import com.mqv.behavior.commandpattern.repository.Repository;

public class Main {

    public static void main(String[] args) {
        runningCommandPattern();
    }

    public static void runningCommandPattern() {
        // Create repository to communicate with MQTT Broker
        Repository repository = new AuraRepository();

        // Create Aura Devices
        String auraSwitch3Id = "9ABCN_SWITCH3";
        BaseAuraSwitchReceiver auraSwitch3 = new AuraSwitch3Receiver(repository, auraSwitch3Id);

        String auraFallDetectionId = "9ABCN_FS_SS";
        AuraFallDetectionReceiver auraFallDetection = new AuraFallDetectionReceiver(repository, auraFallDetectionId);

        // Create Switch invoker
        BaseCommand openSwitchCommand = new OpenSwitchCommand(auraSwitch3);
        BaseCommand offSwitchCommand = new OffSwitchCommand(auraSwitch3);
        Switch mSwitch = new Switch(openSwitchCommand, offSwitchCommand);

        // Create Aura invoker
        BaseCommand fallConfigCommand = new FallConfigCommand(auraFallDetection);
        BaseCommand fallControlCommand = new FallControlCommand(auraFallDetection);
        FallDetection mFallDetection = new FallDetection(fallConfigCommand, fallControlCommand  );

        // Create Aura Handler
        AuraHandler handler = new AuraHandler(mSwitch, mFallDetection);

        // Send command
        handler.turnOnSwitch("out0");
        handler.turnOnSwitch("out1");
        handler.turnOffSwitch("out2");

        handler.sendFallConfig("network_led");
        handler.sendFallControl("4");
    }
}
