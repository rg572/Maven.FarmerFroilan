package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

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
}