package com.saco.commons.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.saco.commons.config.AbstractConfig;

public class ExampleConfig extends AbstractConfig{

	private static String filePath;
	private static Properties properties;
	
	public ExampleConfig()
	{
		
	}
	public ExampleConfig(String configFilePath)
	{
		super.setConfigFile(configFilePath);
	}
}
