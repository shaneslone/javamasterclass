package com.udemy.jmc.section7;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The " + this.getClass().getSimpleName() + " engine is starting.";
    }

    @Override
    public String accelerate() {
        return "The " + this.getClass().getSimpleName() + " is accelerating.";
    }

    @Override
    public String brake() {
        return "The " + this.getClass().getSimpleName() + " card is braking.";
    }
}
