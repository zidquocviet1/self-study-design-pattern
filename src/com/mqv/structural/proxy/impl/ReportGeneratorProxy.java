package com.mqv.structural.proxy.impl;

import com.mqv.structural.proxy.AccessDeniedException;
import com.mqv.structural.proxy.Report;
import com.mqv.structural.proxy.ReportGenerator;
import com.mqv.structural.proxy.Role;

/**
 * @author VietMai - Initial contribution
 */
public class ReportGeneratorProxy implements ReportGenerator {
    private Role role;
    private ReportGenerator reportGenerator;

    public ReportGeneratorProxy() {
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public Report generateReport() {
        initializeIfNecessary();
        return reportGenerator.generateReport();
    }

    @Override
    public void displayReport(Report report) {
        initializeIfNecessary();
        reportGenerator.displayReport(report);
    }

    @Override
    public void deleteReport(Report report) throws AccessDeniedException {
        if (role.role() == Role.RoleType.MANAGER) {
            initializeIfNecessary();
            reportGenerator.deleteReport(report);
        } else {
            throw new AccessDeniedException("Only manager can delete report");
        }
    }

    private void initializeIfNecessary() {
        if (reportGenerator == null) {
            reportGenerator = new ReportGeneratorImpl();
        }
    }
}
