package com.zipcodewilmington.froilansfarm;

public class Week {

    private Day currentDay;
    private Farm farm;
    private Console console;

    public Week(Farm farm, Console console) {
        this.farm = farm;
        this.console = console;
        runWeek();
    }

    private void runWeek() {
        runSunday();
        String beginNextDay = console.getStringInput("Enter 'Wake up' to begin next day");
        while (!beginNextDay.equalsIgnoreCase("wake up")) {
            if (beginNextDay.equals("quit")) break;
            beginNextDay = console.getStringInput("Don't you want to start the new day?");
        }
    }


    public void runSunday() {
        currentDay = Day.SUNDAY;

    }
    public void runMonday() {
        currentDay = Day.MONDAY;

    }
    public void runTuesday() {
        currentDay = Day.TUESDAY;

    }
    public void runWednesday() {
        currentDay = Day.WEDNESDAY;
    }

    public void runThursday() {
        currentDay = Day.THURSDAY;

    }
    public void runFriday() {
        currentDay = Day.FRIDAY;

    }
    public void runSaturday() {
        currentDay = Day.SATURDAY;
    }

}
