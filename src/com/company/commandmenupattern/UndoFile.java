package com.company.commandmenupattern;

public class UndoFile implements Command{
    private Receiver receiver;
    public UndoFile(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        receiver.undoFile();

    }
}
