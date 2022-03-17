package com.company.observerpattern;

public class Main {
    public static void main (String args[]){
        IObserver f22 = new F22();
        IObserver f23 = new F23();
        IObserver f16 = new F16();

        ISubject controlTower = new ControlTower();

        controlTower.addObserver(f22);
        controlTower.addObserver(f16);
        controlTower.notifyObserver();
        controlTower.addObserver(f23);
        controlTower.notifyObserver();

        //remove

        controlTower.removeObserver(f16);
        controlTower.notifyObserver();
    }
}
