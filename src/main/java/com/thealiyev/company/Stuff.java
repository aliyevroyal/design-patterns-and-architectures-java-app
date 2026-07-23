package com.thealiyev.company;

public class Stuff {
    private String name;
    private double salary;
    private boolean gotSalary;
    private Head head;

    public Stuff(String name, double salary, Head head) {
        this.name = name;
        this.salary = salary;
        this.head = head;
    }

    public String work() {
        return "I do work!";
    }
}
