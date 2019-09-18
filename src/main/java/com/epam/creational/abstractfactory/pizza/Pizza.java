package com.epam.creational.abstractfactory.pizza;

import java.math.BigDecimal;

public abstract class Pizza {
    private String name;
    private BigDecimal price;

    protected Pizza() {
        price = new BigDecimal("0.0");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public abstract void eat();
}
