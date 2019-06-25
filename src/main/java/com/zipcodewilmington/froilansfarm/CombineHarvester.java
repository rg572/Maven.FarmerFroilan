package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.Collection;

public final class CombineHarvester extends Vehicle implements FarmVehicle {
    public static CombineHarvester getINSTANCE() {
        return INSTANCE;
    }

    private static final CombineHarvester INSTANCE = new CombineHarvester();
    private Rider rider;

    public CombineHarvester() {
    }

    public void operate() {
        Field field = Field.getINSTANCE();
        Collection<CropRow> cropRows = field.getCropRows();
        for (CropRow cropRow : cropRows) {
            ArrayList<Crop> cr = cropRow.getCropRow();
            for (Crop crop : cr) {
                harvest(crop);
                cr.remove(crop);
            }
        }
    }

    public String makeNoise() {
        return "Whirrrr.....";
    }

    public void harvest(Crop crop) {
        Silo.getInstance().add(crop.yield());
    }

    @Override
    public String getName() {
        return "Combine Harvester";
    }

    @Override
    public void setRider(Rider rider) {
        if (rider != null) ;
        this.rider = rider;

    }

    public Rider getRider(){
        return rider;
    }

    @Override
    public void removeRider() {
        if (rider == null) ;
        this.rider = null;

    }
}
