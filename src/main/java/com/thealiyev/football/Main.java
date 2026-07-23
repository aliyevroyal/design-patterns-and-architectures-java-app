package com.thealiyev.football;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Player player = new Player();

        player.setFirstName("Royal");
        player.setLastName("Aliyev");

        player.setGender(false);
        ArrayList<String> playedTeamsList = new ArrayList<>();
        playedTeamsList.add("Galatasaray");
        playedTeamsList.add("Fenerbahce");
        playedTeamsList.add("Besiktas");

        player.setPlayedTeamsList(playedTeamsList);
        LOGGER.info(player.breath());
        LOGGER.info(player.shoot());

        ForwardPlayer forwardPlayer = new ForwardPlayer();
        LOGGER.info(forwardPlayer.shoot());

        DefensivePlayer defensivePlayer = new DefensivePlayer();
        LOGGER.info(defensivePlayer.shoot());

        Person person = new Person();
        person.setBirthday(LocalDate.of(1995, 8, 14));
        LOGGER.info(String.valueOf(person.getAge()));
    }
}
