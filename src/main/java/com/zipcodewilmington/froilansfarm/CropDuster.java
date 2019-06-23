package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

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

    protected CropDuster() {
        rider = null;
    }

    public void operate() {
    }

     public void fertilize(){
        Collection<CropRow> cropRows = Field.getINSTANCE().getCropRows();
        for (CropRow cropRow : cropRows) {
            ArrayList<Crop> cr = cropRow.getCropRow();
            for (Crop crop : cr) crop.hasBeenFertilized = true;
        }
     }


    public String makeNoise() {
        return "PshhhPshhhPshhh";
    }

    public String fly() {
        return "Setting off into the air";
    }

    public static CropDuster getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public String getName() {
        return "crop duster";
    }
}
