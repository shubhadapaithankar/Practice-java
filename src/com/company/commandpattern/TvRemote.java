package com.company.commandpattern;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class TvRemote implements Invoker{

    Map<String,Command> map = new HashMap<>();
    @Override
    public void execute(String key) {
        Command command = map.get(key);
        command.execute();
    }

    @Override
    public void setCommand(String key, Command command) {
        map.put(key,command);

    }
}
