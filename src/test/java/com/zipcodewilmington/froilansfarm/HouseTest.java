package com.zipcodewilmington.froilansfarm;

import org.junit.Test;

import static org.junit.Assert.*;

public class HouseTest {

    @Test
    public void properTypesTest1(){
        // Arrange
        House house = new House();

        // Act
        house.add(new Person());
    }

    @Test
    public void properTypesTest2(){
        // Arrange
        House house = new House();
        String str = "this is an Object";

        // Act

    }

    @Test
    public void properTypesTest3(){
        // Arrange
        House house = new House();

        // Act
        house.add(new Horse());
    }



}