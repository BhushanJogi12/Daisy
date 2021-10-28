package com.testingshastra.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This Class contains UIKeywords which are applicable for WebElement and
 * general actions. This is a singleton class.To create a object of this class
 * ,use{@code getInstance()}
 * 
 * @author BHUSHAN
 *
 */

public class UIKeywords {
	public RemoteWebDriver driver = null;

	private static UIKeywords uikeywords;
	static {
		uikeywords = new UIKeywords();
	}

	public static UIKeywords getInstannce() {
		return uikeywords;
		// TODO Auto-generated method stub

	}

	private UIKeywords() {
	}

	/**
	 * This Keyword is used to launch specified browser.
	 * 
	 * @author BHUSHAN
	 * 
	 * @param browserName must be one of the following:
	 *                    <ul>
	 *                    <li>chrome</li>
	 *                    <li>firefox</li>
	 *                    <li>InternetExplorer</li>
	 *                    <ul/>
	 * 
	 */

	public void openBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else {
			System.err.println("Invalid browser name :" + browserName);
		}

	}

	public void closeBrowser() {
		driver.close();

	}

	public void quiteBrowser() {
		driver.quit();

	}

	public void launchUrl(String url) {
		driver.get(url);
	}
	public void enterText(WebElement element,String textToEnter) {//overloading  applied-- for getting web element
		element.sendKeys(textToEnter);
	}
	/**
	 * In next version  of framework ,this method will be deleted .insted  you can use enterText(String object,String textToEnter)
	 * @param locatorType
	 * @param textToEnter
	 */
	// (This method is not in use)
	public void enterText(String locatorType, String locatorValue) {//otherwise with the help of type and value..
		getWebElement(locatorType, locatorValue).sendKeys("textToEnter");

	}

	public WebElement getWebElement(String locatorType, String locatorValue) {
		WebElement element = null;
		if (locatorType.equalsIgnoreCase("xpath")) {
			element = driver.findElement(By.xpath(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("css")) {
			element = driver.findElement(By.cssSelector(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("id")) {
			element = driver.findElement(By.id(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("name")) {
			element = driver.findElement(By.name(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("class")) {
			element = driver.findElement(By.className(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("tag")) {
			element = driver.findElement(By.tagName(locatorValue));
		}
		return element;

	}
	public void switchToFrameAt(int index) {
		driver.switchTo().frame(index);

	}
	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();

	}
	public void switchToFrame(WebElement frame) {
		driver.switchTo().frame(frame);

	}
	public void switchToFrame(String idOrName) {
		driver.switchTo().frame(idOrName);

	}

	public String getTitleOfPage() {
		return driver.getTitle();
	}
       public String getCurrentUrl() {
    	  return driver.getCurrentUrl();

}
	public void enterText(String locatorType, String locatorValue, String textToEnter) {
		if (locatorType.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locatorValue)).sendKeys(textToEnter);
		}
		if (locatorType.equalsIgnoreCase("css")) {
			driver.findElement(By.cssSelector(locatorValue)).sendKeys(textToEnter);
		}
		if (locatorType.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locatorValue)).sendKeys(textToEnter);
		}
		if (locatorType.equalsIgnoreCase("name")) {
			driver.findElement(By.name(locatorValue)).sendKeys(textToEnter);
		}
		if (locatorType.equalsIgnoreCase("class")) {
			driver.findElement(By.className(locatorValue)).sendKeys(textToEnter);
		}
		if (locatorType.equalsIgnoreCase("tag")) {
			driver.findElement(By.tagName(locatorValue)).sendKeys(textToEnter);
		}

	}

	public void click(WebElement element) {
		element.click();

	}

	public void EnterText(WebElement element, String textToEnter) {
		element.sendKeys(textToEnter);

	}

	public RemoteWebDriver getDriver() {
		return driver;
	}

	public void click(String locatorType, String locatorValue) {
		getWebElement(locatorType, locatorValue).click();
	}
	public void enterText1(String object,String textToEnter) {
		String[] parts = object.split("##");
		getWebElement(parts[0],parts[1]).sendKeys(textToEnter);
		
	
	}
	
	
	 
		 
		

}



