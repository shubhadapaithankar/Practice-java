package com.company.practice;

public class StateThree extends State {

    public void goNext(Context in){
        System.out.println("inside state Three");
        in.setState(new StateOne());
    }

    @Override
    public void printState() {
        System.out.println("this is state three");
    }
}
