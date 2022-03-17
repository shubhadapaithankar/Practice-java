package com.company.practice;

public class Context {
    private State current;

    public Context(){
        current = new StateOne();
    }

    public void goNext(){
        current.goNext(this);

    }
    public void setState(State current){
        this.current=current;

    }
    public void printState(){
        current.printState();
    }
}


