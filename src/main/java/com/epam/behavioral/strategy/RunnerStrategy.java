package com.epam.behavioral.strategy;

import com.epam.behavioral.strategy.manager.StrategyManager;

public class RunnerStrategy {
    public static void main(String[] args) {
        StrategyManager strategyManager = new StrategyManager();

        strategyManager.runStrategy("OPS");
        strategyManager.runStrategy("ONS");
        strategyManager.runStrategy("OON");
    }
}
