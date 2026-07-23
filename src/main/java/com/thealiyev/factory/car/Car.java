package com.thealiyev.factory.car;

public abstract class Car {
    public double maxSpeed;
    public int theNumberOfGears;

    public Car(double maxSpeed, int theNumberOfGears) {
        this.maxSpeed = maxSpeed;
        this.theNumberOfGears = theNumberOfGears;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getTheNumberOfGears() {
        return theNumberOfGears;
    }

    public abstract String burnsFuel();
}
