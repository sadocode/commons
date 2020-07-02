package com.saco.commons.setting;

import java.util.Map;

public interface Configuration {
	public void setConfigFile(String filePath);
	public Map<String, Object> getConfig();
}
