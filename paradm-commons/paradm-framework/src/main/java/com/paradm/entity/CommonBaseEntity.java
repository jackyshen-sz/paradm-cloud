package com.paradm.entity;

import java.io.Serializable;
import java.util.Date;

public abstract class CommonBaseEntity<I extends Serializable> extends BaseEntity<I> {

  private static final long serialVersionUID = 5495757434956228827L;

  public abstract void setCreateTime(Date nowDate);

  public abstract void setUpdateTime(Date nowDate);

}
