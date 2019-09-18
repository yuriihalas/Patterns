package com.epam.creational.abstractfactory.drinks.concrete;

import com.epam.creational.abstractfactory.drinks.Drink;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;

public class Water extends Drink {
    private static final Logger LOG = LogManager.getLogger(Water.class);
    private static final double DRINK_PER_SIP = 10.;

    public Water() {
        this.name = "Water";
        this.price = new BigDecimal("23.33");
        this.capacityRemaining = 100.;
        this.totalCapacity = 100.;
        this.color = "White";
    }

    @Override
    public void drink() {
        if (this.capacityRemaining >= DRINK_PER_SIP) {
            LOG.info("Drunk: " + DRINK_PER_SIP);
            this.capacityRemaining -= 10;
        } else {
            LOG.info("Drunk: " + this.capacityRemaining);
            this.capacityRemaining = 0.;
        }
        LOG.info("Current capacity remaining: " + this.capacityRemaining);
    }
}
