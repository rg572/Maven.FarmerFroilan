package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FroilanTest {

    @Test
    public void makeNoise() {
        Froilan froilan = new Froilan();
        String actual = froilan.makeNoise();
        String expected = "Write more fucking tests";

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void getName() {
        Froilan froilan = new Froilan();
        String actual = froilan.getName();
        String expected = "Froilan";

        Assert.assertEquals(actual, expected);
    }


    @Test
    public void eat() {
        Froilan froilan = new Froilan();
        String actual = froilan.eat(Edible.POTATO);
        String expected = "crunch";

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void mount() {
        Froilan froilan = new Froilan();
        Horse horse = new Horse(1);
        String actual = froilan.mount(horse);
        String expected = "Froilan gets on the Horse 1";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void dismount() {
        Froilan froilan = new Froilan();
        Horse horse = new Horse(1);
        String actual = froilan.dismount(horse);
        String expected = "Froilan gets off the Horse 1";

        Assert.assertEquals(actual, expected);
    }


    @Test
    public void plantMany() {
        Froilan froilan = new Froilan();
        Crop crop = new TomatoPlant();
        froilan.plant(crop, 5);
    }
}
