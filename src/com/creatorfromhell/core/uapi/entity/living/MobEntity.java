package com.creatorfromhell.core.uapi.entity.living;

import com.creatorfromhell.core.uapi.entity.LivingEntity;

public class MobEntity extends LivingEntity {

  private LivingEntity target;

  public LivingEntity getTarget() {
    return target;
  }

  public void setTarget(LivingEntity target) {
    this.target = target;
  }

}