package com.epam.structural.adapter.vehicle.machine;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class KiaMachine implements Machine {
    private static final Logger LOG = LogManager.getLogger(KiaMachine.class);

    @Override
    public void drive() {
        LOG.info("I am drive on this perfect KIA machine..");
    }
}
