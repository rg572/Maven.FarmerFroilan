package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TractorTest {

    @Test
    public void makeNoise() {
        Tractor tractor = new Tractor();
        String actual = tractor.makeNoise();
        String expected = "Purrrrrrr";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getName() {
        Tractor tractor = new Tractor();
        String actual = tractor.getName();
        String exptected = "Tractor";

        Assert.assertEquals(exptected, actual);
    }
}