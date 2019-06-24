package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ChickenCoopTest {



    @Test
    public void add() {
        ArrayList<Chicken> chickens = new ArrayList<>();
        chickens.add(new Chicken(1));

        Integer expected = 1;
        Integer actual = chickens.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void get() {

    }

    @Test
    public void getChickens() {
    }
}