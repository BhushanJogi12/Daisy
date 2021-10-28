package com.testingshastra.config;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.testingshastra.keywords.UIKeywords;
import com.testingshastra.util.PropertiesFile;

public class BaseClass {
	UIKeywords keyword  = UIKeywords.getInstannce();
	 public RemoteWebDriver driver = null;
	
	@BeforeClass
	public void setUp() {
		Application app =new Application();
		keyword.openBrowser(app.getBrowser());
		this.driver = keyword.getDriver();
		driver.get(app.getAppUrl());
	 
	
	
	}
	@AfterClass
	public void tearDown() {
		keyword.quiteBrowser();
		
		
		
	}
		
		
		
	}
		
	
	


