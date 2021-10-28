package com.testingshastra.util;
import static com.testingshastra.util.PropertiesFile.getObject;//to make easy line no 6,7//no need to write class name for accessing file.

public class Locator {
	
	public static final String SIGNUP_FULLNAME = PropertiesFile.getObject("signup.fullname");
	public static final String SIGNUP_COMPANYNAME =getObject("signup.companyname");
	public static final String SIGNUP_EMAIL =getObject("signup.email");
	public static final String SIGNUP_CONTACT =getObject("signup.contact");
	public static final String SIGNUP_PASSWORD =getObject("signup.password");
	public static final String SIGNUP_IAMNOTROBOT =getObject("signup.iamnotrobot");
	
	
	

}
