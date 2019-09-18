package com.epam.creational.abstractfactory.factory;

import com.epam.creational.abstractfactory.pizza.NamePizza;
import com.epam.creational.abstractfactory.pizza.Pizza;
import com.epam.creational.abstractfactory.pizza.concrete.CheesePizza;
import com.epam.creational.abstractfactory.pizza.concrete.ClamPizza;
import com.epam.creational.abstractfactory.pizza.concrete.PepperoniPizza;
import com.epam.creational.abstractfactory.pizza.concrete.VeggiePizza;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public abstract class PizzaFactory {
    private static final Logger LOG = LogManager.getLogger(PizzaFactory.class);
    protected List nameAvailablePizzas;

    protected PizzaFactory() {
        setAllowedPizzas();
    }

    public Pizza createPizza(NamePizza name) {
        LOG.debug(String.format("Creating %s..", name));
        Pizza pizza = preparePizza(name);
        pizza = bakePizza(pizza);
        pizza = cutPizza(pizza);
        pizza = boxPizza(pizza);
        setPricePizza(pizza);
        return pizza;
    }

    private Pizza preparePizza(NamePizza namePizza) {
        LOG.debug(String.format("Preparing %s..", namePizza));
        if (isAllowedPizza(namePizza)) {
            switch (namePizza) {
                case CHEESE_PIZZA:
                    return new CheesePizza();
                case VEGGIE_PIZZA:
                    return new VeggiePizza();
                case CLAM_PIZZA:
                    return new ClamPizza();
                case PEPPERONI_PIZZA:
                    return new PepperoniPizza();
            }
        }
        throw new RuntimeException(getClass().getSimpleName() + " can't create " + namePizza);
    }

    protected abstract Pizza bakePizza(Pizza pizza);

    protected abstract Pizza cutPizza(Pizza pizza);

    protected abstract Pizza boxPizza(Pizza pizza);

    protected abstract void setPricePizza(Pizza pizza);

    protected abstract void setAllowedPizzas();

    private boolean isAllowedPizza(NamePizza pizza) {
        return nameAvailablePizzas.contains(pizza);
    }
}
