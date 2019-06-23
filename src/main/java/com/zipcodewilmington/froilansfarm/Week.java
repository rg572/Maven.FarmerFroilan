package com.zipcodewilmington.froilansfarm;

import com.sun.xml.internal.xsom.impl.ForeignAttributesImpl;

public class Week {

    private Day currentDay;
    private Farm farm;
    private Console console;
    private Boolean weekOver;

    public Week(Farm farm, Console console) {
        this.farm = farm;
        this.console = console;
        currentDay = null;
        weekOver = false;
    }

    protected void runWeek() {
        runSunday();
        String input = console.getStringInput("At any time, type 'quit' to exit");
        if (input.equals("quit")) weekOver = true;
        while (!weekOver) {
            toNextDay();
        }
    }

    protected void toNextDay() {
        String input = console.getStringInput("Enter 'Wake up' to begin next day");
        while (!input.equalsIgnoreCase("wake up")) {
            if (input.equals("quit")) {
                weekOver = true;
                return;
            }
            input = console.getStringInput("Don't you want to start the new day?");
        }
        console.println(String.format("On %s: ", currentDay.toString()));

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
        console.println("Froilan and Froilanda, after a week of magical produce, have gone psychotic and decide to burn it all down.");
        delay(300L);
        console.println("All the animals escape into the wilderness, trampling the fields.");
        console.println("Froilanda leaves with them, riding a horse at the head of the stampede.");
        delay(500L);
        console.println("The farm vehicles explode, due to highly flammable fertilizer and pesticides.");
        console.println("Froilan sits laughing surrounded by the burning farm.");
        console.println("The end.");
        weekOver = true;
    }

    protected void delay(long delayBy) {
        long currentTime = System.currentTimeMillis();
        long goalTime = currentTime + delayBy;
        while (System.currentTimeMillis() != goalTime) {
            continue;
        }
    }

    public void runSunday() {
        currentDay = Day.SUNDAY;
        runMorning();
        delay(2000L);
        console.println("In the afternoon: ");
        delay(100L);
        Froilan.getInstance().plantMany(new PotatoPlant(), 30);
        Froilan.getInstance().plantMany(new TomatoPlant(), 10);
        Froilan.getInstance().plantMany(new CornStalk(), 200);
        console.println("Froilan plants 30 potatoes, 10 tomato plants, and 200 corn stalks");
    }

    public void runMonday() {
        currentDay = Day.MONDAY;

        runMorning();

    }
    public void runTuesday() {
        currentDay = Day.TUESDAY;
        runMorning();

    }
    public void runWednesday() {
        currentDay = Day.WEDNESDAY;
        runMorning();
        delay(500L);
        console.println("In the afternoon: ");
        delay(100L);
        Froilanda.getInstance().plantMany(new PotatoPlant(), 60);
        Froilanda.getInstance().plantMany(new SoyPlant(), 70);
        Froilanda.getInstance().plantMany(new CornStalk(), 250);
        Froilan.getInstance().plantMany(new OkraPlant(), 50);
        Froilan.getInstance().plantMany(new TomatoPlant(), 80);
        console.println("Froilanda plants 60 potatoes, 70 soy plants, and 250 corn stalks");
        console.println("Froilan plants 50 okra plants, and 80 tomato plants");
    }

    public void runThursday() {
        currentDay = Day.THURSDAY;
        runMorning();

    }
    public void runFriday() {
        currentDay = Day.FRIDAY;
        runMorning();

    }
    public void runSaturday() {

        currentDay = Day.SATURDAY;
        runMorning();

        console.println("Everybody Dance! It is Saturday!");
        console.println("Smells like teen spirit song started");
        console.println("Froilan took off his hat, and jacket and followed his inner feelings to move");
        console.println("Froilanda joined him with happy smile on her face ");
        console.println("Horses and chickens made circle around them and danced till the very late night ");
        console.println("It was really cool dancing party. Weird but cool");

    }

    public void runMorning(){
        Rider rider;
        Farmer feeder;
        if(currentDay.ordinal()%2 == 0){
            rider = Froilan.getInstance();
            feeder = Froilanda.getInstance();
        }
        else{
            rider = Froilanda.getInstance();
            feeder = Froilan.getInstance();
        }

        for(Stable stable : farm.getStables()){
            for(Horse horse : stable.getHorses()){
                rider.mount(horse);
                console.println(rider.getName() + "is riding" + horse.getName());
                rider.dismount(horse);

                //feeder.feed(horse);
            }
        }


    }

}
