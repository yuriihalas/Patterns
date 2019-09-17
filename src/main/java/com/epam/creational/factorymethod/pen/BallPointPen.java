package com.epam.creational.factorymethod.pen;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BallPointPen extends Pen {
    private static Logger LOG = LogManager.getLogger(BallPointPen.class);

    public void write(String message) {
        super.write(message);
        LOG.info("Method write with ballpoint pen");
        LOG.info("message: " + message);
    }
}
