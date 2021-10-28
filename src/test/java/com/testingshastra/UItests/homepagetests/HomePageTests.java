package com.testingshastra.UItests.homepagetests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testingshastra.config.BaseClass;
import com.testingshastra.keywords.UIKeywords;

@Test

public class HomePageTests extends BaseClass {

	UIKeywords keyword = UIKeywords.getInstannce();
	String expectedTitle="Testing Shastra |Training| Placement" ;

	public void verifyTitleOfHomePage() {
		keyword.launchUrl("https://www.testingshastra.com");
		String title = keyword.getTitleOfPage();
		Assert.assertEquals(title,"expectedTitle");

	}
		

}
//keyword drivern framwork