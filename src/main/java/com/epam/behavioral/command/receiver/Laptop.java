package com.epam.behavioral.command.receiver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Laptop {
    private static final Logger LOG = LogManager.getLogger(Laptop.class);

    public void turnOn() {
        LOG.info("turning on laptop..");
    }

    public void turnOff() {
        LOG.info("turning off laptop..");
    }

    public void logIn() {
        LOG.info("Logging in laptop..");
    }

    public void runItellijIdea() {
        LOG.info("Running itellij IDEA");
    }
}
