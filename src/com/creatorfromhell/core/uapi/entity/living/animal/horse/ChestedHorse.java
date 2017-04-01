package com.creatorfromhell.core.uapi.entity.living.animal.horse;

import com.creatorfromhell.core.uapi.entity.living.animal.AbstractHorse;

/**
 * Created by Daniel "creatorfromhell" on 4/1/2017.
 */
public interface ChestedHorse extends AbstractHorse {
  public boolean hasChest();
  public void setHasChest(boolean hasChest);
}