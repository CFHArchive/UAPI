package com.creatorfromhell.core.uapi.event;

public class UEvent {

  String name;

  public String getName() {
    if (name == null) {
      name = getClass().getSimpleName();
    }
    return name;
  }
}