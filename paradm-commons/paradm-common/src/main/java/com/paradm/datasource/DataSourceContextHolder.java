package com.paradm.datasource;

import java.util.ArrayList;
import java.util.List;

/**
 * dynamic data source context
 * 
 * @author Jackyshen
 *
 */
public class DataSourceContextHolder {

  /**
   * When using the ThreadLocal maintenance variable,
   * 
   * ThreadLocal provides a separate copy of the variable for each thread that uses the variable.
   */
  private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

  /**
   * Manage all data source ids
   * 
   * Mainly to determine whether the data source exists.
   */
  public static List<String> dataSourceIds = new ArrayList<String>();

  /**
   * 
   * @param dataSourceType
   */
  public static void setDataSourceType(String dataSourceType) {
    contextHolder.set(dataSourceType);
  }

  public static String getDataSourceType() {
    return contextHolder.get();
  }

  public static void clearDataSourceType() {
    contextHolder.remove();
  }

  /**
   * 
   * @param dataSourceId
   * @return
   */
  public static boolean containsDataSource(String dataSourceId) {
    return dataSourceIds.contains(dataSourceId);
  }
}
