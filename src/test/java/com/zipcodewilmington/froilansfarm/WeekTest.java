package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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

    @Test
    public void runMorningTest(){
        // Arrange

        Console console = new Console(System.in, System.out);
        Farm farm = new Farm();
        farm.setUpFarm();
        Week week = new Week(farm, console);

        Integer cornExpected = farm.getHouse().getFridge().getNumberOf(Edible.EARCORN) - 33;
        Integer eggsExpected = farm.getHouse().getFridge().getNumberOf(Edible.EGG) - 7;
        Integer tomatosExpected = farm.getHouse().getFridge().getNumberOf(Edible.TOMATO) - 3;

        // Act
        week.runMorning();
        Integer cornActual = farm.getHouse().getFridge().getNumberOf(Edible.EARCORN);
        Integer eggsActual = farm.getHouse().getFridge().getNumberOf(Edible.EGG);
        Integer tomatoesActual = farm.getHouse().getFridge().getNumberOf(Edible.TOMATO);

        // Assert
        Assert.assertEquals(cornExpected, cornActual);
        Assert.assertEquals(eggsExpected, eggsActual);
        Assert.assertEquals(tomatosExpected, tomatoesActual);


    }

    @Test
    public void runMorningTest2(){
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        Console console = new Console(System.in, out);
        Farm farm = new Farm();
        farm.setUpFarm();
        Week week = new Week(farm, console);
        String expected = "Froilanda rode all the horses.\n" +
                "Froilan fed 30 of corn to the horses. 0 died of starvation\n" +
                "Froilan eats 1 ear of corn, 2 tomatoes, and 5 eggs for breakfast\n" +
                "Froilanda eats 2 ears of corn, 1 tomato, and 2 eggs for breakfast\n";

        // Act
        week.runMorning();
        String actual = new String(baos.toByteArray());

        // Assert
        Assert.assertEquals(expected, actual);


    }
}