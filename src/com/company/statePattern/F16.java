package com.company.statePattern;

public class F16 {
    private State state;
    private Airborne airborne = new Airborne(this);
    private Land land = new Land(this);
    private Parked parked = new Parked(this);
    private Taxi taxi = new Taxi(this);
    private Crash crash = new Crash(this);

    public F16() {
        this.state = parked;
    }

    public void setState(State state) {
        this.state = state;
    }



    public State getAirborneState() {
        return airborne;
    }

    public State getLandState() {
        return land;
    }

    public State getParkedState() {
        return parked;
    }

    public State getTaxiState() {
        return taxi;
    }

    public State getCrashState() {
        return crash;
    }


  //Define F16 behaviour

    public void park() {
        state.pilotParks();

    }
    public void taxi(){
        state.pilotTaxis();
    }
    public void airborne(){
        state.pilotFlies();
    }
    public void land(){
        state.pilotLands();
    }
    public void crash(){
        state.pilotEjects();
    }
}
