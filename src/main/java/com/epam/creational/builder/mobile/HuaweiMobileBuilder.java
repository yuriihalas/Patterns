package com.epam.creational.builder.mobile;

public class HuaweiMobileBuilder extends MobileBuilder {

    @Override
    public void buildName() {
        this.mobile.setName("Huawei Y7500");
    }

    @Override
    public void buildOperationSystem() {
        this.mobile.setOperationSystem("Android 4.0");
    }

    @Override
    public void buildCPU() {
        this.mobile.setCPU("1.2 Ghz");
    }

    @Override
    public void buildDiagonal() {
        this.mobile.setDiagonal(4.8);
    }

    @Override
    public void buildColor() {
        this.mobile.setColor("White");
    }
}
