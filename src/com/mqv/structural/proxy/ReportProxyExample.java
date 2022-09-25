package com.mqv.structural.proxy;

import com.mqv.structural.proxy.impl.ReportGeneratorProxy;

/**
 * @author VietMai - Initial contribution
 */
public class ReportProxyExample {
    public static void main(String[] args) {
        var manager = new Role(Role.RoleType.MANAGER);
        var cashier = new Role(Role.RoleType.CASHIER);

        var reportProxy = new ReportGeneratorProxy();
        reportProxy.setRole(manager);

        var managerReport = reportProxy.generateReport();
        reportProxy.displayReport(managerReport);
        try {
            reportProxy.deleteReport(managerReport);
        } catch (AccessDeniedException e) {
            System.out.println("Can't delete the report because: ");
        }

        var cashierReport = reportProxy.generateReport();
        reportProxy.setRole(cashier);
        reportProxy.displayReport(cashierReport);
        try {
            reportProxy.deleteReport(cashierReport);
        } catch (AccessDeniedException e) {
            System.out.println("Can't delete the report because: " + e.getMessage());
        }
    }
}
