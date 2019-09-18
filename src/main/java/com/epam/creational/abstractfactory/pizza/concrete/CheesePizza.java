package com.epam.creational.abstractfactory.pizza.concrete;

import com.epam.creational.abstractfactory.pizza.NamePizza;
import com.epam.creational.abstractfactory.pizza.Pizza;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CheesePizza extends Pizza {
    private static final Logger LOG = LogManager.getLogger(ClamPizza.class);

    public CheesePizza() {
        setName(NamePizza.CHEESE_PIZZA.toString());
    }

    @Override
    public void eat() {
        LOG.info("I am eating Cheese pizza..");
    }
}
