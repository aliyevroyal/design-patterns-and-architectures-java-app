package com.thealiyev.company;

import java.util.ArrayList;

public class Head extends Stuff {
    private ArrayList<Stuff> stuff;
    private boolean didBossPaidSalaries;
    private double sumOfMustBePaidSalaries;

    public Head(String name, double salary, Head head, ArrayList<Stuff> stuff, boolean didBossPaidSalaries, double sumOfMustBePaidSalaries) {
        super(name, salary, head);
        this.stuff = stuff;
        this.didBossPaidSalaries = didBossPaidSalaries;
        this.sumOfMustBePaidSalaries = sumOfMustBePaidSalaries;
    }
}
