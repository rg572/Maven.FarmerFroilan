package com.zipcodewilmington.froilansfarm;

public abstract class Crop implements Produce{
    Boolean hasBeenFertilized;
    Boolean readyForHarvest;

    public Crop(Boolean hasBeenFertilized, Boolean readyForHarvest) {
        this.hasBeenFertilized = true;
        this.readyForHarvest = true;
    }


    public Boolean getHasBeenFertilized() { return hasBeenFertilized; }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Boolean getReadyForHarvest() {
        return readyForHarvest;
    }

    public void setReadyForHarvest(Boolean hasBeenHarvested) {
        this.readyForHarvest = hasBeenHarvested;
    }

    public abstract String getName();

}
