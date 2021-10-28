package com.testingshastra.UItests;

import org.apache.log4j.DailyRollingFileAppender;

import org.apache.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//working on IJMeet application
import com.testingshastra.config.BaseClass;
import com.testingshastra.keywords.UIKeywords;
import com.testingshastra.util.Locator;
import com.testingshastra.util.TestListener;
import com.testingshastra.util.WaitFor;


@Listeners(TestListener.class)
public class SignUpPageTests extends BaseClass {

	private static final Logger LOG = Logger.getLogger(SignUpPageTests.class);
	private static final WaitFor WaitFor = null;
	UIKeywords keyword = UIKeywords.getInstannce();

	@Test
	public void validateFullNameFieldForCorrectInput() {
		String url = "https://www.ijmeet.com";
		keyword.launchUrl(url);

		LOG.info("Url is launched:" +url);
		// Approch 1
		// WebElement signup =
		// keyword.getDriver().findElement(By.cssSelector("li:nth-child(5)
		// a.nav-link"));
		// keyword.click(signup);
		// Approch 2
		keyword.click("css","li:nth-child(5) a.nav-link");// we can use this line
		LOG.info("Clicked on Register button");
		// except 15 and 17
		keyword.enterText(Locator.SIGNUP_FULLNAME, "Bhushan Jogi");
		keyword.enterText(Locator.SIGNUP_COMPANYNAME, "Testing Shastra");
		keyword.enterText(Locator.SIGNUP_EMAIL, "info@testingshastra.com");
		keyword.enterText(Locator.SIGNUP_CONTACT, "9130502135");
		keyword.enterText(Locator.SIGNUP_PASSWORD, "Test@123");
		keyword.switchToFrameAt(0);
		LOG.info("Switched inside a frame");
		WaitFor.elementToBeClicable(keyword.getWebElement("css","div.recaptcha-checkbox-border"));
		keyword.switchToDefaultContent();
		LOG.info("Jumped back from frame");
		keyword.click("css", "button[type='submit']");
		String actualUrl = keyword.getCurrentUrl();
		Assert.assertTrue(actualUrl.contains("dashboard"));

	}

}
