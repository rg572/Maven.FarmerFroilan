package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;

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
                "Froilan fed 30 ears of corn to the horses. 0 died of starvation\n" +
                "Froilan eats 1 ear of corn, 2 tomatoes, and 5 eggs for breakfast\n" +
                "Froilanda eats 2 ears of corn, 1 tomato, and 2 eggs for breakfast\n";

        // Act
        week.runMorning();
        String actual = new String(baos.toByteArray());

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void runSundayTest(){
        // Arrange
        Farm farm = new Farm();
        farm.setUpFarm();
        Console console = new Console(System.in, System.out);
        Week week = new Week(farm, console);

        Integer expectedPotatoPlants = 30;
        Integer expectedTomatoPlants = 10;
        Integer expectedCornStalks = 200;
        Integer expectedSoyPlants = 0;
        Integer expectedOkraPlants =0;

        // Act
        week.runSunday();
        Integer actualPotatoPlants = Field.getINSTANCE().getMap().get("potato").getCropRow().size();
        Integer actualTomatoPlants = Field.getINSTANCE().getMap().get("tomato").getCropRow().size();
        Integer actualcornStalks = Field.getINSTANCE().getMap().get("corn").getCropRow().size();
        Integer actualSoyPlants = Field.getINSTANCE().getMap().get("soy").getCropRow().size();
        Integer actualOkraPlants = Field.getINSTANCE().getMap().get("okra").getCropRow().size();

        // Assert
        Assert.assertEquals(expectedPotatoPlants, actualPotatoPlants);
        Assert.assertEquals(expectedTomatoPlants, actualTomatoPlants);
        Assert.assertEquals(expectedCornStalks, actualcornStalks);
        Assert.assertEquals(expectedSoyPlants, actualSoyPlants);
        Assert.assertEquals(expectedOkraPlants, actualOkraPlants);
    }

    @Test
    public void runMondayTest(){
        // Arrange
        Farm farm = new Farm();
        farm.setUpFarm();
        Console console = new Console(System.in, System.out);
        Week week = new Week(farm, console);

        // Act
        week.runMonday();

        // Assert
        for(CropRow cropRow : Field.getINSTANCE().getMap().values()){
            for(Object o : cropRow.getCropRow()){
                Crop crop = (Crop)o;
                Assert.assertTrue(crop.hasBeenFertilized);
            }
        }
    }

    @Test
    public void runWednesdayTest(){
        // Arrange
        Farm farm = new Farm();
        farm.setUpFarm();
        Console console = new Console(System.in, System.out);
        Week week = new Week(farm, console);

        Integer expectedPotatoPlants = 60;
        Integer expectedTomatoPlants = 80;
        Integer expectedCornStalks = 250;
        Integer expectedSoyPlants = 70;
        Integer expectedOkraPlants =50;

        // Act
        week.runWednesday();
        Integer actualPotatoPlants = Field.getINSTANCE().getMap().get("potato").getCropRow().size();
        Integer actualTomatoPlants = Field.getINSTANCE().getMap().get("tomato").getCropRow().size();
        Integer actualcornStalks = Field.getINSTANCE().getMap().get("corn").getCropRow().size();
        Integer actualSoyPlants = Field.getINSTANCE().getMap().get("soy").getCropRow().size();
        Integer actualOkraPlants = Field.getINSTANCE().getMap().get("okra").getCropRow().size();

        // Assert
        Assert.assertEquals(expectedPotatoPlants, actualPotatoPlants);
        Assert.assertEquals(expectedTomatoPlants, actualTomatoPlants);
        Assert.assertEquals(expectedCornStalks, actualcornStalks);
        Assert.assertEquals(expectedSoyPlants, actualSoyPlants);
        Assert.assertEquals(expectedOkraPlants, actualOkraPlants);
    }

    @Test
    public void runSaturdayTest(){
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        Console console = new Console(System.in, out);
        Farm farm = new Farm();
        farm.setUpFarm();
        Week week = new Week(farm, console);

        String expected = "On Saturday: \n" +
                          "Froilan rode all the horses.\n" +
                          "Froilanda fed 30 ears of corn to the horses. 0 died of starvation\n" +
                          "Froilan eats 1 ear of corn, 2 tomatoes, and 5 eggs for breakfast\n" +
                          "Froilanda eats 2 ears of corn, 1 tomato, and 2 eggs for breakfast\n" +
                          "Everybody Dance! It is Saturday!\n" +
                          "Smells like teen spirit song started\n" +
                          "Froilan took off his hat, and jacket and followed his inner feelings to move\n" +
                          "Froilanda joined him with happy smile on her face \n" +
                          "Horses and chickens made circle around them and danced till the very late night \n" +
                          "It was really cool dancing party. Weird but cool\n";

        // Act
        week.runSaturday();
        String actual = new String(baos.toByteArray());

        // Assert
        Assert.assertEquals(expected, actual);

    }

    //
}