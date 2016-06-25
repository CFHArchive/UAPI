package com.creatorfromhell.core.uapi;

import com.creatorfromhell.core.uapi.conversion.Converter;

public abstract class UServer {

  protected UPluginLoader loader;

  public UServer(UPluginLoader loader) {
    this.loader = loader;
  }

  public UPluginLoader getLoader() {
    return loader;
  }

  public abstract Converter getConverter();
  public abstract ServerType getServerType();

  // TODO: Custom event handling & registration.

  public abstract void registerListener(String event);
}