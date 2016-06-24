package com.creatorfromhell.core.canary.event.player;

import net.canarymod.hook.HookHandler;
import net.canarymod.hook.player.ConnectionHook;
import net.canarymod.plugin.PluginListener;

import com.creatorfromhell.core.uapi.entity.living.player.Player;
import com.creatorfromhell.core.uapi.event.UEventFactory;
import com.creatorfromhell.core.uapi.event.player.PlayerJoinEvent;

public class ConnectionListener implements PluginListener {

  @HookHandler
  public void onConnection(ConnectionHook hook) {
    Player p = new Player();
    p.setId(hook.getPlayer().getUUID());
    p.setName(hook.getPlayer().getName());
    p.setDisplayName(hook.getPlayer().getDisplayName());
    PlayerJoinEvent joinEvent = new PlayerJoinEvent(p, hook.getMessage());
    UEventFactory.getInstance().callEvent(joinEvent);
  }
}