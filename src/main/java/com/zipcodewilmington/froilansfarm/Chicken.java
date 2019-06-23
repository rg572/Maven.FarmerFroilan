package com.zipcodewilmington.froilansfarm;

import static com.zipcodewilmington.froilansfarm.Edible.EGG;

public class Chicken extends Animal implements Produce {
    private Boolean hasBeenFertilized = false;

    public Edible yield() {
        if (!hasBeenFertilized){
            return EGG;
        }return null;
    }
}
