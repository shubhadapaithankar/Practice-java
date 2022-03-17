package com.company.gaspumpcommandpattern;

public class Client {

    public static void main(String args[]){

        Receiver nozzle = new GasPump();

        Command pressOne = new One(nozzle);
        Command pressTwo = new Two(nozzle);
        Command redButton = new RedButton(nozzle);
        Command blueButton = new BlueButton(nozzle);

        Invoker display = new Display();

        display.setCommand("pressOne",pressOne);
        display.setCommand("pressTwo",pressTwo);
        display.setCommand("redButton",redButton);
        display.setCommand("blueButton",blueButton);

        display.execute("pressOne");
        display.execute("pressTwo");
        display.execute("redButton");
        display.execute("blueButton");

    }
}
