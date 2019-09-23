package com.epam.structural.proxy;

import com.epam.structural.proxy.company.Company;
import com.epam.structural.proxy.company.Employee;
import com.epam.structural.proxy.company.EpamCompany;
import com.epam.structural.proxy.company.SecurityCompanyProxy;
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
