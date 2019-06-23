package com.zipcodewilmington.froilansfarm;

public enum Day {

    SUNDAY(1),
    MONDAY( 2),
    TUESDAY( 3),
    WEDNESDAY( 4),
    THURSDAY( 5),
    FRIDAY( 6),
    SATURDAY(7);

    private Integer dayInt;

    Day(Integer dayInt) {
        this.dayInt = dayInt;
    }

    @Override
    public String toString() {
        String[] days = {"Sunday", "Monday", "Tueday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return days[dayInt];
    }
}
