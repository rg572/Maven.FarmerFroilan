package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
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
        week.runSunday();
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

    @Test
    public void runTuesdayTest(){
        // Arrange
        Farm farm = new Farm();
        farm.setUpFarm();
        Console console = new Console(System.in, System.out);
        Week week = new Week(farm, console);
        Integer expectedCorn = 200;
        Integer expectedPotatoes = 30;
        Integer expectedTomatoes = 10;

        // Act
        week.runSunday();
        week.runMonday();
        week.runTuesday();
        ArrayList<Edible> food = Silo.getInstance().getFood();
        Integer actualCorn = getNumberOfEdible(food, Edible.EARCORN);
        Integer actualPotatoes = getNumberOfEdible(food, Edible.POTATO);
        Integer acutalTomatoes = getNumberOfEdible(food, Edible.TOMATO);

        // Assert
        Assert.assertEquals(expectedCorn, actualCorn);
        Assert.assertEquals(expectedPotatoes, actualPotatoes);
        Assert.assertEquals(expectedTomatoes, acutalTomatoes);

    }

    @Test
    public void runThursdayTest(){
        // Arrange
        Farm farm = new Farm();
        farm.setUpFarm();
        Console console = new Console(System.in, System.out);
        Week week = new Week(farm, console);

        // Act
        week.runWednesday();
        week.runThursday();

        // Assert
        for(CropRow cropRow : Field.getINSTANCE().getMap().values()){
            for(Object o : cropRow.getCropRow()){
                Crop crop = (Crop)o;
                Assert.assertTrue(crop.hasBeenFertilized);
            }
        }
    }

    public Integer getNumberOfEdible(ArrayList<Edible> food, Edible edibleToCount){
        Integer count =0;
        for(Edible edible : food){
            if (edible.equals(edibleToCount)){
                count++;
            }
        }
        return count;
    }

    @Test
    public void runFridayTest(){
        // Arrange
        Farm farm = new Farm();
        farm.setUpFarm();
        Console console = new Console(System.in, System.out);
        Week week = new Week(farm, console);
        Integer expectedPotatoes = 60;
        Integer expectedTomatoes = 80;
        Integer expectedCorn = 250;
        Integer expectedEdamame = 70;
        Integer expectedOkra =50;
        Integer expectedCrops = 0;

        // Act
        week.runWednesday();
        week.runThursday();
        week.runFriday();
        ArrayList<Edible> food = Silo.getInstance().getFood();
        Integer actualCorn = getNumberOfEdible(food, Edible.EARCORN);
        Integer actualPotatoes = getNumberOfEdible(food, Edible.POTATO);
        Integer actualTomatoes = getNumberOfEdible(food, Edible.TOMATO);
        Integer actaulEdamame =getNumberOfEdible(food, Edible.EDAMAME);
        Integer actualOkra = getNumberOfEdible(food, Edible.OKRA);
        Integer cropsInField = 0;
        for(CropRow cropRow : Field.getINSTANCE().getCropRows()){
            for(Object o: cropRow.getCropRow()){
                cropsInField++;
            }
        }

        // Assert
        Assert.assertEquals(expectedCorn, actualCorn);
        Assert.assertEquals(expectedPotatoes, actualPotatoes);
        Assert.assertEquals(expectedTomatoes, actualTomatoes);
        Assert.assertEquals(expectedEdamame, actaulEdamame);
        Assert.assertEquals(expectedOkra, actualOkra);
        Assert.assertEquals(expectedCrops, cropsInField);

    }


    @Test
    public void starvationTest(){
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        Console console = new Console(System.in, out);
        Farm farm = new Farm();
        farm.setUpFarm();
        Week week = new Week(farm, console);
        farm.getHouse().getFridge().remove(Edible.EARCORN,10000, Froilan.getInstance());
        String expected = "Froilanda rode all the horses.\n" +
                "Froilan fed 0 ears of corn to the horses. 10 died of starvation\n" +
                "There isn't enough food in the fridge for Froilan's breakfast. He starves to death\n" +
                "There isn't enough food in the fridge for Froilanda's breakfast. She starves to death\n";

        // Act
        week.runMorning();
        String actual = new String(baos.toByteArray());

        // Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void runBurnItDownTest(){
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        Console console = new Console(System.in, out);
        Farm farm = new Farm();
        farm.setUpFarm();
        Week week = new Week(farm, console);
        String expected = "Froilan and Froilanda, after a week of magical produce, have gone psychotic and decide to burn it all down.\n" +
                "All the animals escape into the wilderness, trampling the fields.\n" +
                "Watching the animals break free, Froilanda remarks:\n" +
                "I'm sick of this shit.\n" +
                "Froilanda leaves with them, riding a horse at the head of the stampede.\n" +
                "The farm vehicles explode, due to highly flammable fertilizer and pesticides.\n" +
                "Froilan looks at this all and says:\n" +
                "Write more fucking tests\n" +
                "Froilan sits laughing to himself surrounded by the burning farm.\n" +
                "The end.\n";

        // Act
        week.runBurnItDown();
        String actual = new String(baos.toByteArray());

        // Assert
        Assert.assertEquals(expected, actual);

    }

    //
}