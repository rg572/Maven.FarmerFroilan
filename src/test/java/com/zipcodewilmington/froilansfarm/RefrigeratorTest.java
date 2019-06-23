package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RefrigeratorTest {

    @Test
    public void containsTest1(){
        // Arrange
        Refrigerator<Edible> fridge = new Refrigerator<>();

        // Act

        // Assert
        Assert.assertFalse(fridge.contains(Edible.EARCORN, 1));
    }

    @Test
    public void containsTest2(){
        // Arrange
        Refrigerator<Edible> fridge = new Refrigerator<>();

        // Act
        for(int i = 0; i < 5; i++){
            fridge.add(Edible.EARCORN);
        }

        // Assert
        Assert.assertTrue(fridge.contains(Edible.EARCORN, 3));
    }

    @Test
    public void containsTest3(){
        // Arrange
        Refrigerator<Edible> fridge = new Refrigerator<>();

        // Act
        for(int i = 0; i < 5; i++){
            fridge.add(Edible.EARCORN);
        }

        // Assert
        Assert.assertFalse(fridge.contains(Edible.EARCORN, 10));
    }

}