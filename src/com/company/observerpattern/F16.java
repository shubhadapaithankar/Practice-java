package com.company.observerpattern;

public class F16 implements IObserver{
    @Override
    public void update() {
        System.out.println("F16 has received the update");

    }
}
