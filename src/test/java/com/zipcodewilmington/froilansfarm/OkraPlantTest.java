package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static com.zipcodewilmington.froilansfarm.Edible.EARCORN;
import static com.zipcodewilmington.froilansfarm.Edible.OKRA;
import static org.junit.Assert.*;

public class OkraPlantTest {

    @Test
    public void isReadyToHarvestTest() {
        Crop okra = new OkraPlant();
        okra.setHasBeenFertilized(true);
        okra.setReadyForHarvest(true);

        Assert.assertTrue(okra.getHasBeenFertilized());
        Assert.assertTrue(okra.getReadyForHarvest());
    }

    @Test
    public void yieldTest() {
        Crop okra = new OkraPlant();
        okra.setHasBeenFertilized(true);
        okra.setReadyForHarvest(false);
        okra.yield();
        Assert.assertTrue(okra.getHasBeenFertilized());
        Assert.assertFalse(okra.getReadyForHarvest());
    }

    @Test
    public void yieldTest2() {
        Crop okra = new OkraPlant();
        okra.setHasBeenFertilized(true);
        okra.setReadyForHarvest(true);
        Edible expected = OKRA;
        Edible actual = okra.yield();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getName() {
        Crop okra = new OkraPlant();
        String actual = okra.getName();
        String expected = "okra";

        Assert.assertEquals(expected, actual);
    }
}