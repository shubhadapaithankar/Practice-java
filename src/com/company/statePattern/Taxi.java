package com.company.statePattern;

public class Taxi implements State {
    private F16 f16;

    public Taxi(F16 f16) {
        this.f16 = f16;
    }

    @Override
    public void pilotTaxis() {

    }

    @Override
    public void pilotParks() {
        f16.setState(f16.getParkedState());
        System.out.println("F16 is now parked state");

    }

    @Override
    public void pilotEjects() {

    }

    @Override
    public void pilotLands() {

    }

    @Override
    public void pilotFlies() {
        f16.setState(f16.getAirborneState());
        System.out.println("f16 is now airbourn state");

    }
}
