package com.paradm.doa;

import java.io.Serializable;

import com.paradm.entity.BaseEntity;
import com.paradm.model.BaseModel;

public interface BaseDao<I extends Serializable, T extends BaseEntity<I>, TE extends BaseModel<?>> {

  int deleteByExample(TE model);
}
