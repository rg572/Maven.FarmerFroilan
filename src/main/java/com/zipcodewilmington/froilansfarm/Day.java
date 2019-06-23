package com.zipcodewilmington.froilansfarm;

public enum Day {

    SUNDAY(),
    MONDAY(),
    TUESDAY(),
    WEDNESDAY(),
    THURSDAY(),
    FRIDAY(),
    SATURDAY(),
    LIMINALDAY();


    Day() {
    }

    @Override
    public String toString() {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", ""};
        return days[this.ordinal()];
    }
}
