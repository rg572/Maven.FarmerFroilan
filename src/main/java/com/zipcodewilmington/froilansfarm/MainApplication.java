package com.zipcodewilmington.froilansfarm;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {

    protected static void simulateWeek(Console console) {
        //Console console = new Console(System.in, System.out);
        String begin = "";
        while (begin.isEmpty()) begin = console.getStringInput("Are you ready for the week?");
        if (!begin.equalsIgnoreCase("yes")) {
            String start = console.getStringInput("Type 'start' to begin when ready");
            while (!start.equalsIgnoreCase("start")) {
                if (start.equals("quit")) return;
                start = console.getStringInput("Waiting to start...");
            }
        }
        Farm farm = new Farm();
        farm.setUpFarm();
        Week newWeek = new Week(farm, console);
        newWeek.runWeek();
    }


    public static void main(String[] args) {
        Console console = new Console(System.in, System.out);
        simulateWeek(console);
    }

}
