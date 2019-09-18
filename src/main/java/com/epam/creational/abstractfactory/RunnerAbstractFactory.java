package com.epam.creational.abstractfactory;

import com.epam.creational.abstractfactory.factory.PizzaFactory;
import com.epam.creational.abstractfactory.factory.concrete.DniproPizzaFactory;
import com.epam.creational.abstractfactory.factory.concrete.KyivPizzaFactory;
import com.epam.creational.abstractfactory.factory.concrete.LvivPizzaFactory;
import com.epam.creational.abstractfactory.pizza.NamePizza;
import com.epam.creational.abstractfactory.pizza.Pizza;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunnerAbstractFactory {
    private static final Logger LOG = LogManager.getLogger(RunnerAbstractFactory.class);

    public static void main(String[] args) {
        LOG.info("***********LVIV****************");
        PizzaFactory lvivPizzaFactory = new LvivPizzaFactory();
        Pizza lvivPizza = lvivPizzaFactory.createPizza(NamePizza.CLAM_PIZZA);

        LOG.info("Created pizzas: " + lvivPizza.getName());
        LOG.info("With price: " + lvivPizza.getPrice());
        lvivPizza.eat();


        LOG.info("***********KYIV****************");
        PizzaFactory kyivPizzaFactory = new KyivPizzaFactory();
        Pizza kyivPizza = kyivPizzaFactory.createPizza(NamePizza.CHEESE_PIZZA);

        LOG.info("Created pizzas: " + kyivPizza.getName());
        LOG.info("With price: " + kyivPizza.getPrice());
        kyivPizza.eat();


        LOG.info("***********DNIPRO****************");
        PizzaFactory dniproPizzaFactory = new DniproPizzaFactory();
        Pizza dniproPizza = dniproPizzaFactory.createPizza(NamePizza.CHEESE_PIZZA);

        LOG.info("Created pizzas: " + dniproPizza.getName());
        LOG.info("With price: " + dniproPizza.getPrice());
        dniproPizza.eat();
    }
}
