package com.zipcodewilmington.froilansfarm;

public class CornStalk extends Crop {

    public Edible yield() {
        if (this.getReadyForHarvest()) {
            this.setHasBeenFertilized(false);
            this.setReadyForHarvest(false);
            return Edible.EARCORN; } else {return null;}
    }
}
