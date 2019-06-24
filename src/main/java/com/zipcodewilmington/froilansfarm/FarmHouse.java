package com.zipcodewilmington.froilansfarm;


import java.util.ArrayList;

public class FarmHouse extends House {

    public static FarmHouse getInstance() {
        return Instance;
    }


    private final static FarmHouse Instance= new FarmHouse();
    private Refrigerator<Edible> fridge;
    private Tractor tractor;
    private CropDuster cropDuster;
    private CombineHarvester combineHarvester;
    private ArrayList<Person> inhabitants;

    protected FarmHouse() {
        fridge = new Refrigerator<Edible>();
        tractor = Tractor.getINSTANCE();
        cropDuster = CropDuster.getINSTANCE();
        combineHarvester = new CombineHarvester();
    }

    public Refrigerator<Edible> getFridge(){
        return fridge;
    }


    @Override
    public void remove(Person person) {
        inhabitants.remove(person);
    }

    @Override
    public void add(Person person) {
        inhabitants.add(person);
    }
}
