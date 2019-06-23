package com.zipcodewilmington.froilansfarm;

public interface Eater {

    default public void eat(Edible edible){
        System.out.println(this.getClass().getSimpleName() + " ate a " + edible.getClass().getSimpleName());
    }
}
