package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static com.zipcodewilmington.froilansfarm.Edible.EDAMAME;
import static com.zipcodewilmington.froilansfarm.Edible.OKRA;
import static org.junit.Assert.*;

public class SoyPlantTest {
    @Test
    public void isReadyToHarvestTest() {
        Crop soyPlant = new SoyPlant();
        soyPlant.setHasBeenFertilized(true);
        soyPlant.setReadyForHarvest(true);

        Assert.assertTrue(soyPlant.getHasBeenFertilized());
        Assert.assertTrue(soyPlant.getReadyForHarvest());
    }

    @Test
    public void yieldTest() {
        Crop soyPlant = new SoyPlant();
        soyPlant.setHasBeenFertilized(true);
        soyPlant.setReadyForHarvest(false);
        soyPlant.yield();
        Assert.assertTrue(soyPlant.getHasBeenFertilized());
        Assert.assertFalse(soyPlant.getReadyForHarvest());
    }

    @Test
    public void yieldTest2() {
        Crop soyPlant = new SoyPlant();
        soyPlant.setHasBeenFertilized(true);
        soyPlant.setReadyForHarvest(true);
        Edible expected = EDAMAME;
        Edible actual = soyPlant.yield();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getName() {
        Crop soyPlant = new SoyPlant();
        String actual = soyPlant.getName();
        String expected = "soy";

        Assert.assertEquals(expected, actual);
    }
}