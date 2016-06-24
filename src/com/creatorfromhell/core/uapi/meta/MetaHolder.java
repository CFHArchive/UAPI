package com.creatorfromhell.core.uapi.meta;

import java.util.List;

import com.creatorfromhell.core.uapi.UPlugin;

public interface MetaHolder {

  public List<MetaValue> getMeta();

  public void addMeta(MetaValue value);

  public void removeMeta(MetaValue value);

  public MetaValue getMeta(String key);

  public List<MetaValue> getMeta(UPlugin owner);
}