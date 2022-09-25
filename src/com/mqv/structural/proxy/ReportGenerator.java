package com.mqv.structural.proxy;

/**
 * @author VietMai - Initial contribution
 */
public interface ReportGenerator {
    Report generateReport();
    void displayReport(Report report);
    void deleteReport(Report report) throws AccessDeniedException;
}
