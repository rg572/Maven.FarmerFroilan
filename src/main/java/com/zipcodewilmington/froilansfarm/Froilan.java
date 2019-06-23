package com.zipcodewilmington.froilansfarm;

public class Froilan extends Person implements Farmer{
    private static Froilan ourInstance = new Froilan();
    private String name = "Froilan";



    public static Froilan getInstance() {
        return ourInstance;
    }

    private Froilan() {
    }

    public void eat(Edible edible) {

    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }

    @Override
    public String getName() {
        return name;
    }


    public void plant(Crop crop) {
        Field.getINSTANCE().getCropRows().get(crop.getName()).addCrop(crop);
    }
    public void plantMany(Crop crop, int howMany) {
        for (int i = 0; i < howMany; i++) plant(crop);
    }
}
