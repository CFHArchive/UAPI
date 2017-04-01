package com.creatorfromhell.core.uapi.entity.living.animal;

import com.creatorfromhell.core.uapi.entity.Animal;

import java.util.UUID;

/**
 * Created by Daniel "creatorfromhell" on 3/31/2017.
 */
public interface Tameable extends Animal {
  public Tamer getTamer();
  public boolean isSitting();
  public void setSitting(boolean isSitting);
}