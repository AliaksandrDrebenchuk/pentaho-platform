package org.pentaho.platform.plugin.services.cache;

public interface EhCacheMBean {

  Long getElementCountInMemory();

  Long getElementCountOnDisk();

  String getKeys();

}
