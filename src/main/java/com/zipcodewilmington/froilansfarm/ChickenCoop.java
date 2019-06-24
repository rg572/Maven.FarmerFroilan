package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class ChickenCoop extends AnimalStorage<Chicken>{
    ArrayList<Chicken> chickens = new ArrayList<>();


   public void remove(Chicken chicken) {
        chickens.remove(chicken);
    }

   public void add(Chicken chicken) {
        chickens.add(chicken);

    }


    public ArrayList<Chicken> getChickens() {
        return chickens;
    }
}


