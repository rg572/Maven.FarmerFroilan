package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {

    @Test
    public void getName() {
        Horse horse = new Horse(3);
        horse.setName("Horse");

        String expected = "Horse";
        String actual = horse.getName();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setName(){
        Horse horse = new Horse(3);
        horse.setName("Horse");

        String expected = "Horse";
        String actual =horse.getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setRider() {
        Horse horse = new Horse(3);
        Rider rider = Froilan.getInstance();

        horse.setRider(rider);
        Rider expected = rider;
        Rider actual = horse.getRider();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void removeRider() {
        Horse horse = new Horse(3);
        Rider rider = Froilan.getInstance();

        horse.setRider(rider);
        horse.removeRider();

        Rider expected = null;
        Rider actual =  horse.getRider();

      Assert.assertEquals(expected, actual);

    }

    @Test
    public void getRider() {
        Horse horse = new Horse(3);
        Rider rider = Froilan.getInstance();

        horse.setRider(rider);
        Rider expected = rider;
        Rider actual =  horse.getRider();


       Assert.assertEquals(expected, actual);


    }

    @Test
    public void makeNoise() {
        Horse horse = new Horse(3);
        String expected =  "Neigh";;
        String actual =  horse.makeNoise();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void eat() {
        Horse horse = new Horse(2);

        String expected = "smacksmacksmack";
        String actual = horse.eat(Edible.EARCORN);

        Assert.assertEquals(expected, actual);

    }
}