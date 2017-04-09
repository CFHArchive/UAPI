package com.creatorfromhell.core.uapi;

import com.creatorfromhell.core.uapi.command.CommandHandler;
import com.creatorfromhell.core.uapi.entity.living.human.Player;
import com.creatorfromhell.core.uapi.world.World;

import java.util.List;
import java.util.UUID;

public interface UServer {
  public UPluginLoader getLoader();
  public ServerType getServerType();
  // TODO: Custom event handling & registration.
  // TODO: Command handling
  public CommandHandler getCommandHandler();
  public void registerListener(String event);
  public Player getPlayer(String name);
  public Player getPlayer(UUID id);
  public void broadcast(String message);
  public void broadcast(String message, String permission);
  public String getName();
  public String getIP();
  public String getVersion();
  public int getMaxPlayers();
  public World getDefaultWorld();
  public List<World> getWorlds();
}