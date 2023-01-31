package com.mqv.behavior.chain;

/**
 * @author Viet Mai - Initial contribution
 */
public class BlurImageJob extends Job {
    private static final String KEY = "BlurImageJob";

    @Override
    public void onRun() {
        System.out.println("Making blur image before uploading");
    }

    @Override
    public String getJobKey() {
        return KEY;
    }
}
