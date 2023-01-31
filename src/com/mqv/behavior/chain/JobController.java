package com.mqv.behavior.chain;

/**
 * @author Viet Mai - Initial contribution
 */
public class JobController {
    public JobController() {
    }

    public void submitJob(Job job) {
        if (job.isJobExceededMaximumLifeSpan()) {
            return;
        }
        job.run();
    }
}
