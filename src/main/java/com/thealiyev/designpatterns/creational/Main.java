package com.thealiyev.designpatterns.creational;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("Implementation of Singleton Creational Gof Design Pattern:");
        Singleton.getInstance().log();
    }
}
