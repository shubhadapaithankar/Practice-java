package com.company.commandmenupattern;

public class AddFile implements Command{
    private Receiver receiver;

    public AddFile (Receiver receiver){
        this.receiver=receiver;
    }
    @Override
    public void execute() {
        receiver.addFile();

    }
}
