package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class Directory extends TestBase {
	
	Wrapper wrprObj7=new Wrapper();
	
	//Directory Module
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[9]")
	WebElement directoryModule;
	
	//Job title dropdown
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
	WebElement jobTitleDropdown;
	
	//search button
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement searchButton;
	
	//Record Found 
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span']")
	WebElement recordFound;
	
	
	public Directory() {       
	       PageFactory.initElements(driver, this);	       
	}
	
	public String employeeSearch() throws InterruptedException {
		wrprObj7.webDriverWaitToBeClickable(driver, directoryModule);
		directoryModule.click();
		wrprObj7.webDriverWaitToBeClickable(driver, jobTitleDropdown);
		jobTitleDropdown.click();
		for (int i=0;i<6;i++) {
			jobTitleDropdown.sendKeys(Keys.ARROW_DOWN);
		}
		jobTitleDropdown.click();
		jobTitleDropdown.sendKeys(Keys.ENTER);
		wrprObj7.webDriverWaitToBeClickable(driver, searchButton);
		searchButton.click();
		Thread.sleep(5000);
		//wrprObj7.webDriverWaitToBeClickable(driver, recordFound);
		String pValue=recordFound.getText();
		return pValue;
	}


}
