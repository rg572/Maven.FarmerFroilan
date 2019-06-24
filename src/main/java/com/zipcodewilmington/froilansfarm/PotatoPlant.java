package com.zipcodewilmington.froilansfarm;

public class PotatoPlant extends Crop {


    public PotatoPlant(Boolean hasBeenFertilized, Boolean readyForHarvest) {
        super(hasBeenFertilized, readyForHarvest);
    }

    public PotatoPlant() {
        this(false,false);
    }

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
