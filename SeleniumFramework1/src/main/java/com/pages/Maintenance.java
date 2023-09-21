package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class Maintenance extends TestBase {
	
	Wrapper wrprObj8=new Wrapper();
	
	//Maintenance Module
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[10]")
	WebElement maintenanceModule;
	
	//Password text box
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordField;
	
	//confirm button
	@FindBy(xpath="//button[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-admin-access-button']")
	WebElement confirmButton;
	
	//Purge Records
	@FindBy(xpath="//span[@class='oxd-topbar-body-nav-tab-item']")
	WebElement purgeRecordsButton;
	
	//Candidate Records
	@FindBy(xpath="(//a[@class='oxd-topbar-body-nav-tab-link'])[2]")
	WebElement candidateRecordsButton;
	
	//vacancy field
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement vacancyField;
	
	//search button
	@FindBy(xpath="(//button[@class='oxd-button oxd-button--medium oxd-button--secondary'])[1]")
	WebElement searchButton;
	
	//records found message
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span']")
	WebElement recordsFoundText;
	
	public Maintenance() {
		PageFactory.initElements(driver, this);
	}
	
	public String vaccancyStatus() throws InterruptedException {
		wrprObj8.webDriverWaitToBeClickable(driver, maintenanceModule);
		maintenanceModule.click();
		wrprObj8.webDriverWaitToBeClickable(driver, passwordField);
		passwordField.sendKeys("admin123");
		wrprObj8.webDriverWaitToBeClickable(driver, confirmButton);
		confirmButton.click();
		wrprObj8.webDriverWaitToBeClickable(driver, purgeRecordsButton);
		purgeRecordsButton.click();
		wrprObj8.webDriverWaitToBeClickable(driver, candidateRecordsButton);
		candidateRecordsButton.click();
		wrprObj8.webDriverWaitToBeClickable(driver, vacancyField);
		vacancyField.click();
		vacancyField.sendKeys("Junior Account Assistant");
		Thread.sleep(5000);
		vacancyField.sendKeys(Keys.ARROW_DOWN);
		vacancyField.sendKeys(Keys.ENTER);
		wrprObj8.webDriverWaitToBeClickable(driver, searchButton);
		searchButton.click();
		wrprObj8.webDriverWaitToBeClickable(driver, recordsFoundText);
		String pValue=recordsFoundText.getText();
		return pValue;
	}

}
