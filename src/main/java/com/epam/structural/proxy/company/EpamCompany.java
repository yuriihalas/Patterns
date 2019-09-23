package com.epam.structural.proxy.company;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class EpamCompany implements Company {
    private Map<Employee, BigDecimal> employersPayment;

    public EpamCompany() {
        employersPayment = new HashMap<>();
    }

    @Override
    public void addEmployee(Employee employee) {
        employersPayment.put(employee, new BigDecimal("100"));
    }

    @Override
    public void removeEmployee(Employee employee) {
        employersPayment.remove(employee);
    }

    @Override
    public void setEmployeePayment(Employee employee, BigDecimal payment) {
        employersPayment.put(employee, payment);
    }

    @Override
    public BigDecimal getEmployeePayment(Employee employee) {
        return employersPayment.get(employee);
    }
}
