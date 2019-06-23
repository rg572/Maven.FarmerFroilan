package com.zipcodewilmington.froilansfarm;

public class Froilan implements Farmer{
    private static Froilan ourInstance = new Froilan();

    public static Froilan getInstance() {
        return ourInstance;
    }

    private Froilan() {
    }

    public void eat(Edible edible) {

    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }

    public void plant(Crop crop) {

    }
}
