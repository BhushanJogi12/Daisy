package com.testingshastra.UItests;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testingshastra.config.BaseClass;
import com.testingshastra.keywords.UIKeywords;
import com.testingshastra.pages.HomePage;
import com.testingshastra.pages.JoinMeetingPage;
import com.testingshastra.util.WaitFor;

public class HomePageTests extends BaseClass {
	UIKeywords keyword = UIKeywords.getInstannce();

	@Test
	public void verifyTitleOfHomePage() {
		String expectedTitle = "IJMeet";

		Assert.assertEquals(keyword.driver.getTitle(), expectedTitle);
	}

	@Test
	public void verifyIfUserRedirectsToJoinMeetingPage() throws InterruptedException {
		HomePage home = new HomePage();
		home.rightClickOnNavBar();
		Thread.sleep(5000);

		home.clickOnJoinMeetingTab();

		JoinMeetingPage joinmeeting = new JoinMeetingPage();
		WaitFor.elementToBeVisible(joinmeeting.quickJoinMeetingTitle, 10);
		String actual = joinmeeting.getQuickJoinMeetingTitle();
          Assert.assertTrue(actual.contains("Quick"), "Actual Heading:" + actual);

	}

	@Test
	public void printAllInfoLinks() {
		HomePage home = new HomePage();
		home.getTextOfInfoLinks();

	}

}
