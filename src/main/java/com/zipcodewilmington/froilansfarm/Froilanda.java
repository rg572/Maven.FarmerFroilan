package com.zipcodewilmington.froilansfarm;

public class Froilanda implements Farmer, Pilot {

    private Rideable thingRidden;

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
        if(thingRidden instanceof  Aircraft){
            Aircraft aircraft = (Aircraft)thingRidden;
            aircraft.fly();
        }
    }
}
