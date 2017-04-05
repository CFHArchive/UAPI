package com.creatorfromhell.core.uapi.entity.living.ambient;

import com.creatorfromhell.core.uapi.entity.Ambient;

/**
 * Created by Daniel "creatorfromhell" on 4/1/2017.
 */
public interface Bat extends Ambient {
  public boolean isHanging();
  public void setHanging(boolean hanging);
}