package com.company.statePattern;

public class Land implements State {
    private F16 f16;

    public Land(F16 f16) {
        this.f16 = f16;
    }

    @Override
    public void pilotTaxis() {

    }

    @Override
    public void pilotParks() {
        f16.setState(f16.getParkedState());
        System.out.println("in Parked state");

    }

    @Override
    public void pilotEjects() {
        f16.setState(f16.getCrashState());
        System.out.println("this is crashed state");


    }

    @Override
    public void pilotLands() {

    }

    @Override
    public void pilotFlies() {

    }
}
