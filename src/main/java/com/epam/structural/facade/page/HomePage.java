package com.epam.structural.facade.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomePage {
    private static final Logger LOG = LogManager.getLogger(HomePage.class);

    public void sendKeysLogin(String login) {
        LOG.info("Set text to field login: " + login);
    }

    public void sendKeysPassword(String password) {
        LOG.info("Set text to field password: " + password);
    }

    public void clickOnRegisterButton() {
        LOG.info("Click on register button");
    }
}
