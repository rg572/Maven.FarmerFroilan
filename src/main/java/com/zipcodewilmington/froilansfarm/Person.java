package com.zipcodewilmington.froilansfarm;

public abstract class Person  extends Animal implements NoiseMaker, Eater{
    public abstract String makeNoise();

    public abstract String eat(Edible edible);


}
