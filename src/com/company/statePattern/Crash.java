package com.company.statePattern;

public class Crash implements State {
    private F16 f16;

    public Crash(F16 f16) {
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

    }

    @Override
    public void pilotLands() {

    }

    @Override
    public void pilotFlies() {

    }
}
