package com.company.gaspumpcommandpattern;

public class Two implements Command{
    private Receiver receiver;

    public Two(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        receiver.Two();
    }
}
