package com.creatorfromhell.core.uapi.event.player;

import com.creatorfromhell.core.uapi.entity.living.player.Player;

public class PlayerKickEvent extends PlayerEvent {

  private String message;
  private String reason;

  public PlayerKickEvent(Player kicked, String message, String reason) {
    super(kicked);
    this.message = message;
    this.reason = reason;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }
}
