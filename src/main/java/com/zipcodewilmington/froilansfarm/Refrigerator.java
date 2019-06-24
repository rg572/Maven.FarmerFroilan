package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public  class Refrigerator<T extends Edible> extends Storage<T> {

    private ArrayList<T> food = new ArrayList<>();


    public void remove(T t) {
        food.remove(t);
    }
    public void remove(T t, Eater eater) {
        food.remove(t);
        eater.eat(t);
    }

    public void remove(T t, Integer number, Eater eater){
        for(int i = 0; i < number; i++){
            remove(t, eater);
        }
    }

    public void add(T t) {
        food.add(t);
    }



    public Boolean contains(T edible, Integer number){
        List<T> list = food;
        for(int i = 0; i < number; i++){
            if(list.size() == 0 || !list.contains(edible)){
                return false;
            }
            if(list.size()==1){
                list.clear();
            }
            else{
                list = list.subList(1, list.size());
            }
        }
        return true;
    }


    public Integer getNumberOf(T edible) {
        Integer count = 0;
        for (T t : food) {
            if (t.equals(edible)) {
                count++;
            }
        }
        return count;
    }



}