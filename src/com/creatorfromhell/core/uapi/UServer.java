package com.creatorfromhell.core.uapi;

import com.creatorfromhell.core.uapi.entity.Player;
import com.creatorfromhell.core.uapi.world.World;

import java.util.List;
import java.util.UUID;

public abstract class UServer {

  protected UPluginLoader loader;

  public UServer(UPluginLoader loader) {
    this.loader = loader;
  }

  public UPluginLoader getLoader() {
    return loader;
  }

  public abstract ServerType getServerType();

  // TODO: Custom event handling & registration.
  // TODO: Command handling

  public abstract void registerListener(String event);
  public abstract Player getPlayer(String name);
  public abstract Player getPlayer(UUID id);
  public abstract void broadcast(String message);
  public abstract void broadcast(String message, String permission);
  public abstract String getName();
  public abstract String getIP();
  public abstract String getVersion();
  public abstract int getMaxPlayers();
  public abstract World getDefaultWorld();
  public abstract List<World> getWorlds();
}