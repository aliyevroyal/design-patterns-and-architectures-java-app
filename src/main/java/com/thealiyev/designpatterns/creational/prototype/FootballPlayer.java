package com.thealiyev.designpatterns.creational.prototype;

public class FootballPlayer implements IPrototype {
    private String name;
    private int age;
    private String team;

    public FootballPlayer(String name, int age, String team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    @Override
    public FootballPlayer getClone() {
        return new FootballPlayer(name, age, team);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTeam() {
        return team;
    }
}
