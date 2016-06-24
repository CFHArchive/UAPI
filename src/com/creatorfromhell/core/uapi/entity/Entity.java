package com.creatorfromhell.core.uapi.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.creatorfromhell.core.uapi.UPlugin;
import com.creatorfromhell.core.uapi.meta.MetaHolder;
import com.creatorfromhell.core.uapi.meta.MetaValue;
import com.creatorfromhell.core.uapi.world.Location;
import com.creatorfromhell.core.uapi.world.Vector;

public class Entity implements MetaHolder {

  private List<MetaValue> metadata = new ArrayList<MetaValue>();
  private UUID id;
  private Location loc;
  private Vector velocity;
  private int fireTicks;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Location getLoc() {
    return loc;
  }

  public void setLoc(Location loc) {
    this.loc = loc;
  }

  public Vector getVelocity() {
    return velocity;
  }

  public void setVelocity(Vector velocity) {
    this.velocity = velocity;
  }

  public int getFireTicks() {
    return fireTicks;
  }

  public void setFireTicks(int fireTicks) {
    this.fireTicks = fireTicks;
  }

  @Override
  public List<MetaValue> getMeta() {
    return metadata;
  }

  @Override
  public void addMeta(MetaValue value) {
    metadata.add(value);
  }

  @Override
  public void removeMeta(MetaValue value) {
    metadata.remove(value);
  }

  @Override
  public MetaValue getMeta(String key) {
    for (MetaValue v : metadata) {
      if (v.getKey().equals(key)) { return v; }
    }
    return null;
  }

  @Override
  public List<MetaValue> getMeta(UPlugin owner) {
    if (owner == null) { return metadata; }

    List<MetaValue> owned = new ArrayList<MetaValue>();

    for (MetaValue v : metadata) {
      if (v.getOwner().equals(owner)) {
        owned.add(v);
      }
    }

    return owned;

  }
}