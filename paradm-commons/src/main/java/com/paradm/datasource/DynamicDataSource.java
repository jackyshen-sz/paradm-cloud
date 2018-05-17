package com.paradm.datasource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.paradm.Utility;

public class DynamicDataSource extends AbstractRoutingDataSource {

  private static final Logger log = LoggerFactory.getLogger(DynamicDataSource.class);

  @Override
  protected Object determineCurrentLookupKey() {
    String dataSourceType = DataSourceContextHolder.getDataSourceType();
    if (Utility.isEmpty(dataSourceType)) {
      dataSourceType = "defaultDataSource";
    }
    log.debug("--------> use datasource {}", dataSourceType);
    return dataSourceType;
  }

}
