package com.creatorfromhell.core.uapi.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel "creatorfromhell" on 4/9/2017.
 */
public abstract class Command {
  public abstract String getName();
  public abstract String getPermission();
  public abstract boolean consoleUsable();
  public abstract String[] getHelpLines();
  public List<String> getAliases() {
    return new ArrayList<>();
  }
  public abstract boolean execute(CommandSender sender, String trigger, String[] arguments);
}