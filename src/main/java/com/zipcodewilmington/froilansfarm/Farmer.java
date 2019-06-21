package com.zipcodewilmington.froilansfarm;

public interface Farmer extends Rider, Botanist, Eater {

    public void eat(Edible edible);

    public void mount(Rideable rideable);

    public void dismount(Rideable rideable);
}
