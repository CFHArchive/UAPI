package com.creatorfromhell.core.uapi.entity.living;

import com.creatorfromhell.core.uapi.entity.Ageable;
import com.creatorfromhell.core.uapi.entity.data.VillagerProfession;

/**
 * Created by Daniel "creatorfromhell" on 3/31/2017.
 */
public interface Villager extends Ageable {
  public VillagerProfession getProfession();
  public void setProfession(VillagerProfession profession);
  public boolean isZombie();
}