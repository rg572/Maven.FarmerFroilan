package com.zipcodewilmington.froilansfarm;

public abstract class Crop implements Produce{
    Boolean hasBeenFertilized;
    Boolean hasBeenHarvested;

    public abstract void isReadyToHarvest();
}
