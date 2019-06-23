package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Stable extends AnimalStorage<Horse> {

    ArrayList<Horse> horses;

    public void cleanUp() {
    }

    public Integer find(Horse horse) {
        return horses.indexOf(horse);
    }

    public void remove(Horse horse) {
        horses.remove(horse);
    }

    public void add(Horse horse){
        horses.add(horse);
    }

    public Horse get(Integer index){
        return horses.get(index);
    }

    public ArrayList<Horse> getHorses(){
        return horses;
    }
}
