package com.creatorfromhell.core.uapi.entity.living.human;

import com.creatorfromhell.core.uapi.world.Location;

/**
 * Created by Daniel "creatorfromhell" on 3/27/2017.
 */
public interface Player extends HumanEntity {
    public String getPlayerListName();
    public void setPlayerListName();
    public Location getCompassTarget();
    public void setCompassTarget();
    public float getSaturation();
    public void setSaturation(float saturation);
    public int getFoodLevel();
    public void setFoodLevel(int foodLevel);
    public boolean isSneaking();
    public void setSneaking(boolean sneaking);
    public boolean isSprinting();
    public void setSprinting(boolean sprinting);
    public boolean allowFlying();
    public void setAllowFlying(boolean allowFlying);
}
