package com.testingshastra.pages;//PAGE OBJECT MODEL

 

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshastra.keywords.UIKeywords;

public class HomePage {
	UIKeywords keyword =UIKeywords.getInstannce();
     
	public WebElement navbarContent;//name or id---no need to write find by
	
    @CacheLookup 
	@FindBy(css="div#navbarContent li:nth-child(1)")//automatically call to driver instance and call find variable method and set the web element with the locator.
	public WebElement joinMeetingTab;
	 
	
	@FindBy(css="div-footer-last-view-support div:nth-child(3) li a")
	public List<WebElement>infoLinks;

	
	public HomePage() {
	 PageFactory.initElements(keyword.driver,this);
	}	
	
	
	public void clickOnJoinMeetingTab() {
		joinMeetingTab.click();

	}
	public void getTextOfInfoLinks() {
		Iterator<WebElement> itr = infoLinks.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
	}
		public void rightClickOnNavBar() {
			Actions act = new Actions(keyword.driver);
			act.contextClick(navbarContent).build().perform();

		}
			
		

	}
	
	
		 
	


