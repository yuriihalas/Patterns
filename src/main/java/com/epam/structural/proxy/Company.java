package com.epam.structural.proxy;

import java.math.BigDecimal;

public interface Company {
    void addEmployee(Employee employee);

    void removeEmployee(Employee employee);

    void setEmployeePayment(Employee employee, BigDecimal payment);

    BigDecimal getEmployeePayment(Employee employee);
}
