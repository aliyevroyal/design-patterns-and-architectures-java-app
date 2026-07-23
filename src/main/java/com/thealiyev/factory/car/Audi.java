package com.thealiyev.factory.car;

public class Audi extends Car implements ICoolDownable, Retractable {
    public Audi(double maxSpeed, int theNumberOfGears) {
        super(maxSpeed, theNumberOfGears);
    }

    @Override
    public String burnsFuel() {
        return "I burn a lot of fuel!";
    }

    @Override
    public String retractTheRoof() {
        return "I can retract the roof part completely but BMW can't!";
    }

    @Override
    public String turnOnAirConditioner() {
        return "I can cool you down using my air conditioner!";
    }
}
