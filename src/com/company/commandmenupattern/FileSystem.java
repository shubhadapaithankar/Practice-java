package com.company.commandmenupattern;

public class FileSystem implements Receiver{
    @Override
    public void addFile() {
        System.out.println("File is added");
    }

    @Override
    public void removeFile() {
        System.out.println("File is remove");

    }

    @Override
    public void undoFile() {
        System.out.println("File is Undo");

    }

    @Override
    public void deleteFile() {
        System.out.println("File is deleted");

    }
}
