package com.zipcodewilmington.froilansfarm;

public abstract class Crop implements Produce{
    Boolean hasBeenFertilized;
    Boolean hasBeenHarvested;

    public abstract Edible yield(Crop crop);
    public abstract void isReadyToHarvest();
}
