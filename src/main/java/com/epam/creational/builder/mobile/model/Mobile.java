package com.epam.creational.builder.mobile.model;

public class Mobile {
    private String name;
    private String operationSystem;
    private double diagonal;
    private String cpu;
    private String color;

    public void setName(String name) {
        this.name = name;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mobile{" +
            "name='" + name + '\'' +
            ", operationSystem='" + operationSystem + '\'' +
            ", diagonal=" + diagonal +
            ", cpu='" + cpu + '\'' +
            ", color='" + color + '\'' +
            '}';
    }
}
