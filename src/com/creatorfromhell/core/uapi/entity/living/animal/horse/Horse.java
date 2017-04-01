package com.creatorfromhell.core.uapi.entity.living.animal.horse;

import com.creatorfromhell.core.uapi.entity.data.HorseArmour;
import com.creatorfromhell.core.uapi.entity.data.HorseColour;
import com.creatorfromhell.core.uapi.entity.data.HorseStyle;
import com.creatorfromhell.core.uapi.entity.living.animal.AbstractHorse;

/**
 * Created by Daniel "creatorfromhell" on 4/1/2017.
 */
public interface Horse extends AbstractHorse {
  public HorseStyle getStyle();
  public void setStyle(HorseStyle style);
  public HorseColour getColour();
  public void setColour(HorseColour colour);
  public HorseArmour getArmour();
  public void setArmour(HorseArmour armour);
}