package com.epam.structural.decorator.component;

public class ToyElephantGift implements Gift {
    private String name;

    public ToyElephantGift(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "Toy elephant with name: " + name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
