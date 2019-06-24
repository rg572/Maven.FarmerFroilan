package com.zipcodewilmington.froilansfarm;

public class CornStalk extends Crop {


    public CornStalk(Boolean hasBeenFertilized, Boolean readyForHarvest) {
        super(hasBeenFertilized, readyForHarvest);
    }

    public CornStalk() {
        super(false, false);
    }

    public Edible yield() {
        if (this.getReadyForHarvest()) {
            this.setHasBeenFertilized(false);
            this.setReadyForHarvest(false);
            return Edible.EARCORN; } else {return null;}
    }

    @Override
    public String getName() {
        return "corn";
    }
}
