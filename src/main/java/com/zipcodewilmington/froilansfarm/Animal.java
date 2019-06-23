package com.zipcodewilmington.froilansfarm;

public abstract class Animal implements Eater, NoiseMaker {
    public abstract String makeNoise();
    public abstract String eat(Edible edible);



}
