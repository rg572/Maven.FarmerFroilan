package com.zipcodewilmington.froilansfarm;

public interface Rider<T extends Rideable> {
   public void mount();
   public void dismount();
}
