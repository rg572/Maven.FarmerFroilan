package com.zipcodewilmington.froilansfarm;

public class Horse extends Animal implements Rideable{

    private String name;

    public Horse(Integer number){
        name = "Horse " + number.toString();
    }

    public String getName(){
        return name;
    }

    @Override
    public void setRider(Rider rider) {

    }

    @Override
    public void removeRider() {

    }
}
