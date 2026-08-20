package com.thealiyev.designpatterns.creational.builder;

public class FootballPlayer {
    private String name;
    private int age;
    private String team;
    private String position;
    private int number;

    public FootballPlayer(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.team = builder.team;
        this.position = builder.position;
        this.number = builder.number;
    }

    public static class Builder {
        private String name;
        private int age;
        private String team;
        private String position;
        private int number;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder team(String team) {
            this.team = team;
            return this;
        }

        public Builder position(String position) {
            this.position = position;
            return this;
        }

        public Builder number(int number) {
            this.number = number;
            return this;
        }

        public FootballPlayer build() {
            return new FootballPlayer(this);
        }
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

    public String getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }
}
