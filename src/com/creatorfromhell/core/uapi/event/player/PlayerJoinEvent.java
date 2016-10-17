package com.creatorfromhell.core.uapi.event.player;

import java.util.UUID;

public class PlayerJoinEvent extends PlayerEvent {

  private String message;

  public PlayerJoinEvent(UUID joined, String message) {
    super(joined);
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}