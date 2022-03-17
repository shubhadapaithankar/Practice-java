package com.company.gaspumpcommandpattern;

public class GasPump implements Receiver{
    @Override
    public void pressRed() {
        System.out.println("RedButton");
    }

    @Override
    public void pressBlue() {
        System.out.println("BlueButton");

    }

    @Override
    public void One() {
        System.out.println("Press One");

    }

    @Override
    public void Two() {
        System.out.println("Press Two");

    }
}
