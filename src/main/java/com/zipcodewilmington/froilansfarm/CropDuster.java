package com.zipcodewilmington.froilansfarm;

public final class CropDuster extends Aircraft implements FarmVehicle{

    private static final CropDuster INSTANCE = new CropDuster();

    private Pilot rider;

    public void setRider(Rider rider) {
        this.rider = (Pilot)rider;
    }

    @Override
    public void removeRider() {
        this.rider = null;
    }

    private CropDuster() {
    }

    public void operate() {
    }

    public void fertilize(){
    }

    public String makeNoise() {
        return "PshhhPshhhPshhh";
    }

    public void fly() {

    }
    public static CropDuster getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public String getName() {
        return "crop duster";
    }
}
