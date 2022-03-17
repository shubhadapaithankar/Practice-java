package com.company.vmstatepatterncode;

public class Client {

    public static void main (String args[]){
        VmManager vmManager = new VmManager();
        vmManager.powerOn();
        vmManager.powerOff();
        vmManager.suspend();

    }
}
