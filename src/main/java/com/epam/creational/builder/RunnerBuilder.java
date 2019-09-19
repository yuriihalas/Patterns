package com.epam.creational.builder;

import com.epam.creational.builder.mobile.HuaweiMobileBuilder;
import com.epam.creational.builder.mobile.MeizuMobileBuilder;
import com.epam.creational.builder.mobile.director.MobileDirector;
import com.epam.creational.builder.mobile.model.Mobile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunnerBuilder {
    private static final Logger LOG = LogManager.getLogger(RunnerBuilder.class);

    public static void main(String[] args) {
        MobileDirector mobileDirector;
        Mobile mobile;

        HuaweiMobileBuilder huaweiMobileBuilder = new HuaweiMobileBuilder();
        mobileDirector = new MobileDirector(huaweiMobileBuilder);
        mobileDirector.buildMobile();
        mobile = mobileDirector.getMobile();
        LOG.info(mobile);

        MeizuMobileBuilder meizuMobileBuilder = new MeizuMobileBuilder();
        mobileDirector = new MobileDirector(meizuMobileBuilder);
        mobileDirector.buildMobile();
        mobile = mobileDirector.getMobile();
        LOG.info(mobile);
    }
}
