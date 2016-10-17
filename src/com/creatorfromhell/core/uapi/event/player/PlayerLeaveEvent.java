package com.creatorfromhell.core.uapi.event.player;

import java.util.UUID;

public class PlayerLeaveEvent extends PlayerEvent {

  private String message;

  public PlayerLeaveEvent(UUID left, String message) {
    super(left);
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
