package com.company.abstractpractice;

public abstract class Snake extends Animal {

    public void run(){
        System.out.println("Snake can't run");
    }
    public abstract void walk(int[] animalWalks);
}

