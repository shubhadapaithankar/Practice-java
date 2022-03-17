package com.company.statePattern;

public class Airborne implements State {
    private F16 f16;

    public Airborne(F16 f16) {
        this.f16 = f16;
    }

    @Override
    public void pilotTaxis() {

    }

    @Override
    public void pilotParks() {

    }

    @Override
    public void pilotEjects() {
        f16.setState(f16.getCrashState());
        System.out.println("this is crash state");

    }

    @Override
    public void pilotLands() {
        f16.setState(f16.getLandState());
        System.out.println("this is in land state");

    }

    @Override
    public void pilotFlies() {

    }

}
