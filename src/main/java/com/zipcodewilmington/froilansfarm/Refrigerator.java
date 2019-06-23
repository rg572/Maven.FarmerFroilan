package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

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
        List<T> list = food;
        for(int i = 0; i < number; i++){
            if(list.size() == 0 || !list.contains(edible)){
                return false;
            }
            list = list.subList(1);
        }
        return true;
    }


    public Edible getNext(Edible edible){

        return null;

    }

}