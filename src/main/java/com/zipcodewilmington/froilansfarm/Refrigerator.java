package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public  class Refrigerator<T extends Edible> extends Storage<T> {

    ArrayList<T> food = new ArrayList<>();

    public void cleanUp() {
    }

    public Integer find(T t) {
        return null;
    }

    public void remove(T t) {
    }

    public void add(T t) {
        food.add(t);

    }


    public Edible getNext(Edible edible){

        return null;

    }

}