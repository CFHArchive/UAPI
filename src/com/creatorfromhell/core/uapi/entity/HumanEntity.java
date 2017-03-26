package com.creatorfromhell.core.uapi.entity;

/**
 * Created by Daniel "creatorfromhell" on 3/26/2017.
 */
public interface HumanEntity extends LivingEntity {
    //TODO: Inventory, Permissions
    public boolean isOp();
    public boolean setOp(boolean op);
    public int getSleepTicks();
    public void setSleepTicks(int ticks);
}
