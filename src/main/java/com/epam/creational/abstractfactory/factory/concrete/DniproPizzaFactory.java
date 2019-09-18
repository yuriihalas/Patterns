package com.epam.creational.abstractfactory.factory.concrete;

import com.epam.creational.abstractfactory.config.DniproPizzaInfo;
import com.epam.creational.abstractfactory.factory.PizzaFactory;
import com.epam.creational.abstractfactory.pizza.Pizza;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.Collectors;

public class DniproPizzaFactory extends PizzaFactory {
    private static final Logger LOG = LogManager.getLogger(DniproPizzaFactory.class);

    @Override
    protected Pizza bakePizza(Pizza pizza) {
        LOG.debug(String.format("Baking %s in Dnipro", pizza.getName()));
        return pizza;
    }

    @Override
    protected Pizza cutPizza(Pizza pizza) {
        LOG.debug(String.format("Cutting %s in Dnipro", pizza.getName()));
        return pizza;
    }

    @Override
    protected Pizza boxPizza(Pizza pizza) {
        LOG.debug(String.format("Boxing %s in Dnipro", pizza.getName()));
        return pizza;
    }

    @Override
    protected void setPricePizza(Pizza pizza) {
        BigDecimal price = Arrays.stream(DniproPizzaInfo.values()).filter(v -> v.getNamePizza().toString().equals(pizza.getName())).findFirst().get().getPricePizza();
        pizza.setPrice(price);
    }

    @Override
    protected void setAllowedPizzas() {
        super.nameAvailablePizzas = Arrays.stream(DniproPizzaInfo.values()).map(DniproPizzaInfo::getNamePizza).collect(Collectors.toList());
    }
}
