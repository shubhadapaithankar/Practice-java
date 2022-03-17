package com.company.observerpattern;

public class F23 implements IObserver{
    @Override
    public void update() {
        System.out.println("F23 has received the update");
    }
}
