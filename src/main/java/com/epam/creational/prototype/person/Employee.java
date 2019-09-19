package com.epam.creational.prototype.person;

public class Employee extends Person {
    private String placeWork;

    public Employee() {
    }

    public Employee(Employee employee) {
        super(employee);
        this.placeWork = employee.placeWork;
    }

    public String getPlaceWork() {
        return placeWork;
    }

    public void setPlaceWork(String placeWork) {
        this.placeWork = placeWork;
    }

    @Override
    public Employee clone() {
        return new Employee(this);
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{" +
            "placeWork='" + placeWork + '\'' +
            '}';
    }
}
