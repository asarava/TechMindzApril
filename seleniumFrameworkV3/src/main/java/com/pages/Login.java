package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbase.TestBase;
import com.wrapper.Wrapper;

public class Login extends TestBase {
	 public Wrapper wrapperObj;
	 @FindBy(xpath="//button[@type=\"submit\"]")
		WebElement customerLoginButton;
	 @FindBy(xpath="//input[@name=\"username\"]")
		WebElement username;
	 @FindBy(xpath="//input[@type=\"password\"]")
		WebElement password;
	 

  public Login() {
	  
 	 PageFactory.initElements(driver,this);
 	wrapperObj=new Wrapper();
  }
  public void FalseLogin() throws InterruptedException { 
	    wrapperObj.waitToBeClickable(driver, username);
	 	username.sendKeys("admin");
	 	password.sendKeys("admin");
	 	wrapperObj.waitToBeClickable(driver,customerLoginButton);
	 	customerLoginButton.click();
	 }
 	 
public void adminLogin() throws InterruptedException { 
 	Thread.sleep(5000);
 	username.sendKeys("admin");
 	password.sendKeys("admin123");
 	wrapperObj.waitToBeClickable(driver,customerLoginButton);
 	customerLoginButton.click();
 }
 	
  } 

