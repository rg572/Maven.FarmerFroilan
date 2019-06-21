package com.zipcodewilmington.froilansfarm;

public abstract class Storage<T> {

    abstract void cleanUp();
    abstract Integer find(T t);
    abstract void remove(T t);
    abstract void add(T t);




}
