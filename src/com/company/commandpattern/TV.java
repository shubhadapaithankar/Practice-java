package com.company.commandpattern;

public class TV implements Receiver{
    @Override
    public void volumeUp() {
        System.out.println("Volume is up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume is Down");
    }

    @Override
    public void tvON() {
        System.out.println("TV is On................Hello");

    }

    @Override
    public void tvOff() {
        System.out.println("Tv is Off.............");
    }
}
