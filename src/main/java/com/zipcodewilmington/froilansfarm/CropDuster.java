package com.zipcodewilmington.froilansfarm;

public class CropDuster extends Aircraft implements FarmVehicle{

    private Boolean isFlying = false;
    public void operate() {
    }

     public void fertilize(CropRow cropRow){
     }

    public String makeNoise() {
        return "PshhhPshhhPshhh";
    }

    public void fly() {
        isFlying = true;

    }

    @Override
    public void land() {
        isFlying = false;
    }
}
