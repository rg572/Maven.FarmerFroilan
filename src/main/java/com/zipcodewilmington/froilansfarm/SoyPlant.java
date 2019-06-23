package com.zipcodewilmington.froilansfarm;

public class SoyPlant extends Crop {

    public Edible yield() {
        if (this.getReadyForHarvest()) {
            this.setHasBeenFertilized(false);
            this.setReadyForHarvest(false);
            return Edible.EDAMAME;
        } else {return null;}
    }

    @Override
    public String getName() {
        return "soy";
    }
}
