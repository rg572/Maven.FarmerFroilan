package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Silo extends Storage<Edible> {
    private static Silo ourInstance = new Silo();
    private ArrayList<Edible> food;

    public static Silo getInstance() {
        return ourInstance;
    }

    private Silo() {
        food = new ArrayList<>();
    }

    @Override
    void remove(Edible edible) {
        food.remove(edible);

    }

    @Override
    void add(Edible edible) {
        food.add(edible);
    }

    public ArrayList<Edible> getFood(){
        return food;
    }

}
