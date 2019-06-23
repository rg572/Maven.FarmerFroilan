package com.zipcodewilmington.froilansfarm;

public class PotatoPlant extends Crop {


    public Edible yield() {
        if (this.getReadyForHarvest()) {
            this.setHasBeenFertilized(false);
            this.setReadyForHarvest(false);
            return Edible.POTATO;
        } else {return null;}
    }

    @Override
    public String getName() {
        return "potato";
    }
}
