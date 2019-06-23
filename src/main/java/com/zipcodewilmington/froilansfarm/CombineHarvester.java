package com.zipcodewilmington.froilansfarm;

public final class CombineHarvester extends Vehicle implements FarmVehicle {
    private static final CombineHarvester INSTANCE = new CombineHarvester();

    public CombineHarvester() {
    }

    public void operate() {

    }

    public String makeNoise() {
        return "Whirrrr.....";
    }

    public void harvest() {

    }

    @Override
    public String getName() {
        return null;
    }
}
