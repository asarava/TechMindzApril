//Test to verify the admin cannot login with invalid credentials
//okay
package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;
import com.wrapper.Wrapper;

public class TestCase2 extends TestBase{
	
	Wrapper wrpObj = new Wrapper();
	
	@FindBy(xpath = "//input[@placeholder = 'Username']") 
	WebElement pUsername;
	
	@FindBy(xpath = "//input[@placeholder = 'Password']") 
	WebElement pPassword;
	
	@FindBy(xpath = "//button[@type = 'submit']") 
	WebElement pLoginButton;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']") 
	WebElement pInvalidMessage;
	
	public TestCase2() {
		PageFactory.initElements(driver, this);
	}
	
	public String CaseTest2() throws InterruptedException {
		wrpObj.waitToBeClickable(driver, pUsername);
		pUsername.sendKeys("admin123");
		wrpObj.waitToBeClickable(driver, pPassword);
		pPassword.sendKeys("admin");
		wrpObj.waitToBeClickable(driver, pLoginButton);
		pLoginButton.click();
		wrpObj.waitToBePresentInElement(driver, pInvalidMessage);
		String pValue = pInvalidMessage.getText();
		return pValue;
	}
		

}
