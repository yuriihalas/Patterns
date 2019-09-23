package com.epam.structural.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunnerProxy {
    private static final Logger LOG = LogManager.getLogger(RunnerProxy.class);

    public static void main(String[] args) {
        Employee employee = new Employee("Losha", 1);
        Employee employeeDana = new Employee("Dana", 1);

        Company company = new EpamCompany();
        company.addEmployee(employee);
        LOG.info("Just Epam company");
        LOG.info("Payment for Losha: " + company.getEmployeePayment(employee));

        company = new SecurityCompanyProxy(company);
        company.addEmployee(employeeDana);
    }
}
