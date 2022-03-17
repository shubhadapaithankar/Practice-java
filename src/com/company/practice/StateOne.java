package com.company.practice;

public class StateOne extends State {
    @Override
    public void goNext(Context in) {
        System.out.println("Inside State one...");
        in.setState(new StateTwo());
    }

    @Override
    public void printState() {
        System.out.println("This is state one");
    }
}
