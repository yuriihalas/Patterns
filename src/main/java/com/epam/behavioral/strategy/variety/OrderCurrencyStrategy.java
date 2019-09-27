package com.epam.behavioral.strategy.variety;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OrderCurrencyStrategy implements Strategy {
    private static final Logger LOG = LogManager.getLogger(OrderCurrencyStrategy.class);

    @Override
    public void execute() {
        LOG.info("The ordering currency strategy was launched");
    }
}
