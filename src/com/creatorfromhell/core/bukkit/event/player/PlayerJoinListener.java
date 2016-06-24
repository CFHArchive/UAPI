package com.creatorfromhell.core.bukkit.event.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.creatorfromhell.core.uapi.entity.living.player.Player;
import com.creatorfromhell.core.uapi.event.UEventFactory;

public class PlayerJoinListener implements Listener {

  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event) {
    System.out.println("[UAPI]Player joined: "
            + event.getPlayer().getDisplayName());
    Player p = new Player();
    p.setId(event.getPlayer().getUniqueId());
    p.setName(event.getPlayer().getName());
    p.setDisplayName(event.getPlayer().getDisplayName());
    com.creatorfromhell.core.uapi.event.player.PlayerJoinEvent joinEvent = new com.creatorfromhell.core.uapi.event.player.PlayerJoinEvent(
            p, event.getJoinMessage());
    UEventFactory.getInstance().callEvent(joinEvent);
  }
}