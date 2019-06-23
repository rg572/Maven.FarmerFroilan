package com.zipcodewilmington.froilansfarm;

import java.util.List;

public class Farm {

    private Field field;

    private FarmHouse house;

    private List<Stable> stables;
    private List<ChickenCoop> coops;


    public Farm() {

    }

    protected void setUpFarm(){
        // setup field
        field = new Field();
        field.plantRow(new CropRow<CornStalk>());
        field.plantRow(new CropRow<TomatoPlant>());
        field.plantRow(new CropRow<TomatoPlant>());
        field.plantRow(new CropRow<OkraPlant>());
        field.plantRow(new CropRow<PotatoPlant>());
        field.plantRow(new CropRow<SoyPlant>());

        // setup farmhouse
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
    }



}
