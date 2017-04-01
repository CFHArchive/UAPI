package com.creatorfromhell.core.uapi.entity.living.animal.tameable;

import com.creatorfromhell.core.uapi.entity.living.animal.Tameable;

/**
 * Created by Daniel "creatorfromhell" on 3/31/2017.
 */
public interface Wolf extends Tameable {
  public boolean isAngry();
  public void setAngry(boolean isAngry);
  //TODO: Collar colors
}