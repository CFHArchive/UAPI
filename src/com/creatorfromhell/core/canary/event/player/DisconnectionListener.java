package com.creatorfromhell.core.canary.event.player;

import net.canarymod.hook.HookHandler;
import net.canarymod.hook.player.DisconnectionHook;
import net.canarymod.plugin.PluginListener;

import com.creatorfromhell.core.uapi.entity.living.player.Player;
import com.creatorfromhell.core.uapi.event.UEventFactory;
import com.creatorfromhell.core.uapi.event.player.PlayerLeaveEvent;

public class DisconnectionListener implements PluginListener {

  @HookHandler
  public void onDisconnect(DisconnectionHook hook) {
    Player p = new Player();
    p.setId(hook.getPlayer().getUUID());
    p.setName(hook.getPlayer().getName());
    p.setDisplayName(hook.getPlayer().getDisplayName());

    PlayerLeaveEvent leaveEvent = new PlayerLeaveEvent(p,
            hook.getLeaveMessage());
    UEventFactory.getInstance().callEvent(leaveEvent);
  }
}
