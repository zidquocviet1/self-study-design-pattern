package com.mqv.behavior.chain;

/**
 * @author Viet Mai - Initial contribution
 */
public class Main {
    public static void main(String[] args) {
        var cropImageJob = new CropImageJob();
        var scaleImageJob = new ScaleImageJob();
        var uploadImageJob = new UploadImageJob();

        cropImageJob.then(scaleImageJob);
        scaleImageJob.then(uploadImageJob);

        var jobController = new JobController();
        jobController.submitJob(cropImageJob);
    }
}
