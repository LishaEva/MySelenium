package com;

import java.util.Properties;

public class PropertyManager {

	public String filename;
	public Properties properties = new Properties();

	public PropertyManager() {
		 this.filename = "./src/main/resources/Utility/config.properties";
	}
	
	public String getProperty(String key) {
		return this.properties.getProperty(key);
	}

	public void setProperty(String key, String value) {
		this.properties.setProperty(key, value);
	}
}
