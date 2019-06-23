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
        // set up field
        field = new Field();
        field.plantRow(new CropRow<CornStalk>());
        field.plantRow(new CropRow<TomatoPlant>());
        field.plantRow(new CropRow<TomatoPlant>());
        field.plantRow(new CropRow<OkraPlant>());
        field.plantRow(new CropRow<PotatoPlant>());
        field.plantRow(new CropRow<SoyPlant>());

        // set up farmhouse
        house = FarmHouse.getInstance();
        for(int i = 0; i < 1000; i++){
            house.getFridge().add(new EarCorn());
        }
        for(int i = 0; i < 100; i++){
            house.getFridge().add(new Edamame());
            house.getFridge().add(new Okra());
            house.getFridge().add(new Potato());
            house.getFridge().add(new Tomato());
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
        for(int i = 0; i < 4; i++){
            coops.add(new ChickenCoop());
            for(int j=0; j < 3; j++){
                coops.get(i).add(new Chicken());
            }
        }
        for(int i= 0; i < 3; i++){
            coops.get(i).add(new Chicken());
        }
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
