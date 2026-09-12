package com.thealiyev.designpatterns.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("Facade Design Pattern Main class starts working!");

        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("Laptop", 1500);
    }
}
