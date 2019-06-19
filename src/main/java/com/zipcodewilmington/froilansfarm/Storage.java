package com.zipcodewilmington.froilansfarm;

public abstract class Storage<T> {

    abstract void cleanUp();
    abstract T find();
    abstract T remove();
    abstract T add();



}
