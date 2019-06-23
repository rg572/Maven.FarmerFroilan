package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FroilanTest {

    @Test
    public void makeNoiseTest(){
        // Arrange
        Froilan froilan = Froilan.getInstance();
        String expected = "Write more fucking tests";

        // Act
        String actual = froilan.makeNoise();

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        // Arrage
        Froilan froilan = Froilan.getInstance();
        String expected = "crunch";

        // Act
        String actual = froilan.eat(Edible.POTATO);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    //@Test
    //public void

}