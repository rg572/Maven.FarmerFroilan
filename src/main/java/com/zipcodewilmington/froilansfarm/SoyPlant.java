package com.zipcodewilmington.froilansfarm;

public class SoyPlant extends Crop {

    public SoyPlant(Boolean hasBeenFertilized, Boolean readyForHarvest) {
        super(hasBeenFertilized, readyForHarvest);
    }

    public SoyPlant() {
        super(false, false);
    }

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
