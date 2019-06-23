package com.zipcodewilmington.froilansfarm;

import static com.zipcodewilmington.froilansfarm.Edible.EGG;

public class Chicken extends Animal implements Produce {
    private Boolean hasBeenFertilized = false;
    private String name;

    public Edible yield() {
        if (!hasBeenFertilized){
            return EGG;
        }return null;
    }


    public Chicken(Integer number){
        name = "Chicken " + number.toString();
    }

    public String getName(){
        return name;
    }
}
