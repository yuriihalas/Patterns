package com.epam.structural.decorator;

import com.epam.structural.decorator.component.BookGift;
import com.epam.structural.decorator.component.Gift;
import com.epam.structural.decorator.component.ToyElephantGift;
import com.epam.structural.decorator.modification.BoxDecorator;
import com.epam.structural.decorator.modification.RibbonDecorator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunnerDecorator {
    private static final Logger LOG = LogManager.getLogger(RunnerDecorator.class);

    public static void main(String[] args) {
        Gift gift = new BookGift("Alchemist");
        LOG.info(gift.getName());

        Gift giftInBox = new BoxDecorator(gift);
        LOG.info(giftInBox.getName());

        Gift giftRibbon = new RibbonDecorator(giftInBox);
        LOG.info(giftRibbon.getName());


        Gift giftToy = new ToyElephantGift("Johnny");
        LOG.info(giftToy.getName());

        Gift giftInBoxToy = new BoxDecorator(giftToy);
        LOG.info(giftInBoxToy.getName());

        Gift giftRibbonRot = new RibbonDecorator(giftInBoxToy);
        LOG.info(giftRibbonRot.getName());
    }
}
