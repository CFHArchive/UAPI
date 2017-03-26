package com.creatorfromhell.core.uapi;

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
}