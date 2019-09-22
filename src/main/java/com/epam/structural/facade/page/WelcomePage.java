package com.epam.structural.facade.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WelcomePage {
    private static final Logger LOG = LogManager.getLogger(WelcomePage.class);

    public void clickOnWelcomeButton() {
        LOG.info("Click on welcome button that move us to Home page");
    }
}
