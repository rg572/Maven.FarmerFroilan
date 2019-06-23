package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static com.zipcodewilmington.froilansfarm.Edible.EARCORN;
import static com.zipcodewilmington.froilansfarm.Edible.TOMATO;
import static org.junit.Assert.*;

public class TomatoPlantTest {

    @Test
    public void isReadyToHarvestTest() {
        Crop tomatoPlant = new TomatoPlant();
        tomatoPlant.setHasBeenFertilized(true);
        tomatoPlant.setReadyForHarvest(true);

        Assert.assertTrue(tomatoPlant.getHasBeenFertilized());
        Assert.assertTrue(tomatoPlant.getReadyForHarvest());
    }

    @Test
    public void yieldTest() {
        Crop tomatoPlant = new TomatoPlant();
        tomatoPlant.setHasBeenFertilized(true);
        tomatoPlant.setReadyForHarvest(false);
        tomatoPlant.yield();
        Assert.assertTrue(tomatoPlant.getHasBeenFertilized());
        Assert.assertFalse(tomatoPlant.getReadyForHarvest());
    }

    @Test
    public void yieldTest2() {
        Crop tomatoPlant = new TomatoPlant();
        tomatoPlant.setHasBeenFertilized(true);
        tomatoPlant.setReadyForHarvest(true);
        Edible expected = TOMATO;
        Edible actual = tomatoPlant.yield();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getName() {
        Crop tomatoPlant = new TomatoPlant();
        String actual = tomatoPlant.getName();
        String expected = "tomato";

        Assert.assertEquals(expected, actual);
    }
}