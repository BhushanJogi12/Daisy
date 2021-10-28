	package com.testingshastra.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.devtools.v85.runtime.Runtime.GetPropertiesResponse;

public class PropertiesFile {

	public static String getProperty(String fileName, String key) {
		String value = "";
		
		return value;

	}

	/**
	 * This method returnsthe value of locator mention in ObjectRepository
	 * @author BHUSHAN
	 * @return 
	 * @throws FileNotFoundException 
	 */
	public static String getObject(String fileName,String key)  {
		String dir =System.getProperty("user.dir");
		String value = "";
		try {
			FileInputStream fis = new FileInputStream(dir+fileName);//for reading data from file
			Properties prop = new Properties();
			 prop.load(fis);
			value = prop.getProperty(key);
			} 
		 catch (FileNotFoundException e) {
			e.printStackTrace();
		 }
		catch (IOException e) {
			e.printStackTrace();
		}
		return value;
		
	}
	public static String getObject(String key)  {
	return	getProperty("/src/test/resources/ObjectRepository.properties",key);
		 
	}
	} 



