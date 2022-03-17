package com.company.commandmenupattern;

public class Client {

    public static void main (String args[]){
        Receiver fileSystem = new FileSystem();

        Command fileAdd = new AddFile(fileSystem);
        Command deleteFile = new DeleteFile(fileSystem);
        Command undoFile = new UndoFile(fileSystem);


        Invoke manuItem = new MenuItem();

        manuItem.setCommand("addFile", fileAdd);
        manuItem.setCommand("removeFile",deleteFile);
        manuItem.setCommand("undofile",undoFile);


        manuItem.execute("addFile");
        manuItem.execute("removeFile");
        manuItem.execute("undofile");

    }
}
