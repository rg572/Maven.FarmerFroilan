package com.zipcodewilmington.froilansfarm;

public final class Tractor extends Vehicle implements FarmVehicle {

    public static Tractor getINSTANCE() {
        return INSTANCE;
    }

    private static final Tractor INSTANCE = new Tractor();

    protected Tractor() {
    }

    public void harvest(Crop crop){

    }

    public void operate() {

    }

    public String makeNoise() {
        return "Purrrrrrr";
    }

    @Override
    public String getName() {
        return "Tractor";
    }

    @Override
    public void setRider(Rider rider) {

    }

    @Override
    public void removeRider() {

    }
}
