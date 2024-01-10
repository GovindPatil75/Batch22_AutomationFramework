package com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigdataProvider {
	
	Properties pro;
	public ConfigdataProvider() throws Exception {
		
		String filepath="C:\\Users\\Dell\\eclipse-workspace\\Batch22_AutomationFramework\\Config\\config.Properties";
		FileInputStream file=new FileInputStream(filepath);
		pro=new Properties();
		pro.load(file);
	}

	public String getBaseUrl() {
		
		return pro.getProperty("BaseUrl");
	}
	
	public String getBrowsername() {
		return pro.getProperty("Browsername");
	}
	
	public String getBrowserEdge() {
		return pro.getProperty("BrowserEdge");
	}
}
