package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ChickenCoopTest {



    @Test
    public void add() {
        ArrayList<Chicken> chickens = new ArrayList<>();
        chickens.add(new Chicken(1));

        Integer expected = 1;
        Integer actual = chickens.size();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void removeTest() {
        // Arrange
        ChickenCoop coup = new ChickenCoop();
        ArrayList<Chicken> expected = new ArrayList<>();
        Chicken chicken1 = new Chicken(1);
        Chicken chicken2 = new Chicken(2);
        for(int i = 0; i < 5; i++){
            coup.add(chicken2);
            expected.add(chicken2);
        }
        coup.add(chicken1);

        // Act
        coup.remove(chicken1);
        ArrayList<Chicken> actual = coup.getChickens();

        // Assert
        Assert.assertEquals(expected, actual);
    }
}