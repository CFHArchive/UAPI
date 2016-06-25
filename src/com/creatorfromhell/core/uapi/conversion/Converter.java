package com.creatorfromhell.core.uapi.conversion;

import com.creatorfromhell.core.uapi.entity.living.player.Player;
import com.creatorfromhell.core.uapi.world.Location;
import com.creatorfromhell.core.uapi.world.Vector;
import com.creatorfromhell.core.uapi.world.World;

/**
 * Used to convert common classes to their UAPI equivalent
 * @author Daniel
 *
 */
public interface Converter {
  public Player convertPlayer(Object playerClass);
  public Vector convertVector(Object vectorClass);
  public Location convertLocation(Object locationClass);
  public World convertWorld(Object worldClass);
  public Object fromUAPIPlayer(Player playerClass);
  public Object fromUAPILocation(Location locationClass);
  public Object fromUAPIWorld(World worldClass);
}