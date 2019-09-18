package com.epam.creational.abstractfactory.config;

import com.epam.creational.abstractfactory.pizza.NamePizza;

import java.math.BigDecimal;

public enum KyivPizzaInfo {
    CHEESE_PIZZA(NamePizza.CHEESE_PIZZA, "85.99"),
    VEGGIE_PIZZA(NamePizza.VEGGIE_PIZZA, "90.49"),
    CLAM_PIZZA(NamePizza.CLAM_PIZZA, "109.00"),
    PEPPERONI_PIZZA(NamePizza.PEPPERONI_PIZZA, "88.99");

    private final NamePizza namePizza;
    private final BigDecimal pricePizza;

    KyivPizzaInfo(NamePizza namePizza, String pricePizza) {
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
