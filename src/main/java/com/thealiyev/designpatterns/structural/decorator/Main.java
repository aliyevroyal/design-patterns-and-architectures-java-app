package com.thealiyev.designpatterns.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("Decorator Design Pattern Main class starts working!");

        Coffee coffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));

        LOGGER.info(coffee.getDescription() + " and price is " + coffee.getCost() + "azn!");
    }
}
