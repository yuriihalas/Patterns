package com.epam.creational.abstractfactory.drink.concrete;

import com.epam.creational.abstractfactory.drink.Drink;
import com.epam.creational.abstractfactory.drink.NameDrink;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;

public class Juice implements Drink {
    private static final Logger LOG = LogManager.getLogger(Juice.class);
    private static final double DRINK_PER_SIP = 9.;

    private String name;
    private BigDecimal price;
    private Double capacityRemaining;
    private Double totalCapacity;
    private String color;

    public Juice() {
        this.name = NameDrink.JUICE.toString();
        this.price = new BigDecimal("29.99");
        this.totalCapacity = 80.;
        this.capacityRemaining = this.totalCapacity;
        this.color = "Orange";
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
            ", price=" + price +
            ", capacityRemaining=" + capacityRemaining +
            ", totalCapacity=" + totalCapacity +
            ", color='" + color + '\'' +
            '}';
    }
}
