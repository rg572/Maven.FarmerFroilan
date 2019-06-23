package com.zipcodewilmington.froilansfarm;

public interface Rider<T extends Rideable> {
   public String mount(T t);
   public String dismount(T t);
   public String getName();
}
