package com.zipcodewilmington.froilansfarm;

public class Froilanda extends Person implements Farmer, Pilot {
    public static Froilanda getInstance() {
        return Instance;
    }

    private final static Froilanda Instance= new Froilanda();
    private String name = "Foilanda";

    private Froilanda() {
    }

    public void eat(Edible edible) {

    }

    public void mount(Rideable rideable) {
        rideable.setRider(Froilanda.getInstance());
    }

    public void dismount(Rideable rideable) {
        rideable.removeRider();
    }

    @Override
    public String getName() {
        return name;
    }

    public void plant(Crop crop) {
        Field.getINSTANCE().getCropRows().get(crop.getName()).addCrop(crop);
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

    @Override
    public void flyAircraft() {
    }
}
