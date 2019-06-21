package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

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
}