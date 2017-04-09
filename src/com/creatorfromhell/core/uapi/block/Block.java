package com.creatorfromhell.core.uapi.block;

import com.creatorfromhell.core.uapi.meta.MetaHolder;
import com.creatorfromhell.core.uapi.world.Location;
import com.creatorfromhell.core.uapi.world.World;

/**
 * Created by Daniel "creatorfromhell" on 4/9/2017.
 */
public interface Block extends MetaHolder {
  public Material getMaterial();
  public World getWorld();
  public Location getLocation();
  public boolean isLiquid();
  public int getSkyLight();
  public Biome getBiome();
  public double getHumidity();
  public double getTemperature();
}