package com.zipcodewilmington.froilansfarm;

public class Froilan extends Person implements Farmer {
    private static Froilan ourInstance = new Froilan();


    public static Froilan getInstance() {
        return ourInstance;
    }

    protected Froilan() {
    }

    @Override
    public String makeNoise() {
        return "Write more fucking tests";
    }

    public String eat(Edible edible) {
        return "crunch";
    }

    public String mount(Rideable rideable) {
        rideable.setRider(Froilan.getInstance());
        return String.format("Froilan gets on the %s", rideable.getName());
    }

    public String dismount(Rideable rideable) {
        rideable.removeRider();
        return String.format("Froilan gets off the %s", rideable.getName());
    }

    @Override
    public String getName() {
        return "Froilan";
    }


    public void plant(Crop crop) {
        Field.getINSTANCE().getMap().get(crop.getName()).addCrop(crop);
    }

    public void plantMany(Crop crop, int howMany) {
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
}
