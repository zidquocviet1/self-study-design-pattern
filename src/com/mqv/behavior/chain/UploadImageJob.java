package com.mqv.behavior.chain;

/**
 * @author Viet Mai - Initial contribution
 */
public class UploadImageJob extends Job {
    private static final String KEY = "UploadImageJob";

    @Override
    public void onRun() {
        System.out.println("Making a http request to upload this image to webserver");
    }

    @Override
    public String getJobKey() {
        return KEY;
    }
}
