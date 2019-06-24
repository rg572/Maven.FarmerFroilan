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

    @Test
    public void containsTest4(){
        // Arrange
        Refrigerator<Edible> fridge = new Refrigerator<>();

        // Act
        for(int i = 0; i < 5; i++){
            fridge.add(Edible.EARCORN);
        }

        // Assert
        Assert.assertFalse(fridge.contains(Edible.EGG, 1));
    }

    @Test
    public void getNumberOfTest1(){
        // Arrange
        Refrigerator<Edible> fridge = new Refrigerator<>();
        Integer expected = 5;

        // Act
        for(int i = 0; i < 5; i++){
            fridge.add(Edible.EARCORN);
        }
        Integer actual = fridge.getNumberOf(Edible.EARCORN);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfTest2(){
        // Arrange
        Refrigerator<Edible> fridge = new Refrigerator<>();
        Integer expected = 0;

        // Act
        for(int i = 0; i < 5; i++){
            fridge.add(Edible.EARCORN);
        }
        Integer actual = fridge.getNumberOf(Edible.EGG);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeSingleTest1(){
        // Arrange
        Refrigerator<Edible> fridge = new Refrigerator<>();
        fridge.add(Edible.EARCORN);
        fridge.add(Edible.EARCORN);
        Integer expected = 1;

        // Act
        fridge.remove(Edible.EARCORN);
        Integer actual = fridge.getNumberOf(Edible.EARCORN);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeSingleTest2(){
        // Arrange
        Refrigerator<Edible> fridge = new Refrigerator<>();
        Integer expected = 0;

        // Act
        fridge.remove(Edible.EARCORN);
        Integer actual = fridge.getNumberOf(Edible.EARCORN);

        // Assert
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeMultipleTest1(){
        // Arrange
        Refrigerator<Edible> fridge = new Refrigerator<>();
        Eater eater = Froilanda.getInstance();
        for(int i = 0; i < 20; i++){ fridge.add(Edible.EARCORN); }
        Integer expected = fridge.getNumberOf(Edible.EARCORN) - 6;

        // Act

        fridge.remove(Edible.EARCORN, 6, eater);
        Integer actual = fridge.getNumberOf(Edible.EARCORN);

        // Assert
        Assert.assertEquals(expected, actual);
    }



}