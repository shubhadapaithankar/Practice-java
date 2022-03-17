package com.company.gaspumpcommandpattern;

public class One implements Command{
    private Receiver receiver;

    public One(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        receiver.Two();
    }
}
