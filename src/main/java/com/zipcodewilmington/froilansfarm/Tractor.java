package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public final class Tractor extends Vehicle implements FarmVehicle {

    public static Tractor getINSTANCE() {
        return INSTANCE;
    }

    private static final Tractor INSTANCE = new Tractor();

    private Rider rider;

    protected Tractor() {
    }

    public void harvest(Crop crop){
       Silo.getInstance().add(crop.yield());
    }

    public void operate() {
        HashMap<String, CropRow> cropRows = Field.getINSTANCE().getMap();
        for (CropRow cropRow : cropRows.values()) {
            ArrayList<Crop> cr = cropRow.getCropRow();
            for (Crop c : cr) {
                harvest(c);
            }
        }
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
        this.rider=rider;

    }

    public Rider getRider(){
        return rider;
    }

    @Override
    public void removeRider() {
     this.rider=null;
    }
}
