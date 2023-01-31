package com.mqv.behavior.chain;

/**
 * @author Viet Mai - Initial contribution
 */
public class CropImageJob extends Job {
    private static final String KEY = "CropImageJob";

    @Override
    public void onRun() {
        System.out.println("Crop image for fitting with the profile picture");
    }

    @Override
    public String getJobKey() {
        return KEY;
    }
}
