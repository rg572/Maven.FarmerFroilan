package com.zipcodewilmington.froilansfarm;

public class Person  extends Animal implements NoiseMaker, Eater{
    public String makeNoise() {
        return "Generic Person noise";
    }

    public void eat(Edible edible) {

    }
}
