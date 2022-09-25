package com.mqv.structural.proxy.impl;

import com.mqv.structural.proxy.Report;
import com.mqv.structural.proxy.ReportGenerator;

import java.util.UUID;

/**
 * @author VietMai - Initial contribution
 */
public class ReportGeneratorImpl implements ReportGenerator {
    @Override
    public Report generateReport() {
        return new Report(UUID.randomUUID().toString(), "Revenue Report", System.currentTimeMillis());
    }

    @Override
    public void displayReport(Report report) {
        System.out.println("Report ID: [" + report.id() + "], Name: [" + report.name() + "], Time: [" + report.timestamp() + "]");
    }

    @Override
    public void deleteReport(Report report) {
        System.out.println("Report with ID: " + report.id() + " was deleted!");
    }
}
