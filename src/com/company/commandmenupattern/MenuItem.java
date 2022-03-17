package com.company.commandmenupattern;

import java.util.HashMap;
import java.util.Map;

public class MenuItem implements Invoke{
   Map<String,Command> map = new HashMap<>();

    @Override
    public void execute(String key) {
      Command command = map.get(key);
      command.execute();
    }

    @Override
    public void setCommand(String key, Command command) {
        map.put(key, command);

    }
}
