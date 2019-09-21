package com.epam.structural.adapter.vehicle.machine;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BmvToyMotorcycle implements ToyMotorcycle {
    private static final Logger LOG = LogManager.getLogger(BmvToyMotorcycle.class);

    @Override
    public void ride() {
        LOG.info("I launched this toy motorcycle");
    }
}
