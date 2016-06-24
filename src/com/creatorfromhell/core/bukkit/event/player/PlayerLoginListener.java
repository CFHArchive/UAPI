package com.creatorfromhell.core.bukkit.event.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

import com.creatorfromhell.core.uapi.entity.living.player.Player;
import com.creatorfromhell.core.uapi.event.UEventFactory;

public class PlayerLoginListener implements Listener {

  @EventHandler
  public void onPlayerLogin(PlayerLoginEvent event) {
    Player p = new Player();
    p.setId(event.getPlayer().getUniqueId());
    p.setName(event.getPlayer().getName());
    p.setDisplayName(event.getPlayer().getDisplayName());
    com.creatorfromhell.core.uapi.event.player.PlayerConnectEvent connectEvent = new com.creatorfromhell.core.uapi.event.player.PlayerConnectEvent(
            p, event.getAddress(), event.getKickMessage());
    UEventFactory.getInstance().callEvent(connectEvent);
  }
}