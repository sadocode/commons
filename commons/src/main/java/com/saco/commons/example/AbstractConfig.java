package com.saco.commons.example;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.saco.commons.setting.Configuration;

public class AbstractConfig implements Configuration{
	private String filePath;
	private File configFile;
	
	public AbstractConfig()
	{
		
	}
	public AbstractConfig(String filePath)
	{
		this.setConfigFile(filePath);
	}
	public void setConfigFile(String filePath)
	{
		if(filePath == null || filePath.equals(""))
			throw new IllegalArgumentException();
		
		this.filePath = filePath;
		this.configFile = new File(this.filePath);
	}
	private boolean readConfigFile()
	{
		
		return true;
	}
	public Map<String, Object> getConfig()
	{
		Map<String, Object> resultMap = new HashMap();
		
		return resultMap;
	}
}
