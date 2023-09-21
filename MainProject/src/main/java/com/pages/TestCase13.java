//Test to verify the admin is able to reset password on login page

package com.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;
import com.wrapper.Wrapper;

public class TestCase13 extends TestBase {
	
	Wrapper wrpObj = new Wrapper();
	
	@FindBy(xpath = "//input[@placeholder = 'Username']") 
	WebElement pUsername;
	
	@FindBy(xpath = "//p[@class= 'oxd-text oxd-text--p orangehrm-login-forgot-header']") 
	WebElement pForgotyourpassword;
	
	@FindBy(xpath = "//input[@class= 'oxd-input oxd-input--active']") 
	WebElement pUsernamereset;
	
	@FindBy(xpath = "//button[@type= 'submit']") 
	WebElement pResetButton;
	
	@FindBy(xpath = "//h6[@class= 'oxd-text oxd-text--h6 orangehrm-forgot-password-title']") 
	WebElement pMessageValidate;
	
	
	public TestCase13() {
		PageFactory.initElements(driver, this);
	}
	
	public String CaseTest13() throws InterruptedException {
		wrpObj.waitToBeClickable(driver, pUsername);
		pForgotyourpassword.click();
		wrpObj.waitToBeClickable(driver, pUsernamereset);
		pUsernamereset.sendKeys("Admin");
		pResetButton.click();
		wrpObj.waitToBePresentReset(driver, pMessageValidate);
		String pValue = pMessageValidate.getText();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		return pValue;
	}
	
}
