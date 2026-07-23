package com.thealiyev.factory.car;

public class BMW extends Car {
    public BMW(double maxSpeed, int theNumberOfGears) {
        super(maxSpeed, theNumberOfGears);
    }

    @Override
    public String burnsFuel() {
        return "I burn less fuel!";
    }
}
