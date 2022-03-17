package com.company.commandmenupattern;

public class DeleteFile implements Command{
    private Receiver receiver;

    public DeleteFile(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        receiver.removeFile();

    }
}
