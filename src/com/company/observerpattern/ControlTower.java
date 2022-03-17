package com.company.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class ControlTower implements ISubject{

    private List<IObserver> observerList;

    public ControlTower(){
        observerList = new ArrayList<>();
    }
    @Override
    public void addObserver(IObserver observer) {
        observerList.add(observer);

    }

    @Override
    public void removeObserver(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer: observerList){
            observer.update();
        }

    }
}
