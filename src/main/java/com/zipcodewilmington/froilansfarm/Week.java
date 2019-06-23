package com.zipcodewilmington.froilansfarm;

public class Week {

    private Day currentDay;
    private Farm farm;
    private Console console;

    public Week(Farm farm, Console console) {
        this.farm = farm;
        this.console = console;
        currentDay = null;
    }

    private void runWeek() {
        runSunday();
        String input = console.getStringInput("At any time, type 'quit' to exit");
        while (true) {
            toNextDay();

        }
    }

    private void toNextDay() {
        String input = console.getStringInput("Enter 'Wake up' to begin next day");
        while (!input.equalsIgnoreCase("quit") | input.equalsIgnoreCase("wake up")) {
            input = console.getStringInput("Don't you want to start the new day?");
        }
        switch (currentDay) {
            case SUNDAY:
                runMonday();
                break;
            case MONDAY:
                runTuesday();
                break;
            case TUESDAY:
                runWednesday();
                break;
            case WEDNESDAY:
                runThursday();
                break;
            case THURSDAY:
                runFriday();
                break;
            case FRIDAY:
                runSaturday();
                break;
            case SATURDAY:
                runBurnItDown();
                break;
            default:
                runSunday();
                break;
        }

    }

    private void runBurnItDown() {
        console.println("Froilan and Froilanda, after a week of magical gmo produce, have gone psychotic and decide to burn it all down.");
        console.println("All the animals escape into the wilderness, trampling the fields.");
        console.println("The farm vehicles explode, due to highly flammable fertilizer and pesticides.");
        console.println("Froilanda takes this chance to leave the farm life forever.");
        console.println("Froilan sits laughing surrounded by the burning farm.");
        console.println("The end.");
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

    public void runMorning(Day currentDay){
        Person rider;
        Person feeder;
        if(currentDay.ordinal()%2 == 0){
            rider = Froilan.getInstance();
        }
    }

}
