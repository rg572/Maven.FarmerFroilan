package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void makeNoise() {
        Person person = new Person();
        String actual = person.makeNoise();
        String expected = null;

        Assert.assertEquals(expected, actual);

    }
}