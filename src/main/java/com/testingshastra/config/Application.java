package com.testingshastra.config;

import com.testingshastra.util.PropertiesFile;

public class Application {
	
	private static final String FILEPATH = "/src/main/resources/application.properties";
	
	public String getBrowser() {
		return PropertiesFile.getProperty(FILEPATH,"Chrome");

	}
	public String getAppUrl() {
		return PropertiesFile.getProperty(FILEPATH,"daisy.dev.app.url");
		

	}
	public void getDbUrl() {
PropertiesFile.getProperty(FILEPATH,"daisy.dev.db.url");
	}

}
