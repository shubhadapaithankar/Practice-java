package com.company.gaspumpcommandpattern;

public interface Invoker {
    public void setCommand(String key, Command command);
    public void execute(String key);
}
