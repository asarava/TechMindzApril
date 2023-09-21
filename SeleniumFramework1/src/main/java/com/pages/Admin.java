package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class Admin extends TestBase {
	
	Wrapper wrprObj3=new Wrapper();
	
	//Admin Module
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Admin']")
	WebElement adminModule;
	
	//Add button
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement addButton;
	
	//User Role
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
	WebElement userRoledropdown;
	
	//EmployeeName
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement employeeName;
	
	//Status Dropdown
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
	WebElement statusDropdown;
	
	//Username
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[1]")
	WebElement username;
	
	//password
	@FindBy(xpath="(//input[@type='password'])[1]")
	WebElement password;
	
	//confirm password
	@FindBy(xpath="(//input[@type='password'])[2]")
	WebElement confirnPassword;
	
	//Save Button
	@FindBy(xpath="//button[@type='submit']")
	WebElement saveButton;
	
	//user output
	@FindBy(xpath="//div[contains(text(), 'raviss2')]")
	WebElement userOutput;
	
	//Second page button
	

	public Admin() {       
	       PageFactory.initElements(driver, this);	       
	}
	
	public void userAccountCreation() throws InterruptedException {			
			
		    wrprObj3.webDriverWaitToBeClickable(driver, adminModule);
		    adminModule.click();
		    wrprObj3.webDriverWaitToBeClickable(driver, addButton);
		    addButton.click();
		    wrprObj3.webDriverWaitToBeClickable(driver, userRoledropdown);
		    userRoledropdown.click();
		    for (int i=0;i<2;i++) {
		    	userRoledropdown.sendKeys(Keys.ARROW_DOWN);
		    }
		    userRoledropdown.click();
		    userRoledropdown.sendKeys(Keys.ENTER);
		    wrprObj3.webDriverWaitToBeClickable(driver, employeeName);
		    employeeName.click();
		    employeeName.sendKeys("Ravi M B");
		    Thread.sleep(5000);
		    employeeName.sendKeys(Keys.ARROW_DOWN);
		    employeeName.sendKeys(Keys.ENTER);
		    wrprObj3.webDriverWaitToBeClickable(driver, statusDropdown);
		    statusDropdown.click();
		    for(int i=0;i<1;i++) {
		    	statusDropdown.sendKeys(Keys.ARROW_DOWN);
		    }
		    statusDropdown.click();
		    statusDropdown.sendKeys(Keys.ENTER);
		    wrprObj3.webDriverWaitToBeClickable(driver, username);
		    username.click();
		    username.sendKeys("raviss2");
		    Thread.sleep(5000);
		    username.sendKeys(Keys.ARROW_DOWN);
		    username.sendKeys(Keys.ENTER);
		    wrprObj3.webDriverWaitToBeClickable(driver, password);
		    password.click();
		    password.sendKeys("Busticket1");
		    wrprObj3.webDriverWaitToBeClickable(driver, confirnPassword);
		    confirnPassword.click();
		    confirnPassword.sendKeys("Busticket1");
		    wrprObj3.webDriverWaitToBeClickable(driver, saveButton);
		    saveButton.click();
		}
	}


