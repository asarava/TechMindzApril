//Test to verify the admin is able Add new employee in PIM with new login credentials creation
//okay
package com.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;
import com.wrapper.Wrapper;

public class TestCase6 extends TestBase {
	
	Wrapper wrpObj = new Wrapper();
	
	@FindBy(xpath = "//input[@placeholder = 'Username']") 
	WebElement pUsername;
	
	@FindBy(xpath = "//input[@placeholder = 'Password']") 
	WebElement pPassword;
	
	@FindBy(xpath = "//button[@type = 'submit']") 
	WebElement pLoginButton;
	
	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]") 
	WebElement pPIMButton;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") 
	WebElement pAddButton;
	
	@FindBy(xpath = "//input[@placeholder='First Name']") 
	WebElement pFirstName;
	
	@FindBy(xpath = "//input[@placeholder='Middle Name']") 
	WebElement pMiddleName;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']") 
	WebElement pLastName;
	
	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']") 
	WebElement pDetailsButton;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]") 
	WebElement pUsernameDetails;
	
	@FindBy(xpath = "(//input[@type='password'])[1]") 
	WebElement pPasswordDetails;
	
	@FindBy(xpath = "(//input[@type='password'])[2]") 
	WebElement pConfirmPasswordDetails;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") 
	WebElement pSaveDetails;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-firstname']") 
	WebElement pFirstValidate;
	
	@FindBy(xpath = "(//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title'])[1]") 
	WebElement pUserValidate;
	
	@FindBy(xpath = "//p[@class = 'oxd-userdropdown-name']") 
	WebElement pUserDropDown;
	
	@FindBy(xpath = "//a[text() = 'Logout']") 
	WebElement pLogOut;
	
	@FindBy(xpath = "//a[text() = 'Time at Work']") 
	WebElement pMessageTimeAtWork;
	
	
	public TestCase6() {
		PageFactory.initElements(driver, this);
	}
	
	public String CaseTest6() throws InterruptedException {
		wrpObj.waitToBeClickable(driver, pUsername);
		pUsername.sendKeys("Admin");
		wrpObj.waitToBeClickable(driver, pPassword);
		pPassword.sendKeys("admin123");
		wrpObj.waitToBeClickable(driver, pLoginButton);
		pLoginButton.click();
		wrpObj.waitToBeClickable(driver, pPIMButton);
		pPIMButton.click();
		wrpObj.waitToBeClickable(driver, pAddButton);
		pAddButton.click();
		wrpObj.waitToBeClickable(driver, pFirstName);
		pFirstName.sendKeys("Aswin");
		pMiddleName.sendKeys("P");
		pLastName.sendKeys("Chacko");
		pDetailsButton.click();
		wrpObj.waitToBeClickable(driver, pUsernameDetails);
		pUsernameDetails.sendKeys("aswinpcha");
		pPasswordDetails.sendKeys("aswin123");
		pConfirmPasswordDetails.sendKeys("aswin123");
		pSaveDetails.click();
		wrpObj.waitToBeClickable(driver, pFirstValidate);
		String pValue = pUserValidate.getText();
		wrpObj.waitToBeClickable(driver, pUserDropDown);
		pUserDropDown.click();
		wrpObj.waitToBeClickable(driver, pLogOut);
		pLogOut.click();
		return pValue;
	}
}
