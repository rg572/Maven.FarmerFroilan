package com.zipcodewilmington.froilansfarm;

public final class CombineHarvester extends Vehicle implements FarmVehicle {
    private static final CombineHarvester INSTANCE = new CombineHarvester();
    private Rider rider;

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
