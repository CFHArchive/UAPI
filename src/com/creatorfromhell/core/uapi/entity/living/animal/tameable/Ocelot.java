package com.creatorfromhell.core.uapi.entity.living.animal.tameable;

import com.creatorfromhell.core.uapi.entity.living.animal.Tameable;
import com.creatorfromhell.core.uapi.entity.data.OcelotType;

/**
 * Created by Daniel "creatorfromhell" on 3/31/2017.
 */
public interface Ocelot extends Tameable {
  public OcelotType getOcelotType();
  public void setOcelotType(OcelotType type);
}
