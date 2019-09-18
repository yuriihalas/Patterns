package com.epam.creational.abstractfactory.pizza.concrete;

import com.epam.creational.abstractfactory.pizza.NamePizza;
import com.epam.creational.abstractfactory.pizza.Pizza;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VeggiePizza extends Pizza {
    private static final Logger LOG = LogManager.getLogger();

    public VeggiePizza() {
        setName(NamePizza.VEGGIE_PIZZA.toString());
    }

    @Override
    public void eat() {
        LOG.info("I am eating Veggie pizza..");
    }
}
