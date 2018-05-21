package com.paradm.framework.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public abstract class BaseEntity<ID extends Serializable> implements Serializable {

  private static final long serialVersionUID = -686878249822599953L;

  @Id
  @Column(name = "ID")
  @GeneratedValue(generator = "idGenerator")
  @GenericGenerator(name = "idGenerator", strategy = "com.paradm.id.impl.SnowflakeIdGenerator")
  private ID id;

}
