package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;


public class FroilandaTest {

    @Test
    public void makeNoise() {
        Froilanda froilanda = new Froilanda();
        String actual = froilanda.makeNoise();
        String expected = "I'm sick of this shit.";

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void getName() {
        Froilanda froilanda = new Froilanda();
        String actual = froilanda.getName();
        String expected = "Froilanda";

        Assert.assertEquals(actual, expected);
    }


    @Test
    public void eat() {
        Froilanda froilanda = new Froilanda();
        String actual = froilanda.eat(Edible.POTATO);
        String expected = "munch";

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void mount() {
        Froilanda froilanda = new Froilanda();
        Horse horse = new Horse(1);
        String actual = froilanda.mount(horse);
        String expected = "Froilanda gets on the Horse 1";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void dismount() {
        Froilanda froilanda = new Froilanda();
        Horse horse = new Horse(1);
        String actual = froilanda.dismount(horse);
        String expected = "Froilanda gets off the Horse 1";

        Assert.assertEquals(actual, expected);
    }


    @Test
    public void plantMany() {
        Froilanda froilanda = new Froilanda();
        Crop crop = new TomatoPlant();
        froilanda.plant(crop, 5);
    }

    @Test
    public void flyAircraft() {
        Froilanda froilanda = new Froilanda();
        CropDuster cropDuster = new CropDuster();
        String actual = froilanda.flyAircraft(cropDuster);
        String expected = "Froilanda starts the crop duster to set off";

        Assert.assertEquals(actual, expected);
    }
}