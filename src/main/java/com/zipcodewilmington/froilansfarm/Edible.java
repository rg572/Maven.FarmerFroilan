package com.zipcodewilmington.froilansfarm;

public enum Edible {

    EGG,
    OKRA,
    TOMATO,
    POTATO,
    EDAMAME,
    EARCORN;


    Edible() {
    }

    @Override
    public String toString() {
        String[] foods = {"egg", "okra", "tomato", "potato", "edamame", "ear of corn"};
        return foods[this.ordinal()];
    }
}
