package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private Field field;

    private FarmHouse house;

    private ArrayList<Stable> stables;
    private ArrayList<ChickenCoop> coops;


    public Farm() {

    }

    protected void setUpFarm(){

        field = Field.getINSTANCE();

        // set up farmhouse
        house = FarmHouse.getInstance();
        for(int i = 0; i < 1000; i++){
            house.getFridge().add(Edible.EARCORN);
        }
        for(int i = 0; i < 100; i++){
            house.getFridge().add(Edible.EDAMAME);
            house.getFridge().add(Edible.EGG);
            house.getFridge().add(Edible.OKRA);
            house.getFridge().add(Edible.POTATO);
            house.getFridge().add(Edible.TOMATO);
        }

        // set up stables
        stables = new ArrayList<Stable>();
        for(int i = 0; i < 3; i++){
            stables.add(new Stable());
            for(int j = 0; j < 3; j++){
                stables.get(i).add(new Horse((i)*3 + j + 1));
            }
        }
        stables.get(2).add(new Horse(10));

        // set up coops
        coops = new ArrayList<ChickenCoop>();
        for(int i = 0; i < 3; i++){
            coops.add(new ChickenCoop());
            for(int j=0; j < 3; j++){
                coops.get(i).add(new Chicken( (i)*3+j+1));
            }
        }
        coops.get(2).add(new Chicken(10));

    }


    public List<Stable> getStables(){
        return stables;
    }


    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public FarmHouse getHouse() {
        return house;
    }

    public void setHouse(FarmHouse house) {
        this.house = house;
    }

    public void setStables(ArrayList<Stable> stables) {
        this.stables = stables;
    }

    public List<ChickenCoop> getCoops() {
        return coops;
    }

    public void setCoops(ArrayList<ChickenCoop> coops) {
        this.coops = coops;
    }
}
