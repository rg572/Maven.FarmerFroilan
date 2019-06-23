package com.zipcodewilmington.froilansfarm;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayTest {

    @Test
    public void toStringTest() {
        Day day = Day.SUNDAY;
        assertEquals(day.toString(), "Sunday");
        day = Day.MONDAY;
        assertEquals(day.toString(), "Monday");
        day = Day.FRIDAY;
        assertEquals(day.toString(), "Friday");

    }
}