package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.wrapper.Wrapper;

import com.base.TestBase;

public class OrangeHRMLogin extends TestBase{
	Wrapper wrprObj=new Wrapper();
	
	//Username
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	//Password
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	//Login Button
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
	
	//Dashboard page
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p' and text()='Time at Work']")
	WebElement dashboardText;
	
	//username dropdown
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	WebElement userDropdown;
	
	//Logout button
	@FindBy(xpath="//a[@class='oxd-userdropdown-link' and text()='Logout']")
	WebElement logoutButton;
	
	//Invalid credentials message
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-alert-content-text' and text()='Invalid credentials']")
    WebElement invalidCredentials;
	
	//username required message
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message' and text()='Required'])[1]")
	WebElement usernameRequired;
	
	//password required message
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message' and text()='Required'])[2]")
	WebElement passwordRequired;
	
	//empty password required message
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	WebElement emptyPasswordRequiredMessage;
	
	//empty username required message
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	WebElement emptyUsernameRequiredMessage;
	
	//Login Text
	@FindBy(xpath="//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
	WebElement loginText;
	
	public OrangeHRMLogin() {       
	       PageFactory.initElements(driver, this);	       
	}
	
	public String loginSuccess() throws InterruptedException {
		wrprObj.webDriverWaitToBeClickable(driver, username);
		username.sendKeys("Admin");
		wrprObj.webDriverWaitToBeClickable(driver, password);
		password.sendKeys("admin123");
		wrprObj.webDriverWaitToBeClickable(driver, loginButton);
		loginButton.click();
		wrprObj.webDriverWaitToBeClickable(driver, dashboardText);
		String pValue=dashboardText.getText();
		return pValue;
	}
	
	public void logout() throws InterruptedException {
		wrprObj.webDriverWaitToBeClickable(driver, userDropdown);
		userDropdown.click();
		wrprObj.webDriverWaitToBeClickable(driver, logoutButton);
		logoutButton.click();
		
	}
	
	public String invalidPasswordLogin() {
		wrprObj.webDriverWaitToBeClickable(driver, username);
		username.sendKeys("Admin");
		wrprObj.webDriverWaitToBeClickable(driver, password);
		password.sendKeys("admin");
		wrprObj.webDriverWaitToBeClickable(driver, loginButton);
		loginButton.click();
		wrprObj.webDriverWaitToBeClickable(driver, invalidCredentials);
		String pValue1=invalidCredentials.getText();
		return pValue1;
	}
	public String invalidUsernameLogin() {
		wrprObj.webDriverWaitToBeClickable(driver, username);
		username.sendKeys("renu");
		wrprObj.webDriverWaitToBeClickable(driver, password);
		password.sendKeys("admin123");
		wrprObj.webDriverWaitToBeClickable(driver, loginButton);
		loginButton.click();
		wrprObj.webDriverWaitToBeClickable(driver, invalidCredentials);
		String pValue2=invalidCredentials.getText();
		return pValue2;
	}
	
	public void emptyCredentialsLogin() {
		wrprObj.webDriverWaitToBeClickable(driver, username);
		username.sendKeys("");
		wrprObj.webDriverWaitToBeClickable(driver, password);
		password.sendKeys("");
		wrprObj.webDriverWaitToBeClickable(driver, loginButton);
		loginButton.click();
	}
	
	public String getUsernameRequiredMessage() {
		wrprObj.webDriverWaitToBeClickable(driver, usernameRequired);
		String pValue4=usernameRequired.getText();
		return pValue4;
	}
	
	public String getPasswordRequiredMessage() {
		wrprObj.webDriverWaitToBeClickable(driver, passwordRequired);
		String pValue5=passwordRequired.getText();
		return pValue5;
	}
	
	public String emptyPasswordLogin() {
		wrprObj.webDriverWaitToBeClickable(driver, username);
		username.sendKeys("Admin");
		wrprObj.webDriverWaitToBeClickable(driver, password);
		password.sendKeys("");
		wrprObj.webDriverWaitToBeClickable(driver, loginButton);
		loginButton.click();
		String pValue6=emptyPasswordRequiredMessage.getText();
		return pValue6;
	}
	
	public String emptyUsernameLogin() {
		wrprObj.webDriverWaitToBeClickable(driver, username);
		username.sendKeys("");
		wrprObj.webDriverWaitToBeClickable(driver, password);
		password.sendKeys("admin123");
		wrprObj.webDriverWaitToBeClickable(driver, loginButton);
		loginButton.click();
		String pValue7= emptyUsernameRequiredMessage.getText();
		return pValue7;
	}
	
	public String getLoginText() {
		wrprObj.webDriverWaitToBeClickable(driver, loginText);
		String pValue8=loginText.getText();
		return pValue8;
	}

}

