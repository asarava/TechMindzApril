package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;
import com.wrapper.Wrapper;

public class AdminMain extends TestBase {
	
     public Wrapper wrapperObj;
     
	
	@FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[1]")
	WebElement adminButton;
	
	@FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[2]")
	WebElement pimButton;
	@FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[3]")
	WebElement leaveButton;
	@FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[4]")
	WebElement timeButton;
	@FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[5]")
	WebElement recruitmentButton;
	@FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[6]")
	WebElement myinfoButton;
	@FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[7]")
	WebElement performanceButton;
	@FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[8]")
	WebElement dashboardButton;
	@FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[9]")
	WebElement directoryButton;
	@FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[10]")
	WebElement maintenanceButton;
	@FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[11]")
	WebElement claimButton;
	@FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12 ]")
	WebElement buzzButton;
	@FindBy(xpath="//button[@type=\"button\"]")
	WebElement cancelButton;
	
	 public AdminMain() {
		wrapperObj=new Wrapper();
	 	 PageFactory.initElements(driver,this);
	  }
public void Admin() throws InterruptedException { 
 wrapperObj.waitToBeClickable(driver,adminButton);
	Thread.sleep(5000);
 	adminButton.click();
 	
 }
public void PIM() throws InterruptedException { 
 	//Thread.sleep(5000);
	wrapperObj.waitToBeClickable(driver,pimButton);
 	pimButton.click();
 }
public void Leave() throws InterruptedException { 
 	//Thread.sleep(5000);
	wrapperObj.waitToBeClickable(driver,leaveButton);
 	leaveButton.click();
 }

public void Recruitment() throws InterruptedException { 
 	//Thread.sleep(5000);
	wrapperObj.waitToBeClickable(driver,recruitmentButton);
 	recruitmentButton.click();
 }
public void Myinfo() throws InterruptedException { 
 	//Thread.sleep(5000);
	wrapperObj.waitToBeClickable(driver,myinfoButton);
 	myinfoButton.click();
 }
public void Performance() throws InterruptedException { 
 	//Thread.sleep(5000);
	wrapperObj.waitToBeClickable(driver,performanceButton);
 	performanceButton.click();
 }
public void Dashboard() throws InterruptedException { 
 	//Thread.sleep(5000);
	wrapperObj.waitToBeClickable(driver,dashboardButton);
 	dashboardButton.click();
 }
public void Directory() throws InterruptedException { 
 	//Thread.sleep(5000);
	wrapperObj.waitToBeClickable(driver,directoryButton);
 	directoryButton.click();
 }
public void Maintenance() throws InterruptedException { 
 	//Thread.sleep(5000);
	wrapperObj.waitToBeClickable(driver,maintenanceButton);
 	maintenanceButton.click();
 	wrapperObj.waitToBeClickable(driver,cancelButton);
 	cancelButton.click();
 	
 }

public void Buzz() throws InterruptedException { 
 	//Thread.sleep(5000);
	wrapperObj.waitToBeClickable(driver,buzzButton);
 	buzzButton.click();
 }
}
