package com.creatorfromhell.core.uapi.world;

import com.creatorfromhell.core.uapi.UPlugin;
import com.creatorfromhell.core.uapi.meta.MetaHolder;
import com.creatorfromhell.core.uapi.meta.MetaValue;

import java.util.ArrayList;
import java.util.List;

public class World implements MetaHolder {

  private List<MetaValue> metadata = new ArrayList<>();
  private String name;
  private WorldBorder border;

  public World(String name) {
    this.name = name;
    this.border = new WorldBorder();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;

    final World compare = (World) obj;
    if (!name.equals(compare.getName())) return false;
    return true;
  }

  @Override
  public String toString() {
    return "name=" + name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorldBorder getBorder() {
    return border;
  }

  public void setBorder(WorldBorder border) {
    this.border = border;
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