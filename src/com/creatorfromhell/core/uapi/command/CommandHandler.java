package com.creatorfromhell.core.uapi.command;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Daniel "creatorfromhell" on 4/9/2017.
 */
public class CommandHandler {
  private Map<String, Command> commandMap = new HashMap<>();

  public boolean execute(CommandSender sender, String trigger, String[] arguments) {
    for(Command command : commandMap.values()) {
      if(command.getName().equals(trigger) || command.getAliases().contains(trigger)) {
        return command.execute(sender, trigger, arguments);
      }
    }
    return false;
  }

  public void registerAll(List<Command> commands) {
    for(Command command : commands) {
      register(command);
    }
  }

  public void register(Command command) {
    commandMap.put(command.getName(), command);
  }
}