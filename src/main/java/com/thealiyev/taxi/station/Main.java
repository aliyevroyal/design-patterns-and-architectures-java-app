package com.thealiyev.taxi.station;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        TaxiDriver taxiDriver = new TaxiDriver();
        LOGGER.info("hey!");
    }
}
