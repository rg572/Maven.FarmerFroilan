package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

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
}