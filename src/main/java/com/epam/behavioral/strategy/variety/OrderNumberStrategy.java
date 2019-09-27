package com.epam.behavioral.strategy.variety;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OrderNumberStrategy implements Strategy {
    private static final Logger LOG = LogManager.getLogger(OrderNumberStrategy.class);

    @Override
    public void execute() {
        LOG.info("The ordering number strategy was launched");
    }
}
