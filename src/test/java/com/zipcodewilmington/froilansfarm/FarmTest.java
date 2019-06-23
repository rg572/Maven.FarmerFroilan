package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FarmTest {

    @Test
    public void setUpHorsesTest(){
        // Arrange
        Farm farm = new Farm();
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("Horse 1");
        expected.add("Horse 2");
        expected.add("Horse 3");
        expected.add("Horse 4");
        expected.add("Horse 5");
        expected.add("Horse 6");
        expected.add("Horse 7");
        expected.add("Horse 8");
        expected.add("Horse 9");
        expected.add("Horse 10");

        // Act
        farm.setUpFarm();
        ArrayList<String> actual = new ArrayList<String>();
        for(Stable stable : farm.getStables()){
            for(Horse horse : stable.getHorses()){
                actual.add(horse.getName());
            }
        }

        // Assert
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void setUpChickenTest(){
        Farm farm = new Farm();
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Chicken 1");
        expected.add("Chicken 2");
        expected.add("Chicken 3");
        expected.add("Chicken 4");
        expected.add("Chicken 5");
        expected.add("Chicken 6");
        expected.add("Chicken 7");
        expected.add("Chicken 8");
        expected.add("Chicken 9");
        expected.add("Chicken 10");

        farm.setUpFarm();
        ArrayList<String> actual = new ArrayList<>();
        for(ChickenCoop chickencoop: farm.getCoops()){
            for (Chicken chicken: chickencoop.getChickens()){
                actual.add(chicken.getName());
            }
        }

        Assert.assertEquals(expected,actual);
    }

}
