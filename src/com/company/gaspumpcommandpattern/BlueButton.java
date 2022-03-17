package com.company.gaspumpcommandpattern;

public class BlueButton implements Command{
    private Receiver receiver;

    public BlueButton(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        receiver.pressBlue();

    }
}
