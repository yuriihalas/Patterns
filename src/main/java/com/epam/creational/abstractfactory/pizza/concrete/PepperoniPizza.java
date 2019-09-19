package com.epam.creational.abstractfactory.pizza.concrete;

import com.epam.creational.abstractfactory.pizza.NamePizza;
import com.epam.creational.abstractfactory.pizza.Pizza;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PepperoniPizza extends Pizza {
    private static final Logger LOG = LogManager.getLogger(PepperoniPizza.class);

    public PepperoniPizza() {
        this.name = NamePizza.PEPPERONI_PIZZA.toString();
    }

    @Override
    public void eat() {
        LOG.info("I am eating Pepperoni pizza...");
    }
}
