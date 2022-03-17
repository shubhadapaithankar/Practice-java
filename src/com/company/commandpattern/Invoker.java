package com.company.commandpattern;

public interface Invoker {

    public void execute(String key);
    public void setCommand(String key, Command command);
}
