package com.epam.creational.abstractfactory.config;

import com.epam.creational.abstractfactory.pizza.NamePizza;

import java.math.BigDecimal;

public enum LvivPizzaInfo {
    CLAM_PIZZA(NamePizza.CLAM_PIZZA, "99.99"),
    PEPPERONI_PIZZA(NamePizza.PEPPERONI_PIZZA, "87.41");

    private final NamePizza namePizza;
    private final BigDecimal pricePizza;

    LvivPizzaInfo(NamePizza namePizza, String pricePizza) {
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
