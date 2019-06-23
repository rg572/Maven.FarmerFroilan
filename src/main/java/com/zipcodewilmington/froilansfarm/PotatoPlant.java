package com.zipcodewilmington.froilansfarm;

public class PotatoPlant extends Crop {
    protected Potato potato;

    public Edible yield() {
        if (this.getReadyForHarvest()) {
            this.setHasBeenFertilized(false);
            this.setReadyForHarvest(false);
            return potato;
        } else {return null;}
    }

    @Override
    public String getName() {
        return "potato";
    }
}
