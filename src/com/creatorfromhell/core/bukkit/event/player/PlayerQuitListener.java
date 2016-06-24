package com.creatorfromhell.core.bukkit.event.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import com.creatorfromhell.core.uapi.entity.living.player.Player;
import com.creatorfromhell.core.uapi.event.UEventFactory;

public class PlayerQuitListener implements Listener {

  @EventHandler
  public void onPlayerQuit(PlayerQuitEvent event) {
    Player p = new Player();
    p.setId(event.getPlayer().getUniqueId());
    p.setName(event.getPlayer().getName());
    p.setDisplayName(event.getPlayer().getDisplayName());
    com.creatorfromhell.core.uapi.event.player.PlayerLeaveEvent leaveEvent = new com.creatorfromhell.core.uapi.event.player.PlayerLeaveEvent(
            p, event.getQuitMessage());
    UEventFactory.getInstance().callEvent(leaveEvent);
  }
}