package com.zipcodewilmington.froilansfarm;

public interface Rider<T extends Rideable> {
   public void mount(T t);
   public void dismount(T t);
   public String getName();
}
