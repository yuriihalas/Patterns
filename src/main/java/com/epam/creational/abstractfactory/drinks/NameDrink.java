package com.epam.creational.abstractfactory.drinks;

public enum NameDrink {
    COCA_COLA("Coca-cola"),
    JUICE("Juice"),
    WATER("Water");

    private final String nameDrink;

    NameDrink(String nameDrink) {
        this.nameDrink = nameDrink;
    }

    @Override
    public String toString() {
        return nameDrink;
    }
}
