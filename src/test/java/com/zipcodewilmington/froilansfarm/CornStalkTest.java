package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CornStalkTest {

    @Test
    public void isReadyToHarvestTest() {
        Crop cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(true);
        cornStalk.setReadyForHarvest(true);

        Assert.assertTrue(cornStalk.getHasBeenFertilized());
        Assert.assertTrue(cornStalk.getReadyForHarvest());
    }

    @Test
    public void yieldTest() {
        Crop cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(true);
        cornStalk.setReadyForHarvest(true);
        cornStalk.yield();
        Assert.assertFalse(cornStalk.getHasBeenFertilized());
        Assert.assertFalse(cornStalk.getReadyForHarvest());
    }

    @Test
    public void yieldTest2() {
        Edible earCorn = null;
        Crop cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(true);
        cornStalk.setReadyForHarvest(true);
        Edible expected = earCorn;
        Edible actual = cornStalk.yield();

        Assert.assertEquals(earCorn, actual);

    }
}