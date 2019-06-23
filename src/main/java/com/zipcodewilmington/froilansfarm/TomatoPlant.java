package com.zipcodewilmington.froilansfarm;

public class TomatoPlant extends Crop {


    public Edible yield() {
        if (this.getReadyForHarvest()) {
            this.setHasBeenFertilized(false);
            this.setReadyForHarvest(false);
            return Edible.TOMATO;
        } return null;
    }
}
