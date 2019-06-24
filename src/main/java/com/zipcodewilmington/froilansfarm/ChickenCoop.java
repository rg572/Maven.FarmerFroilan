package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class ChickenCoop extends AnimalStorage<Chicken>{
    ArrayList<Chicken> chickens = new ArrayList<>();

   public Integer find(Chicken chicken) {

        return chickens.indexOf(chicken);
    }

   public void remove(Chicken chicken) {
        chickens.remove(chicken);
    }

   public void add(Chicken chicken) {
        chickens.add(chicken);

    }

    public Chicken get(Integer index){
        return chickens.get(index);
    }

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }
}


