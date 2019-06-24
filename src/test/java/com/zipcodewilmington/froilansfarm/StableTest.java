package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StableTest {

    @Test
    public void removeTest(){
        // Arrange
        Horse horse1 = new Horse(1);
        Horse horse2 = new Horse(2);
        Horse horse3 = new Horse(3);
        Horse horse4 = new Horse(4);

        Stable stable = new Stable();
        stable.add(horse1);
        stable.add(horse2);
        stable.add(horse3);
        stable.add(horse4);

        ArrayList<Horse> expected = new ArrayList<>();
        expected.add(horse1);
        expected.add(horse2);
        expected .add(horse4);


        // Act
        stable.remove(horse3);
        ArrayList<Horse> actual = stable.getHorses();

        // Assert
        Assert.assertEquals(expected, actual);


    }

}