package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PotatoPlantTest {

    @Test
    public void isReadyToHarvestTest() {
        Crop potato = new PotatoPlant();
        potato.setHasBeenFertilized(true);
        potato.setReadyForHarvest(true);

        Assert.assertTrue(potato.getHasBeenFertilized());
        Assert.assertTrue(potato.getReadyForHarvest());
    }

    @Test
    public void yieldTest() {
        Crop potato = new PotatoPlant();
        potato.setHasBeenFertilized(true);
        potato.setReadyForHarvest(false);
        potato.yield();
        Assert.assertTrue(potato.getHasBeenFertilized());
        Assert.assertFalse(potato.getReadyForHarvest());
    }
}