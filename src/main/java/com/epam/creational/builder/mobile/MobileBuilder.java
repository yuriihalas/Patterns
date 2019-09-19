package com.epam.creational.builder.mobile;

import com.epam.creational.builder.mobile.model.Mobile;

public abstract class MobileBuilder {
    protected Mobile mobile;

    public Mobile getMobile() {
        return this.mobile;
    }

    public void createNewMobile() {
        mobile = new Mobile();
    }

    public abstract void buildName();

    public abstract void buildOperationSystem();

    public abstract void buildCPU();

    public abstract void buildDiagonal();

    public abstract void buildColor();
}
