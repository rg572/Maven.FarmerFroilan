package com.zipcodewilmington.froilansfarm;

public interface Farmer extends Rider, Botanist, Eater {

    public String eat(Edible edible);

    public String mount(Rideable rideable);

    public String dismount(Rideable rideable);
}
