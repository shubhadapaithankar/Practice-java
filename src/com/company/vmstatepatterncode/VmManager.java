package com.company.vmstatepatterncode;

public class VmManager {
    private State state;
    private VmPowerOff vmPowerOff = new VmPowerOff(this);
    private VmPowerOn vmPowerOn = new VmPowerOn(this);
    private VmSuspend vmSuspend = new VmSuspend(this);

    public VmManager( ){
        this.state= vmPowerOn;
    }

    public void setState(State state){
        this.state=state;
    }

    public State getVmPowerOffState(){
        return vmPowerOff;
    }
    public State getVmPowerONState(){
        return  vmPowerOn;
    }
    public  State getVmSuspendState(){
        return vmSuspend;
    }

    public void powerOn(){
        state.powerOn();
    }

    public void powerOff(){
        state.powerOff();
    }

    public void reset(){
        state.reset();
    }
    public void suspend(){
        state.suspend();
    }
}
