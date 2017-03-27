package com.creatorfromhell.core.uapi.entity;

import com.creatorfromhell.core.uapi.GameMode;

/**
 * Created by Daniel "creatorfromhell" on 3/26/2017.
 */
public interface HumanEntity extends LivingEntity {
    //TODO: Inventory, Permissions
    public GameMode getGameMode();
    public void setGameMode(GameMode gameMode);
    public boolean isOp();
    public boolean setOp(boolean op);
    public int getSleepTicks();
    public void setSleepTicks(int ticks);
    public int getExpLevel();
    public void setExpLevel(int experience);
}
