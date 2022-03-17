package com.company.gaspumpcommandpattern;

import java.util.HashMap;
import java.util.Map;

public class Display implements Invoker{
    Map<String,Command> map = new HashMap<>();

    @Override
    public void setCommand(String key, Command command) {
        map.put(key, command);

    }

    @Override
    public void execute(String key) {
        Command command=map.get(key);
        command.execute();

    }
}
