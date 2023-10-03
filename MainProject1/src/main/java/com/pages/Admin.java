package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.testbase.TestBase;
import com.wrapper.Wrapper;

public class Admin extends TestBase {
	public Wrapper wrapperObj;
	 @FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[1]")
		WebElement adminButton;
		
	@FindBy(xpath="(//input[@class=\"oxd-input oxd-input--active\"])[2]")
	WebElement username;
	@FindBy(xpath="(//div[@class=\"oxd-select-text-input\"])[1]")
	WebElement userrole;
	@FindBy(xpath="//input[@placeholder=\"Type for hints...\"]")
	WebElement employeename ;
	@FindBy(xpath="(//div[@class=\"oxd-select-text-input\"])[2]")
	WebElement status;
   @FindBy(xpath="//button[@type=\"submit\"]")
	WebElement searchButton;
   
   
   
   @FindBy(xpath="(//a[@class=\"oxd-topbar-body-nav-tab-item\"])[2]")
   WebElement addemployeeButton;
   @FindBy(xpath="//input[@name=\"firstName\"]")
   WebElement firstname ;
   @FindBy(xpath="//input[@name=\"middleName\"]")
   WebElement middlename;
   @FindBy(xpath="//input[@name=\"lastName\"]")
   WebElement lastname ;
   @FindBy(xpath="//button[@type=\"submit\"]")
   WebElement saveButton ;
   @FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[2]")
	WebElement pimButton;
   
   
   @FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[4]")
	WebElement timeButton;
   @FindBy(xpath="//input[@placeholder=\"Type for hints...\"]")
  	WebElement timeemployeename;
   @FindBy(xpath="//button[@type=\"submit\"]")
  	WebElement viewButton;
   
   
   @FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12 ]")
	WebElement buzzButton;
   @FindBy(xpath="//button[@class=\"oxd-button oxd-button--medium oxd-button--label-warn orangehrm-post-filters-button\"]")
	WebElement recentpostButton;
   @FindBy(xpath="(//button[@class=\"oxd-button oxd-button--medium oxd-button--text orangehrm-post-filters-button\"])[1]")
	WebElement mostlikedButton ;
   @FindBy(xpath="(//button[@class=\"oxd-button oxd-button--medium oxd-button--text orangehrm-post-filters-button\"])[2]")
    WebElement mostcommentedbutton ;
   @FindBy(xpath="//textarea[@class=\"oxd-buzz-post-input\"]")
  	WebElement newsfeed;
   
   
   @FindBy(xpath=" //a[@class=\"oxd-topbar-body-nav-tab-item\"]")
	WebElement submitclaimButton;
   @FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[11]")
	WebElement claimButton;
   @FindBy(xpath=" (//div[@class=\"oxd-select-text-input\"])[1]")
	WebElement event;
   @FindBy(xpath="(//div[@class=\"oxd-select-text-input\"])[2]")
	WebElement currency;
   @FindBy(xpath="//button[@type=\"submit\"]")
	WebElement createButton;
   @FindBy(xpath="//button[@type=\"submit\"]")
  	WebElement postButton;  
	
	 public Admin() {
		  
	 	 PageFactory.initElements(driver,this);
	 	wrapperObj=new Wrapper();
	  }
	 public void Search() throws InterruptedException { 
		 wrapperObj.waitToBeClickable(driver,adminButton);
		 adminButton.click();
		 wrapperObj.waitToBeClickable(driver, username);
		 username.sendKeys("vinu123");
		 wrapperObj.waitToBeClickable(driver, userrole);
		 userrole.sendKeys(Keys.ENTER);
		 userrole.sendKeys(Keys.ARROW_DOWN);
		 userrole.sendKeys(Keys.ARROW_DOWN);
		 userrole.sendKeys(Keys.ENTER);
		 Thread.sleep(5000);
		 employeename.sendKeys("vinu B");
		 wrapperObj.waitToBeClickable(driver, status);
		 status.sendKeys(Keys.ENTER);
		 status.sendKeys(Keys.ARROW_DOWN);
		 status.sendKeys(Keys.ARROW_DOWN);
		 status.sendKeys(Keys.ENTER);
		 wrapperObj.waitToBeClickable(driver, searchButton);
		 searchButton.click();
	 }
	 public void AddEmployee() throws InterruptedException{
		 wrapperObj.waitToBeClickable(driver,pimButton);
		 pimButton.click();
		 wrapperObj.waitToBeClickable(driver,addemployeeButton);
		 addemployeeButton.click();
		 wrapperObj.waitToBeClickable(driver,firstname);
		 firstname.sendKeys("manu");
		 wrapperObj.waitToBeClickable(driver,middlename);
		 middlename.sendKeys("v");
		 wrapperObj.waitToBeClickable(driver,lastname);
		 lastname.sendKeys("s");
		 wrapperObj.waitToBeClickable(driver,saveButton);
		 saveButton.click();
	 }
	 public void Time() throws InterruptedException{
		 wrapperObj.waitToBeClickable(driver,timeButton);
		 timeButton.click();
		 wrapperObj.waitToBeClickable(driver,timeemployeename);
		 timeemployeename.sendKeys("vinu B");
		 wrapperObj.waitToBeClickable(driver,viewButton);
		 viewButton.click();
		 
}
	 
	 public void Buzz() throws InterruptedException{
		 wrapperObj.waitToBeClickable(driver,buzzButton);
        buzzButton.click();
        wrapperObj.waitToBeClickable(driver,recentpostButton);
        recentpostButton.click();
        wrapperObj.waitToBeClickable(driver,mostlikedButton);
        mostlikedButton.click();
        wrapperObj.waitToBeClickable(driver,mostcommentedbutton);
        mostcommentedbutton.click();
}
	 
	 public void Claim() throws InterruptedException{
		 wrapperObj.waitToBeClickable(driver,claimButton);
		 claimButton.click();
		 wrapperObj.waitToBeClickable(driver,submitclaimButton);
		 submitclaimButton.click();
		 wrapperObj.waitToBeClickable(driver,event);
		 event.sendKeys(Keys.ENTER);
		 event.sendKeys(Keys.ARROW_DOWN);
		 event.sendKeys(Keys.ARROW_DOWN);
		 event.sendKeys(Keys.ENTER);
		 wrapperObj.waitToBeClickable(driver,currency);
		 currency.sendKeys(Keys.ENTER);
		 currency.sendKeys(Keys.ARROW_DOWN);
		 currency.sendKeys(Keys.ARROW_DOWN);
		 currency.sendKeys(Keys.ENTER);
		 wrapperObj.waitToBeClickable(driver,createButton);
		 createButton.click();
		
	 }
	 public void BuzzNewsFeed() throws InterruptedException{
		 wrapperObj.waitToBeClickable(driver,buzzButton);
        buzzButton.click();
        wrapperObj.waitToBeClickable(driver,newsfeed);
        newsfeed.sendKeys("Feeling Happy");
        wrapperObj.waitToBeClickable(driver,postButton);
        postButton.click();
	 }
}
	 