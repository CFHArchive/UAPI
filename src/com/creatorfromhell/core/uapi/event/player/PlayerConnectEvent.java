package com.creatorfromhell.core.uapi.event.player;

import java.net.InetAddress;
import java.util.UUID;

public class PlayerConnectEvent extends PlayerEvent {

  private String message;
  private InetAddress address;

  public PlayerConnectEvent(UUID connected, InetAddress address,
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