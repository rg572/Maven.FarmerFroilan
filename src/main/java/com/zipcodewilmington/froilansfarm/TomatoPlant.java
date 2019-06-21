package com.zipcodewilmington.froilansfarm;

public class TomatoPlant extends Crop {
    protected Tomato tomato;

    public Edible yield() {
        if (this.getReadyForHarvest()) {
            this.setHasBeenFertilized(false);
            this.setReadyForHarvest(false);
            return tomato;
        } return null;
    }
}
