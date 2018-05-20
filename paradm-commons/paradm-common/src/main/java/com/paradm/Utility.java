package com.paradm;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class Utility {

  private static final Logger log = LoggerFactory.getLogger(Utility.class);

  public static boolean isEmpty(String str) {
    return StringUtils.isEmpty(str) || StringUtils.isEmpty(str.trim());
  }

  public static boolean isEmpty(StringBuffer stringBuffer) {
    return (null == stringBuffer || stringBuffer.length() == 0 || stringBuffer.toString().trim().equals(""));
  }

  public static boolean isEmpty(Object[] array) {
    return (null == array || array.length == 0);
  }

  public static boolean isEmpty(Object val) {
    return (null == val);
  }

  public static <T> boolean isEmpty(Collection<T> c) {
    return (null == c || c.size() == 0);
  }
}
