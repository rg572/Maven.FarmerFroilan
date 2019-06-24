package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CombineHarvesterTest {

    @Test
    public void operate() {
    }

    @Test
    public void makeNoise() {
        CombineHarvester combineHarvester = new CombineHarvester();
        String actual = combineHarvester.makeNoise();
        String expected = "Whirrrr.....";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void harvest() {
    }

    @Test
    public void getName() {
        CombineHarvester combineHarvester = new CombineHarvester();
        String expected = "Combine Harvester";
        String actual = combineHarvester.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setRider() {
        CombineHarvester combineHarvester = new CombineHarvester();
        Rider rider = Froilan.getInstance();

        combineHarvester.setRider(rider);
        Rider expected = rider;
        Rider actual = combineHarvester.getRider();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeRider() {
        CombineHarvester combineHarvester = new CombineHarvester();
        Rider rider = Froilan.getInstance();

        combineHarvester.setRider(rider);
        combineHarvester.removeRider();

        Rider expected = null;
        Rider actual =  combineHarvester.getRider();

        Assert.assertEquals(expected, actual);
    }
}