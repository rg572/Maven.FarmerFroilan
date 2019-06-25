package com.zipcodewilmington.froilansfarm;

import java.util.List;

public class Week {

    private Day currentDay;
    private Farm farm;
    private Console console;
    private Boolean weekOver;
    private Boolean pause;

    public Week(Farm farm, Console console) {
        this.farm = farm;
        this.console = console;
        weekOver = false;
        pause = false;
        currentDay = Day.LIMINALDAY;
    }

    protected void runWeek() {
        delay(50L);
        console.println("At any time, type 'quit' to exit");
        while (!weekOver) {
            toNextDay();
        }
    }

    protected void toNextDay() {
        String input = console.getStringInput("Enter 'Wake up' to begin the day");
        while (!input.equalsIgnoreCase("wake up")) {
            if (input.equals("quit")) {
                weekOver = true;
                return;
            }
            input = console.getStringInput("Don't you want to start the new day?");
        }
        switch (currentDay) {
            case LIMINALDAY:
                runSunday();
                break;
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
        }

    }

    private void runBurnItDown() {
        console.println("Froilan and Froilanda, after a week of magical produce, have gone psychotic and decide to burn it all down.");
        delay(100L);
        console.println("All the animals escape into the wilderness, trampling the fields.");
        console.println("Watching the animals break free, Froilanda remarks:");
        console.println(Froilanda.getInstance().makeNoise());
        console.println("Froilanda leaves with them, riding a horse at the head of the stampede.");
        delay(100L);
        console.println("The farm vehicles explode, due to highly flammable fertilizer and pesticides.");
        console.println("Froilan looks at this all and says:");
        console.println(Froilan.getInstance().makeNoise());
        console.println("Froilan sits laughing to himself surrounded by the burning farm.");
        console.println("The end.");
        weekOver = true;
    }

    protected void delay(long delayBy) {
        pause = true;
        long currentTime = System.currentTimeMillis();
        long goalTime = currentTime + delayBy;
        while (System.currentTimeMillis() != goalTime) {
            continue;
        }
        pause = false;
    }

    private void printDay() {
        console.println(String.format("On %s: ", currentDay.toString()));
    }

    public void runSunday() {
        currentDay = Day.SUNDAY;
        printDay();
        runMorning();
        console.println("In the afternoon: ");
        Froilan.getInstance().plant(new PotatoPlant(), 30);
        Froilan.getInstance().plant(new TomatoPlant(), 10);
        Froilan.getInstance().plant(new CornStalk(), 200);
        console.println("Froilan plants 30 potatoes, 10 tomato plants, and 200 corn stalks");
        console.println("Froilanda takes the afternoon off");
        console.println("They go to bed with the sun.");
    }


    public void runMonday() {
        currentDay = Day.MONDAY;
        printDay();
        runMorning();
        console.println("In the afternoon Froilanda gets out the crop duster tp fertilize the crops.");
        console.println(Froilanda.getInstance().mount(CropDuster.getINSTANCE()));
        console.println(Froilanda.getInstance().flyAircraft(CropDuster.getINSTANCE()));
        console.println(CropDuster.getINSTANCE().makeNoise());
        CropDuster.getINSTANCE().fertilize();
        console.println(Froilanda.getInstance().dismount(CropDuster.getINSTANCE()));
        console.println("Froilan heads to harvest eggs.");
        console.println(farm.getCoops().get(0).getChickens().get(0).makeNoise());
        console.println(Froilan.getInstance().harvestEggs(farm));
        console.println("Froilan and Froilanda head to bed");
    }

    public void runTuesday() {
        currentDay = Day.TUESDAY;
        printDay();
        runMorning();
        console.println(Froilan.getInstance().mount(Tractor.getINSTANCE()));
        Tractor.getINSTANCE().operate(Field.getINSTANCE().getMap().get("potato"));
        console.println(Tractor.getINSTANCE().makeNoise());
        Tractor.getINSTANCE().operate(Field.getINSTANCE().getMap().get("tomato"));
        console.println(Tractor.getINSTANCE().makeNoise());
        Tractor.getINSTANCE().operate(Field.getINSTANCE().getMap().get("corn"));
        console.println(Tractor.getINSTANCE().makeNoise());
        console.println("Row by row, Froilan harvests Sunday's plants to add to the silo.");
        console.println(Froilan.getInstance().dismount(Tractor.getINSTANCE()));
        console.println("Froilanda goes around the coops to harvest some eggs.");
        console.println(Froilanda.getInstance().harvestEggs(farm));
    }

