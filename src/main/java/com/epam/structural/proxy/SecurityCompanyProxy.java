package com.epam.structural.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.util.Objects;

public class SecurityCompanyProxy implements Company {
    private static final Logger LOG = LogManager.getLogger(SecurityCompanyProxy.class);
    private Company company;

    public SecurityCompanyProxy(Company company) {
        this.company = company;
    }

    @Override
    public void addEmployee(Employee employee) {
        if (employee.getPosition() >= 2) {
            company.addEmployee(employee);
        } else {
            LOG.error("Sorry, but our company can apply only two plus position");
        }
    }

    @Override
    public void removeEmployee(Employee employee) {
        if (Objects.nonNull(employee)) {
            company.removeEmployee(employee);
        }
    }

    @Override
    public void setEmployeePayment(Employee employee, BigDecimal payment) {
        if (Objects.nonNull(employee) && payment.doubleValue() >= 0.) {
            company.setEmployeePayment(employee, payment);
        }
    }

    @Override
    public BigDecimal getEmployeePayment(Employee employee) {
        if (Objects.isNull(employee)) {
            return new BigDecimal("100");
        }
        return company.getEmployeePayment(employee);
    }
}
