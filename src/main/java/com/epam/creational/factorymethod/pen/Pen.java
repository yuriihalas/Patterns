package com.epam.creational.factorymethod.pen;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Pen {
    private static final Logger LOG = LogManager.getLogger(Pen.class);
    private boolean isOpen;

    public Pen() {
        isOpen = false;
    }

    public void open() {
        isOpen = true;
    }

    public void write(String message) {
        if (!isOpen) {
            LOG.warn("message can't be written");
            throw new RuntimeException("Pen isn't open, sorry, you can't write..");
        }
    }

    public void close() {
        isOpen = false;
    }
}
