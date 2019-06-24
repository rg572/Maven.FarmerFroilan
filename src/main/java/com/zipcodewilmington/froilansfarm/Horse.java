package com.zipcodewilmington.froilansfarm;

public class Horse extends Animal implements Rideable{

    private String name;

    private Rider rider;

    public Horse(Integer number){
        name = "Horse " + number.toString();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;

    }

    @Override
    public void setRider(Rider rider) {
        this.rider = rider;
    }

    @Override
    public void removeRider() {
        this.rider = null;
    }

    public Rider getRider() {
        return rider;
    }

    @Override
    public String makeNoise() {
        return "Neigh";
    }

    @Override
    public String eat(Edible edible) {
        return "smacksmacksmack";
    }
}
