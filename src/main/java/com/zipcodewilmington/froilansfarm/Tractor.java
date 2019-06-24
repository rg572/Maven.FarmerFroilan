package com.zipcodewilmington.froilansfarm;

import java.util.Collection;
import java.util.HashMap;

public final class Tractor extends Vehicle implements FarmVehicle {

    public static Tractor getINSTANCE() {
        return INSTANCE;
    }

    private static final Tractor INSTANCE = new Tractor();

    private Tractor() {

    }

    public void harvest(Crop crop){
       CropRow<Crop> cropRow = Field.getINSTANCE().getMap().get("crop");
       for (Crop c : cropRow.getCropRow()) {
           Silo.getInstance().add(c.yield());
       }
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
