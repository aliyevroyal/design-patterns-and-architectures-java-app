package com.thealiyev.introduction.football;

import java.util.ArrayList;

public class Player extends Person {
    public ArrayList<String> playedTeamsList;

    public void setPlayedTeamsList(ArrayList<String> playedTeamsList) {
        this.playedTeamsList = playedTeamsList;
    }

    public String shoot() {
        return "I can shoot averagely!";
    }
}
