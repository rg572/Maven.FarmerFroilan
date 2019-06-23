package com.zipcodewilmington.froilansfarm;

public final class CropDuster extends Aircraft implements FarmVehicle{

    private static final CropDuster INSTANCE = new CropDuster();

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
