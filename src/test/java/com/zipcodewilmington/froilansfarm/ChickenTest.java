package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static com.zipcodewilmington.froilansfarm.Edible.EGG;
import static org.junit.Assert.*;

public class ChickenTest {

    @Test
    public void yield() {
        Chicken chicken = new Chicken(1);
        Edible actual = chicken.yield();
        Edible expected = EGG;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getName(){
        Chicken chicken = new Chicken(1);
        chicken.setName("Kurochka");
        String expected ="Kurochka";
        String actual = chicken.getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setName(){
        Chicken chicken = new Chicken(2);
        chicken.setName("Name");
        chicken.setName("Chicken");
        String expected = "Chicken";
        String actual = chicken.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeNoise(){
        Chicken chicken = new Chicken(2);

        String expected =  "Bawk";
        String actual =  chicken.makeNoise();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void eat(){
        Chicken chicken = new Chicken(2);

        String expected = "peckpeckpeck";
        String actual = chicken.eat(Edible.TOMATO);

        Assert.assertEquals(expected, actual);



    }
}