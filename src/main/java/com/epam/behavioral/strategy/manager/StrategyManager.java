package com.epam.behavioral.strategy.manager;

import com.epam.behavioral.strategy.variety.OrderCurrencyStrategy;
import com.epam.behavioral.strategy.variety.OrderNumberStrategy;
import com.epam.behavioral.strategy.variety.OrderPaymentStrategy;
import com.epam.behavioral.strategy.variety.Strategy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class StrategyManager {
    private static final Logger LOG = LogManager.getLogger(StrategyManager.class);
    private Map<String, Strategy> strategies;

    public StrategyManager() {
        initStrategies();
    }

    public void runStrategy(String strategy) {
        Strategy strategyToRun = strategies.get(strategy);
        if (Objects.isNull(strategyToRun)) {
            LOG.warn(String.format("Our service don't have \"%s\" strategy, sorry..", strategy));
            LOG.warn(String.format("Current strategies: %s", strategies.keySet()));
            return;
        }
        LOG.info(String.format("Execute strategy: \"%s\" from class: \"%s\"", strategy, strategyToRun.getClass().getSimpleName()));
        strategyToRun.execute();
    }

    private void initStrategies() {
        strategies = new HashMap<>();
        strategies.put("OCS", new OrderCurrencyStrategy());
        strategies.put("ONS", new OrderNumberStrategy());
        strategies.put("OPS", new OrderPaymentStrategy());
    }
}
