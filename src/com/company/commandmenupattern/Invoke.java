package com.company.commandmenupattern;

public interface Invoke {
    public void execute(String key);
    public void setCommand(String key, Command command);
}
