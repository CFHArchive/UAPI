package com.creatorfromhell.core.uapi.event.player;

import com.creatorfromhell.core.uapi.event.UEvent;

import java.util.UUID;

public class PlayerEvent extends UEvent {

  protected UUID player;

  public PlayerEvent(UUID player) {
    this.player = player;
  }

  public final UUID getPlayer() {
    return player;
  }
}