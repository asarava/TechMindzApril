package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class Time extends TestBase {
	
	Wrapper wrprObj12=new Wrapper();
	
	//Time Module
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[4]")
	WebElement timeModule;
	
	//Project Info
	@FindBy(xpath="(//span[@class='oxd-topbar-body-nav-tab-item'])[4]")
	WebElement projectInfo;
	
	//Projects Button
	@FindBy(xpath="(//a[@class='oxd-topbar-body-nav-tab-link'])[2]")
	WebElement projectsButton;
	
	//Customer Name
	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[1]")
	WebElement customerName;
	
	//search button
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchButton;
	
	//Record Found Message
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span'])[1]")
	WebElement recordFoundText;
	
	public Time() {       
	       PageFactory.initElements(driver, this);	       
	}
	
	public String viewProjectInfo() throws InterruptedException {
		wrprObj12.webDriverWaitToBeClickable(driver, timeModule);
		timeModule.click();
		wrprObj12.webDriverWaitToBeClickable(driver, projectInfo);
		projectInfo.click();
		wrprObj12.webDriverWaitToBeClickable(driver, projectsButton);
		projectsButton.click();
		wrprObj12.webDriverWaitToBeClickable(driver, customerName);
		customerName.click();
		customerName.sendKeys("FreeWave Technologies, Inc.");
		//wrprObj12.webDriverWaitToBeClickable(driver, customerName);
		Thread.sleep(5000);
		customerName.sendKeys(Keys.ARROW_DOWN);
		customerName.sendKeys(Keys.ENTER);
		wrprObj12.webDriverWaitToBeClickable(driver, searchButton);
		searchButton.click();
		wrprObj12.webDriverWaitToBeClickable(driver, recordFoundText);
		String pValue=recordFoundText.getText();
		return pValue;
	}
	

}
