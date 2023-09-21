package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class Performance extends TestBase {
	
	Wrapper wrprObj6=new Wrapper();
	
	//Performance Module
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[7]")
	WebElement performanceModule;
	
	//Employee Tracker
	@FindBy(xpath="(//a[@class='oxd-topbar-body-nav-tab-item'])[2]")
	WebElement employeeTracker;
	
	//Employee Name
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement employeeName;
	
	//Search Button
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement searchButton;
	
	//Record Found
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span'])[1]")
	WebElement recordFoundMessage;
	
	public Performance() {       
	       PageFactory.initElements(driver, this);	       
	}

	public String employeePerformanceTracker() throws InterruptedException {
		wrprObj6.webDriverWaitToBeClickable(driver, performanceModule);
		performanceModule.click();
		wrprObj6.webDriverWaitToBeClickable(driver, employeeTracker);
		employeeTracker.click();
		wrprObj6.webDriverWaitToBeClickable(driver, employeeName);
		employeeName.click();
		employeeName.sendKeys("Nina Patel");
		Thread.sleep(5000);
		employeeName.sendKeys(Keys.ARROW_DOWN);  //dynamic name dropdown
		employeeName.sendKeys(Keys.ENTER);
		wrprObj6.webDriverWaitToBeClickable(driver, searchButton);
		searchButton.click();
		wrprObj6.webDriverWaitToBeClickable(driver, recordFoundMessage);
		String pValue1=recordFoundMessage.getText();
		return pValue1;
	}
}
