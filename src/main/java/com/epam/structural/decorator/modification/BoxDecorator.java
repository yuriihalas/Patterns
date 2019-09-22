package com.epam.structural.decorator.modification;

import com.epam.structural.decorator.component.Gift;

public class BoxDecorator extends GiftDecorator {
    public BoxDecorator(Gift gift) {
        super(gift);
    }

    @Override
    public String getName() {
        return super.getName() + " in box";
    }
}
