package com.zipcodewilmington.froilansfarm;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {

    private static void simulateWeek() {
        Console console = new Console(System.in, System.out);
        String begin = "";
        while (begin.isEmpty()) begin = console.getStringInput("Are you ready for the week?");
        if (!begin.equalsIgnoreCase("yes")) {
            String start = console.getStringInput("Type 'start' to begin when ready");
            while (!start.equalsIgnoreCase("start")) {
                start = console.getStringInput("Waiting to start...");
            }
        }

    }


    public static void main(String[] args) {
        simulateWeek();
    }

}
