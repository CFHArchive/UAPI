package com.creatorfromhell.core.canary.event.player;

import net.canarymod.hook.HookHandler;
import net.canarymod.hook.player.KickHook;
import net.canarymod.plugin.PluginListener;

import com.creatorfromhell.core.uapi.entity.living.player.Player;
import com.creatorfromhell.core.uapi.event.UEventFactory;
import com.creatorfromhell.core.uapi.event.player.PlayerKickEvent;

public class KickListener implements PluginListener {

  @HookHandler
  public void onKick(KickHook hook) {
    Player p = new Player();
    p.setId(hook.getKickedPlayer().getUUID());
    p.setName(hook.getKickedPlayer().getName());
    p.setDisplayName(hook.getKickedPlayer().getDisplayName());

    PlayerKickEvent kickEvent = new PlayerKickEvent(p,
            "Not supported by CanaryLib", hook.getReason());
    UEventFactory.getInstance().callEvent(kickEvent);
  }
}