package com.epam.creational.abstractfactory.config;

import com.epam.creational.abstractfactory.pizza.NamePizza;

import java.math.BigDecimal;

public enum DniproPizzaInfo {
    CLAM_PIZZA(NamePizza.CLAM_PIZZA, "71.66"),
    CHEESE_PIZZA(NamePizza.CHEESE_PIZZA, "79.55");

    private final NamePizza namePizza;
    private final BigDecimal pricePizza;

    DniproPizzaInfo(NamePizza namePizza, String pricePizza) {
        this.namePizza = namePizza;
        this.pricePizza = new BigDecimal(pricePizza);
    }

    public NamePizza getNamePizza() {
        return namePizza;
    }

    public BigDecimal getPricePizza() {
        return pricePizza;
    }
}
