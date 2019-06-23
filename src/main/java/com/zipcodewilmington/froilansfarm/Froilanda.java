package com.zipcodewilmington.froilansfarm;

public class Froilanda extends Person implements Farmer, Pilot {
    public static Froilanda getInstance() {
        return Instance;
    }

    private final static Froilanda Instance= new Froilanda();
    private String name = "Foilanda";

    private Froilanda() {
    }

    public void eat(Edible edible) {

    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }

    @Override
    public String getName() {
        return name;
    }

    public void plant(Crop crop) {

    }

    @Override
    public void flyAircraft() {
    }
}
