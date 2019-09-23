package com.epam.structural.proxy.company;

public class Employee {
    private String name;
    private int position;

    public Employee(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "name='" + name + '\'' +
            ", position='" + position + '\'' +
            '}';
    }
}
