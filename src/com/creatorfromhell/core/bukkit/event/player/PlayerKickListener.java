package com.creatorfromhell.core.bukkit.event.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;

import com.creatorfromhell.core.uapi.entity.living.player.Player;
import com.creatorfromhell.core.uapi.event.UEventFactory;

public class PlayerKickListener implements Listener {

  @EventHandler
  public void onPlayerKick(PlayerKickEvent event) {
    Player p = new Player();
    p.setId(event.getPlayer().getUniqueId());
    p.setName(event.getPlayer().getName());
    p.setDisplayName(event.getPlayer().getDisplayName());
    com.creatorfromhell.core.uapi.event.player.PlayerKickEvent kickEvent = new com.creatorfromhell.core.uapi.event.player.PlayerKickEvent(
            p, event.getLeaveMessage(), event.getReason());
    UEventFactory.getInstance().callEvent(kickEvent);
  }
}