package com.creatorfromhell.core.uapi.entity.living.animal.horse;

import com.creatorfromhell.core.uapi.entity.data.LlamaVariant;

/**
 * Created by Daniel "creatorfromhell" on 4/1/2017.
 */
public interface Llama extends ChestedHorse {
  //TODO: Colours
  public LlamaVariant getVariant();
  public void setVariant(LlamaVariant variant);
}