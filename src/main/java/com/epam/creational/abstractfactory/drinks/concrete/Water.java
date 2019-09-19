package com.epam.creational.abstractfactory.drinks.concrete;

import com.epam.creational.abstractfactory.drinks.Drink;
import com.epam.creational.abstractfactory.drinks.NameDrink;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Water implements Drink {
    private static final Logger LOG = LogManager.getLogger(Water.class);
    private static final double DRINK_PER_SIP = 10.;

    private String name;
    private Double capacityRemaining;
    private Double totalCapacity;

    public Water() {
        this.name = NameDrink.WATER.toString();
        this.totalCapacity = 100.;
        this.capacityRemaining = this.totalCapacity;
    }

    public void drink() {
        if (this.capacityRemaining >= DRINK_PER_SIP) {
            LOG.info(String.format("Drunk %s: %.2f", this.name, DRINK_PER_SIP));
            this.capacityRemaining -= DRINK_PER_SIP;
        } else {
            LOG.info(String.format("Drunk %s: %.2f", this.name, capacityRemaining));
            this.capacityRemaining = 0.;
        }
        LOG.info(String.format("Current capacity remaining in %s: %.2f", this.name, this.capacityRemaining));
    }

    @Override
    public void getInfoDrink() {
        LOG.info(this::toString);
    }

    @Override
    public String toString() {
        return "Water{" +
            "name='" + name + '\'' +
            ", capacityRemaining=" + capacityRemaining +
            ", totalCapacity=" + totalCapacity +
            '}';
    }
}
