package com.epam.creational.abstractfactory.drinks;

import java.math.BigDecimal;

public abstract class Drink {
    protected String name;
    protected BigDecimal price;
    protected Double capacityRemaining;
    protected Double totalCapacity;
    protected String color;

    public abstract void drink();

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

    public Double getCapacityRemaining() {
        return capacityRemaining;
    }

    public void setCapacityRemaining(Double capacityRemaining) {
        this.capacityRemaining = capacityRemaining;
    }

    public Double getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(Double totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
