package com.zipcodewilmington.froilansfarm;

public  final class FarmHouse  extends House {

    private final static FarmHouse Instance= new FarmHouse();
    private Refrigerator<Edible> fridge;

    private FarmHouse() {
    }

    public static FarmHouse getInstance() {
        return Instance;
    }


}
