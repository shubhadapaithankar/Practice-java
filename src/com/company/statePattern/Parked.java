package com.company.statePattern;

public class Parked implements State {
    private F16 f16;

    public Parked(F16 f16) {
        this.f16 = f16;
    }

    @Override
    public void pilotTaxis() {
        f16.setState(f16.getTaxiState());
        System.out.println("This is taxi state now..");
    }

    @Override
    public void pilotParks() {
        f16.setState(f16.getParkedState());
        System.out.println("F16 is in Parked State: ");
    }

    @Override
    public void pilotEjects() {
        f16.setState(f16.getCrashState());
        System.out.println("f16 is in Crashed State");

    }

    @Override
    public void pilotLands() {

    }

    @Override
    public void pilotFlies() {

    }
}
