package com.thealiyev.designpatterns.creational.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        FootballPlayer player = new FootballPlayer.Builder()
                .name("Messi")
                .age(39)
                .team("Inter Miami")
                .position("Forward")
                .number(10)
                .build();

        LOGGER.info(player.getName());
    }
}
