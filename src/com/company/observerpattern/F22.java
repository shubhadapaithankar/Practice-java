package com.company.observerpattern;

public class F22 implements IObserver{
    @Override
    public void update() {
        System.out.println("F22 has received the update");

    }
}
