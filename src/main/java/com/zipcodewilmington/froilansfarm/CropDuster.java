package com.zipcodewilmington.froilansfarm;

public class CropDuster extends Aircraft implements FarmVehicle{
    public void operate() {
    }

     public void fertilize(CropRow cropRow){
     }

    public String makeNoise() {
        return "PshhhPshhhPshhh";
    }

    public void fly() {

    }

    @Override
    public String getName() {
        return "CropDuster";
    }
}
