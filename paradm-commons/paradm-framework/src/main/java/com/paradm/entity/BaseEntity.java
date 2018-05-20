package com.paradm.entity;

import java.io.Serializable;

public abstract class BaseEntity<I extends Serializable> implements Serializable {

  private static final long serialVersionUID = -686878249822599953L;

  public abstract I getId();

  public abstract void setId(I id);

}
