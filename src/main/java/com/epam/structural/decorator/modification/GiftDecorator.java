package com.epam.structural.decorator.modification;

import com.epam.structural.decorator.component.Gift;

public class GiftDecorator implements Gift {
    private Gift gift;

    public GiftDecorator(Gift gift) {
        this.gift = gift;
    }

    @Override
    public String getName() {
        return gift.getName();
    }
}
