package com.zipcodewilmington.froilansfarm;

import static com.zipcodewilmington.froilansfarm.Edible.EGG;

public class Chicken extends Animal implements Produce {
    private Boolean hasBeenFertilized = false;
    private String name;

    public Chicken(Boolean hasBeenFertilized, String name) {
        this.hasBeenFertilized = false;
        this.name = "Henny Hen Hen";
    }

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

    public void setName(String name){
        this.name=name;
    }

    @Override
    public String makeNoise() {
        return "Bawk";
    }

    @Override
    public String eat(Edible edible) {
        return "peckpeckpeck";
    }
}
