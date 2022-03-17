package com.company.vmstatepatterncode;

public class VmSuspend implements State{
    private VmManager vmManager;
    public VmSuspend(VmManager vmManager) {
        this.vmManager=vmManager;
    }

    @Override
    public void powerOn() {
        vmManager.setState(vmManager.getVmPowerONState());
        System.out.println("Vm is on now");

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
