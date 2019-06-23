package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static com.zipcodewilmington.froilansfarm.Edible.EARCORN;
import static com.zipcodewilmington.froilansfarm.Edible.POTATO;
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

    @Test
    public void yieldTest2() {
        Crop potatoPlant = new PotatoPlant();
        potatoPlant.setHasBeenFertilized(true);
        potatoPlant.setReadyForHarvest(true);
        Edible expected = POTATO;
        Edible actual = potatoPlant.yield();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getName() {
        Crop potatoPlant = new PotatoPlant();
        String actual = potatoPlant.getName();
        String expected = "potato";

        Assert.assertEquals(expected, actual);
    }
}