package com.creatorfromhell.core.uapi.entity.living.water;

import com.creatorfromhell.core.uapi.entity.WaterMob;

/**
 * Created by Daniel "creatorfromhell" on 3/30/2017.
 */
public interface Guardian extends WaterMob {
  public boolean isElder();
  public void setElder(boolean isElder);
}
