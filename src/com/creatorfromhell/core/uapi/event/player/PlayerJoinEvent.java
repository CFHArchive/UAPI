package com.creatorfromhell.core.uapi.event.player;

import com.creatorfromhell.core.uapi.entity.living.player.Player;

public class PlayerJoinEvent extends PlayerEvent {

  private String message;

  public PlayerJoinEvent(Player joined, String message) {
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