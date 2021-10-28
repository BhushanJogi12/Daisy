package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshastra.keywords.UIKeywords;

public class JoinMeetingPage {
	UIKeywords keyword = UIKeywords.getInstannce();
	
	//public By quickJoinMeetingTitle =By.cssSelector("div#navbarContent li:nth-child(1)");//this is also Page object model without findby and factory
	//chances of getting stale element exception
	
	@FindBy(css="h2.m-txt")
	public WebElement quickJoinMeetingTitle;
	
	public JoinMeetingPage() {
		PageFactory.initElements(keyword.driver,this );
	}
	
	public String getQuickJoinMeetingTitle() {
		return quickJoinMeetingTitle.getText();
	}

}
	