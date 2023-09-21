package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class Buzz extends TestBase {
	
	Wrapper wrprObj10=new Wrapper();
	
	//Buzz Module
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[12]")
	WebElement buzzModule;
	
	//Buzz NewsFeed Text
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-text--card-title orangehrm-buzz-newsfeed-title']")
	WebElement buzzNewsFeedText;
	
	public Buzz() {
		PageFactory.initElements(driver, this);
	}

	public String viewBuzzNewsfeed() {
		wrprObj10.webDriverWaitToBeClickable(driver, buzzModule);
		buzzModule.click();
		wrprObj10.webDriverWaitToBeClickable(driver, buzzNewsFeedText);
		String pValue=buzzNewsFeedText.getText();
		return pValue;
	}
}
