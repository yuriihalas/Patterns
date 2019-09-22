package com.epam.structural.decorator.component;

public class BookGift implements Gift {
    private String name;

    public BookGift(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "Book with name: " + name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
