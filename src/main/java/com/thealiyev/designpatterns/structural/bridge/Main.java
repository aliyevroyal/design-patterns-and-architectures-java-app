package com.thealiyev.designpatterns.structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("Bridge Design Pattern Main class starts working!");

        Shape square = new Square(new Red());
        LOGGER.info(square.draw());

        Shape triangle = new Triangle(new Blue());
        LOGGER.info(triangle.draw());
    }
}
