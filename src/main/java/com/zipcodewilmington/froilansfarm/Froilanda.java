package com.zipcodewilmington.froilansfarm;

import java.util.List;

public class Froilanda extends Person implements Farmer, Pilot {
    public static Froilanda getInstance() {
        return Instance;
    }

    private final static Froilanda Instance= new Froilanda();


    public Froilanda() {
    }

    @Override
    public String makeNoise() {
        return "I'm sick of this shit.";
    }

    public String eat(Edible edible) {
        return "munch";
    }

    public String mount(Rideable rideable) {
        rideable.setRider(Froilanda.getInstance());
        return String.format("Froilanda gets on the %s", rideable.getName());
    }

    public String dismount(Rideable rideable) {
        rideable.removeRider();
        return String.format("Froilanda gets off the %s", rideable.getName());
    }

    @Override
    public String getName() {
        return "Froilanda";
    }

    public void plant(Crop crop) {
        Field.getINSTANCE().getMap().get(crop.getName()).addCrop(crop);
    }

    public void plant(Crop crop, int howMany) {
        for (int i = 0; i < howMany; i++) {
            try {
                plant(crop.getClass().newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String flyAircraft(Aircraft aircraft) {
        return String.format("Froilanda starts the %s to set off", aircraft.getName());
    }

    public String harvestEggs(Farm farm) {
        Refrigerator<Edible> fridge = farm.getHouse().getFridge();
        List<ChickenCoop> coops = farm.getCoops();
        for (ChickenCoop coop : coops) {
            List<Chicken> chickens = coop.getChickens();
            for (Chicken chicken : chickens) {
                fridge.add(chicken.yield());
            }
        }
        return "The hens happily yield their eggs to Froilanda";
    }
}
