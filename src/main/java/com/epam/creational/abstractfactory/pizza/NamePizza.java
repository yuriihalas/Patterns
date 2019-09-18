package com.epam.creational.abstractfactory.pizza;

public enum NamePizza {
    CHEESE_PIZZA("Cheese pizza"),
    VEGGIE_PIZZA("Veggie pizza"),
    CLAM_PIZZA("Clam pizza"),
    PEPPERONI_PIZZA("Pepperoni pizza");

    private final String name;

    NamePizza(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
