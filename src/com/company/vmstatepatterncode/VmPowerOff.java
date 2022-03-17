package com.company.vmstatepatterncode;

public class VmPowerOff implements State{
    private VmManager vmManager;
    public VmPowerOff(VmManager vmManager) {
        this.vmManager=vmManager;

    }

    @Override
    public void powerOn() {
        vmManager.setState(vmManager.getVmPowerONState());
        System.out.println("Vm is PowerOn state");

    }

    @Override
    public void powerOff() {

    }

    @Override
    public void suspend() {

    }

    @Override
    public void reset() {

    }
}
