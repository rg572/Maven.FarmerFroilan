package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeekTest {

    @Test
    public void toNextDay() {
    }

    @Test
    public void eatBreakfastTest(){
        // Arrange
        Console consul = new Console(System.in, System.out);
        Farm farm = new Farm();
        farm.setUpFarm();
        Week weak = new Week(farm, consul);
        Integer cornExpected = farm.getHouse().getFridge().getNumberOf(Edible.EARCORN) - 3;
        Integer eggsExpected = farm.getHouse().getFridge().getNumberOf(Edible.EGG) - 7;
        Integer tomatosExpected = farm.getHouse().getFridge().getNumberOf(Edible.TOMATO) - 3;

        // Act
        weak.eatBreakfast();
        Integer cornActual = farm.getHouse().getFridge().getNumberOf(Edible.EARCORN);
        Integer eggsActual = farm.getHouse().getFridge().getNumberOf(Edible.EGG);
        Integer tomatoesActual = farm.getHouse().getFridge().getNumberOf(Edible.TOMATO);

        // Assert
        Assert.assertEquals(cornExpected, cornActual);
        Assert.assertEquals(eggsExpected, eggsActual);
        Assert.assertEquals(tomatosExpected, tomatoesActual);
    }
}