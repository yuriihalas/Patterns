package com.epam.creational.factorymethod.pen;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GelPen extends Pen {
    private static final Logger LOG = LogManager.getLogger(GelPen.class);

    public void write(String message) {
        super.write(message);
        LOG.info("Method write with gel pen");
        LOG.info("message: " + message);
    }
}
