package com.paradm.framework.generator;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.paradm.id.SnowflakeIdWorker;

@Component
public class ParadmIdGenerator implements IdentifierGenerator {

  @Autowired
  private SnowflakeIdWorker snowflakeIdWorker;

  @Override
  public Serializable generate(SessionImplementor session, Object object) throws HibernateException {
    return snowflakeIdWorker.nextId();
  }

}
