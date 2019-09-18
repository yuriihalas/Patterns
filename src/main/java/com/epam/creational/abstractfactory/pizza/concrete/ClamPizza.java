package com.epam.creational.abstractfactory.pizza.concrete;

import com.epam.creational.abstractfactory.pizza.NamePizza;
import com.epam.creational.abstractfactory.pizza.Pizza;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClamPizza extends Pizza {
    private static final Logger LOG = LogManager.getLogger();

    public ClamPizza() {
        setName(NamePizza.CLAM_PIZZA.toString());
    }

    @Override
    public void eat() {
        LOG.info("I am eating Clam pizza..");
    }
}