    public void runWednesday() {
        currentDay = Day.WEDNESDAY;
        printDay();
        runMorning();
        console.println("In the afternoon: ");
        Froilanda.getInstance().plant(new PotatoPlant(), 60);
        Froilanda.getInstance().plant(new SoyPlant(), 70);
        Froilanda.getInstance().plant(new CornStalk(), 250);
        Froilan.getInstance().plant(new OkraPlant(), 50);
        Froilan.getInstance().plant(new TomatoPlant(), 80);
        console.println("Froilanda plants 60 potatoes, 70 soy plants, and 250 corn stalks");
        console.println("Froilan plants 50 okra plants, and 80 tomato plants");


    }

    public void runThursday() {
        currentDay = Day.THURSDAY;
        printDay();
        runMorning();
        console.println("As Froilan goes to buy a combine harvester, Froilanda once again fertilizes the crops.");
        console.println(Froilanda.getInstance().mount(CropDuster.getINSTANCE()));
        console.println(Froilanda.getInstance().flyAircraft(CropDuster.getINSTANCE()));
        console.println(CropDuster.getINSTANCE().makeNoise());
        CropDuster.getINSTANCE().fertilize();
        console.println(Froilanda.getInstance().dismount(CropDuster.getINSTANCE()));
        console.println("Froilan organizes the silo because he doesn't get to do cool things.");

    }

    public void runFriday() {
        currentDay = Day.FRIDAY;
        printDay();
        runMorning();
        console.println("Afternoon comes and Froilanda takes out the combine harvester.");
        console.println(Froilanda.getInstance().mount(CombineHarvester.getINSTANCE()));
        console.println(CombineHarvester.getINSTANCE().makeNoise());
        CombineHarvester.getINSTANCE().operate();
        console.println(Froilanda.getInstance().dismount(CombineHarvester.getINSTANCE()));
        console.println("The entire field is harvested at once and separated into the silo.");
        console.println("Meanwhile, Froilan is on egg duty once again.");
        console.println(farm.getCoops().get(0).getChickens().get(0).makeNoise());
        console.println(Froilan.getInstance().harvestEggs(farm));

    }
    public void runSaturday() {
        currentDay = Day.SATURDAY;
        printDay();
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

        Integer cornLost = 0;
        Integer horsesLost = 0;
        for(Stable stable : farm.getStables()){
            for(Horse horse : stable.getHorses()){
                rider.mount(horse);
                rider.dismount(horse);

                if(farm.getHouse().getFridge().contains(Edible.EARCORN, 3)){
                    farm.getHouse().getFridge().remove(Edible.EARCORN, 3, horse);
                    cornLost+=3;
                }
                else{
                    stable.remove(horse);
                    horsesLost++;
                }

            }
        }
        console.println(rider.getName() + " rode all the horses.");
        console.println(feeder.getName() + " fed " + cornLost + " ears of corn to the horses. " + horsesLost + " died of starvation");

        eatBreakfast();


    }

    protected void eatBreakfast(){
        if(farm.getHouse().getFridge().contains(Edible.EARCORN, 1) &&
                farm.getHouse().getFridge().contains(Edible.TOMATO, 2) &&
                farm.getHouse().getFridge().contains(Edible.EGG, 5)){

            farm.getHouse().getFridge().remove(Edible.EARCORN, Froilan.getInstance());
            farm.getHouse().getFridge().remove(Edible.TOMATO, 2, Froilan.getInstance());
            farm.getHouse().getFridge().remove(Edible.EGG, 5, Froilan.getInstance());

            console.println("Froilan eats 1 ear of corn, 2 tomatoes, and 5 eggs for breakfast");
        }
        else {
            console.println("There isn't enough food in the fridge for Froilan's breakfast. He starves to death");
        }

        if(farm.getHouse().getFridge().contains(Edible.EARCORN, 2) &&
                farm.getHouse().getFridge().contains(Edible.TOMATO, 1) &&
                farm.getHouse().getFridge().contains(Edible.EGG, 2)){

            farm.getHouse().getFridge().remove(Edible.EARCORN, 2, Froilanda.getInstance());
            farm.getHouse().getFridge().remove(Edible.TOMATO, Froilanda.getInstance());
            farm.getHouse().getFridge().remove(Edible.EGG, 2, Froilanda.getInstance());

            console.println("Froilanda eats 2 ears of corn, 1 tomato, and 2 eggs for breakfast");
        }
        else {
            console.println("There isn't enough food in the fridge for Froilanda's breakfast. She starves to death");
        }
    }

}
