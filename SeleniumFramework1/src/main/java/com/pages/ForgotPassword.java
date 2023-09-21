package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class ForgotPassword extends TestBase{
	
	Wrapper wrprObj1=new Wrapper();
	
	//Forgot Password
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header' and text()='Forgot your password? ']")
	WebElement forgotPassword;
	
	//username
	@FindBy(xpath="//input[@name=\"username\"]")
	WebElement usernameForgetPassword;
	
	//Reset password
	@FindBy(xpath="//button[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-forgot-password-button orangehrm-forgot-password-button--reset']")
	WebElement resetPassword;
	
	//Reset password link success message
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title' and text()='Reset Password link sent successfully']")
	WebElement resetPasswordSuccess;
	
	public ForgotPassword() {       
	       PageFactory.initElements(driver, this);	       
	}
	
	public String forgotPasswordFunctionality() {
		
		wrprObj1.webDriverWaitToBeClickable(driver, forgotPassword);
		forgotPassword.click();
		wrprObj1.webDriverWaitToBeClickable(driver, usernameForgetPassword);
		usernameForgetPassword.sendKeys("Admin");
		wrprObj1.webDriverWaitToBeClickable(driver, resetPassword);
		resetPassword.click();
		wrprObj1.webDriverWaitToBeClickable(driver, resetPasswordSuccess);
		String pValue=resetPasswordSuccess.getText();
		return pValue;				
	}

}
