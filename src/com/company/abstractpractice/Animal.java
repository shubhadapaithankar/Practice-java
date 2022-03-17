package com.company.abstractpractice;

public abstract class Animal {
   private String name;

    public String getName() {
        return name;
    }

    public abstract void run();
    public abstract void walk(int[] animalWalks);

    public void eat(){
        System.out.println("Animal is eating");
    }
    public String sleep(){
        return "Sleeping";
    }

}
