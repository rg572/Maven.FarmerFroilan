package com.zipcodewilmington.froilansfarm;

public class SoyPlant extends Crop {
    protected Edamame edamame;

    public Edible yield() {
        if (this.getReadyForHarvest()) {
            this.setHasBeenFertilized(false);
            this.setReadyForHarvest(false);
            return edamame;
        } else {return null;}
    }
}
