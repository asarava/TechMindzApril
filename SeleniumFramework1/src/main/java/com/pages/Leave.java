package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class Leave extends TestBase{
	
	Wrapper wrprObj4=new Wrapper();
	
	//Leave module
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Leave']")
	WebElement leaveModule;
	
	//Leave List Button
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-item' and text()='Leave List']")
	WebElement leaveList;
	
	//Leave Type
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
	WebElement leaveType;
	
	//Search Button
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchButton;	
	
	//Record Found Text
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span']")
	WebElement recordFoundText;
	
	public Leave() {       
	       PageFactory.initElements(driver, this);	       
	}
		
	public String viewLeaveBasedOnLeaveType() throws InterruptedException {
		wrprObj4.webDriverWaitToBeClickable(driver, leaveModule);
		leaveModule.click();
		wrprObj4.webDriverWaitToBeClickable(driver, leaveList);
		leaveList.click();
		wrprObj4.webDriverWaitToBeClickable(driver, leaveType);
		leaveType.click();
		for(int i=0;i<4;i++) {
			leaveType.sendKeys(Keys.ARROW_DOWN);	
			Thread.sleep(5000);
		}
		leaveType.click();
		leaveType.sendKeys(Keys.ENTER);
		wrprObj4.webDriverWaitToBeClickable(driver, searchButton);
		searchButton.click();
		Thread.sleep(5000);
		//wrprObj4.webDriverWaitToBeClickable(driver, recordFoundText);
		String pValue=recordFoundText.getText();
		return pValue;
	}
}
