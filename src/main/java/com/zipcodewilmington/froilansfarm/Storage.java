package com.zipcodewilmington.froilansfarm;

public abstract class Storage<T> {

    abstract void cleanUp(T t);
    abstract T find(T t);
    abstract void remove(T t);
    abstract void add(T t);




}
