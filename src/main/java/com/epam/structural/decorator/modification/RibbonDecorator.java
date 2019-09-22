package com.epam.structural.decorator.modification;

import com.epam.structural.decorator.component.Gift;

public class RibbonDecorator extends GiftDecorator {
    public RibbonDecorator(Gift gift) {
        super(gift);
    }

    @Override
    public String getName() {
        return super.getName() + " ribboned";
    }
}
