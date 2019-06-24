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
        // Arrange
        Froilan froilan = Froilan.getInstance();
        String expected = "crunch";

        // Act
        String actual = froilan.eat(Edible.POTATO);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mountTest(){
        // Arrange
        Froilan froilan = Froilan.getInstance();
        Horse horse = new Horse(170);
        String expected = "Froilan gets on the Horse 170";

        // Act
        String actual = froilan.mount(horse);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dismountTest(){
        // Arrange
        Froilan froilan = Froilan.getInstance();
        Horse horse = new Horse(170);
        String expected = "Froilan gets off the Horse 170";

        // Act
        String actual = froilan.dismount(horse);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){
        // Arrange
        Froilan froilan = Froilan.getInstance();
        String expected = "Froilan";

        // Act
        String actual = froilan.getName();

        // Assert
        Assert.assertEquals(expected, actual);
    }


}