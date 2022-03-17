package com.company.vmstatepatterncode;

public class VmPowerOn implements State{
    private VmManager vmManager;
    public VmPowerOn(VmManager vmManager) {
        this.vmManager=vmManager;

    }

    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {
        vmManager.setState(vmManager.getVmPowerOffState());
        System.out.println("This is PowerOff state of vm");

    }

    @Override
    public void suspend() {
        vmManager.setState(vmManager.getVmPowerOffState());
        System.out.println("This is Suspend State of vm");
    }

    @Override
    public void reset() {
        vmManager.setState(vmManager.getVmPowerONState());
        System.out.println("This is reset state of vm");

    }
}
