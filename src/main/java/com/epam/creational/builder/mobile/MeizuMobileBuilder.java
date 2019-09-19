package com.epam.creational.builder.mobile;

public class MeizuMobileBuilder extends MobileBuilder {

    @Override
    public void buildName() {
        this.mobile.setName("Meizu M8 lite");
    }

    @Override
    public void buildOperationSystem() {
        this.mobile.setOperationSystem("Android 7.0");
    }

    @Override
    public void buildCPU() {
        this.mobile.setCPU("1.5 GHz");
    }

    @Override
    public void buildDiagonal() {
        this.mobile.setDiagonal(5.7);
    }

    @Override
    public void buildColor() {
        this.mobile.setColor("Black");
    }
}
