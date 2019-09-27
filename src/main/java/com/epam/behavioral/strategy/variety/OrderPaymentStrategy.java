package com.epam.behavioral.strategy.variety;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OrderPaymentStrategy implements Strategy {
    private static final Logger LOG = LogManager.getLogger(OrderPaymentStrategy.class);

    @Override
    public void execute() {
        LOG.info("The ordering payment strategy was launched");
    }
}
