package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static com.zipcodewilmington.froilansfarm.Edible.EGG;
import static org.junit.Assert.*;

public class ChickenTest {

    @Test
    public void yield() {
        Chicken chicken = new Chicken(1);
        Edible actual = chicken.yield();
        Edible expected = EGG;

        Assert.assertEquals(expected, actual);

    }
}