package com.thealiyev.designpatterns.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        FootballPlayer footballPlayer = new FootballPlayer("royal", 31, "baku");
        FootballPlayer getFootballPlayer1 = footballPlayer.getClone();

        LOGGER.info(getFootballPlayer1.getName());
    }
}
