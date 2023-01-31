package com.mqv.behavior.chain;

/**
 * @author Viet Mai - Initial contribution
 */
public abstract class Job {
    private Job nextJob;

    public void then(Job job) {
        this.nextJob = job;
    }

    public void run() {
        simulateDelayJobProcess();
        onRun();

        if (nextJob != null) {
            nextJob.run();
        }
    }

    abstract void onRun();

    public abstract String getJobKey();

    public boolean isJobExceededMaximumLifeSpan() {
        return false;
    }

    private void simulateDelayJobProcess() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
