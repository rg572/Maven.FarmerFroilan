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
        food.remove(t);
    }

    public void remove(T t, Integer number){
        for(int i = 0; i < number; i++){
            food.remove(t);
        }
    }

    public void add(T t) {
        food.add(t);

    }

    public Boolean contains(T edible, Integer number){

        Integer index = 0;
        for(int i = 0; i < number; i++){
            if(!food.subList(index, food.size()-1).contains(edible)){
                return false;
            }
            index = food.indexOf(edible);
        }
        return true;
    }


    public Edible getNext(Edible edible){

        return null;

    }

}