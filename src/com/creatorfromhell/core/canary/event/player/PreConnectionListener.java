package com.creatorfromhell.core.canary.event.player;

import java.net.InetAddress;
import java.net.UnknownHostException;

import net.canarymod.hook.HookHandler;
import net.canarymod.hook.player.PreConnectionHook;
import net.canarymod.plugin.PluginListener;

import com.creatorfromhell.core.uapi.entity.living.player.Player;
import com.creatorfromhell.core.uapi.event.UEventFactory;
import com.creatorfromhell.core.uapi.event.player.PlayerConnectEvent;

public class PreConnectionListener implements PluginListener {

  @HookHandler
  public void onPreConnection(PreConnectionHook hook) {
    InetAddress address = null;
    try {
      address = InetAddress.getByName(hook.getIp());
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
    Player p = new Player();
    p.setId(hook.getUUID());
    p.setName(hook.getName());
    p.setDisplayName(hook.getName());
    PlayerConnectEvent connectEvent = new PlayerConnectEvent(p, address,
            hook.getKickReason());

    UEventFactory.getInstance().callEvent(connectEvent);
  }
}