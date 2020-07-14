package com.saco.commons.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AbstractConfig {
	private static String filePath;
	private static Properties properties;
	
	public AbstractConfig()
	{
		//
	}
	public AbstractConfig(String configFilePath)
	{
		setConfigFile(configFilePath);
	}
	public static void setConfigFile(String configFilePath)
	{
		if(configFilePath == null || configFilePath.equals(""))
			throw new IllegalArgumentException();
		
		filePath = configFilePath;
		loadConfigFile();
	}
	private static boolean loadConfigFile()
	{
		try(FileInputStream fis = new FileInputStream(filePath))
		{
			properties = new Properties();
			properties.load(fis);
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace(System.out);
			// error log
		}
		return true;
	}
	public static String getProp(String key, String defaultValue)
	{
		String result = getProp(key);
		
		if(result == null | result.length() == 0)
			result = defaultValue;
		
		return result;
	}
	public static String getProp(String key)
	{
		if(key == null | key.length() == 0)
			return null;
		
		return properties.getProperty(key);
	}
}
