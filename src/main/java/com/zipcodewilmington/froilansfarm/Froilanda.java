package com.zipcodewilmington.froilansfarm;

public class Froilanda implements Farmer, Pilot {
    public static Froilanda getInstance() {
        return Instance;
    }

    private final static Froilanda Instance= new Froilanda();

    private Froilanda() {
    }

    public void eat(Edible edible) {

    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }

    public void plant(Crop crop) {

    }

    @Override
    public void flyAircraft() {
    }
}
