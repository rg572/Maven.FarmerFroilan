package com.zipcodewilmington.froilansfarm;

public  final class FarmHouse  extends House {
    public static FarmHouse getInstance() {
        return Instance;
    }

    private final static FarmHouse Instance= new FarmHouse();

    private FarmHouse() {
    }


}
