package com.company.practice;

public class StateTwo extends State {

    public void goNext(Context in){
        System.out.println("inside state two");
        in.setState(new StateThree());
    }

    @Override
    public void printState() {
        System.out.println("this is state two");
    }
}
