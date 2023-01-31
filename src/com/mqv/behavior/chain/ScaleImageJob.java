package com.mqv.behavior.chain;

/**
 * @author Viet Mai - Initial contribution
 */
public class ScaleImageJob extends Job {
    private static final String KEY = "ScaleImageJob";

    @Override
    public void onRun() {
        System.out.println("Scale down the image before uploading to prevent such data storage");
    }

    @Override
    public String getJobKey() {
        return KEY;
    }
}
