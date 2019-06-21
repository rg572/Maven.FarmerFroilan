package com.zipcodewilmington.froilansfarm;

public class CornStalk extends Crop {
    protected EarCorn earCorn;

    public Edible yield() {
        if (this.getReadyForHarvest()) {
            this.setHasBeenFertilized(false);
            this.setReadyForHarvest(false);
            return earCorn;
        } else {return null;}
    }
}
