package com.epam.creational.builder.mobile.director;

import com.epam.creational.builder.mobile.MobileBuilder;
import com.epam.creational.builder.mobile.model.Mobile;

public class MobileDirector {
    private MobileBuilder mobileBuilder;

    public MobileDirector(MobileBuilder mobileBuilder) {
        this.mobileBuilder = mobileBuilder;
    }

    public Mobile getMobile() {
        return mobileBuilder.getMobile();
    }

    public void buildMobile() {
        mobileBuilder.createNewMobile();
        mobileBuilder.buildName();
        mobileBuilder.buildOperationSystem();
        mobileBuilder.buildDiagonal();
        mobileBuilder.buildCPU();
        mobileBuilder.buildColor();
    }
}
