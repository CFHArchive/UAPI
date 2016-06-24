package com.creatorfromhell.core.uapi.event.player;

import java.net.InetAddress;

import com.creatorfromhell.core.uapi.entity.living.player.Player;

public class PlayerConnectEvent extends PlayerEvent {

  private String message;
  private InetAddress address;

  public PlayerConnectEvent(Player connected, InetAddress address,
          String message) {
    super(connected);
    this.message = message;
    this.address = address;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InetAddress getAddress() {
    return address;
  }

  public void setAddress(InetAddress address) {
    this.address = address;
  }

  public String getHostname() {
    return address.getHostAddress();
  }
}