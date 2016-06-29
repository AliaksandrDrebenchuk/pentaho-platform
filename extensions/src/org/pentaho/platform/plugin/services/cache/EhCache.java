package org.pentaho.platform.plugin.services.cache;

import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.cache.Cache;

public class EhCache implements EhCacheMBean {

  private Cache cache;

  public EhCache( Cache cache ) {
    super();
    this.cache = cache;
  }

  @Override
  public Long getElementCountInMemory() {
    return cache.getElementCountInMemory();
  }

  @Override
  public Long getElementCountOnDisk() {
    return cache.getElementCountOnDisk();
  }

  @Override
  public String getKeys() {
    Set keys = cache.toMap().keySet();
    return StringUtils.join( keys.iterator(), "|||" );
  }

}
