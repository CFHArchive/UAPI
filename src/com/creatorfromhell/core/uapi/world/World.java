package com.creatorfromhell.core.uapi.world;

import com.creatorfromhell.core.uapi.UPlugin;
import com.creatorfromhell.core.uapi.entity.Entity;
import com.creatorfromhell.core.uapi.entity.LivingEntity;
import com.creatorfromhell.core.uapi.entity.Player;
import com.creatorfromhell.core.uapi.meta.MetaHolder;
import com.creatorfromhell.core.uapi.meta.MetaValue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public interface World extends MetaHolder {
  public String getName();
  public UUID getUniqueId();
  public Dimension getDimension();
  public WorldType getType();
  public long getTime();
  public void setTime(long time);
  public List<Entity> getEntities();
  public List<LivingEntity> getLiving();
  public List<Player> getPlayers();
  public void broadcast(String message);
  public void broadcast(String message, String permission);
}