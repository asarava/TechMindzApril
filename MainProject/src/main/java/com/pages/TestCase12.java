//Test to verify admin can able to punch in and punch out from the dashboard page
//okay
package com.pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;
import com.wrapper.Wrapper;

public class TestCase12 extends TestBase {
	
	Wrapper wrpObj = new Wrapper();
	
	@FindBy(xpath = "//input[@placeholder = 'Username']") 
	WebElement pUsername;
	
	@FindBy(xpath = "//input[@placeholder = 'Password']") 
	WebElement pPassword;
	
	@FindBy(xpath = "//button[@type = 'submit']") 
	WebElement pLoginButton;
	
	@FindBy(xpath = "//button[@class='oxd-icon-button oxd-icon-button--solid-main orangehrm-attendance-card-action']") 
	WebElement pClockButton;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") 
	WebElement pInButton;
	
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']") 
	WebElement pInValidate;
	
	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[8]") 
	WebElement pDashboardButton;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]") 
	WebElement pOutDate;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]") 
	WebElement pOutTime;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-clock oxd-time-input--clock']")
	WebElement pTimeIcon;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") 
	WebElement pOutButton;

	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']") 
	WebElement pOutValidate;
	
	@FindBy(xpath = "//p[@class = 'oxd-userdropdown-name']") 
	WebElement pUserDropDown;
	
	@FindBy(xpath = "//a[text() = 'Logout']") 
	WebElement pLogOut;
	
	public TestCase12() {
		PageFactory.initElements(driver, this);
	}
	
	public String CaseTest12() throws InterruptedException {
		wrpObj.waitToBeClickable(driver, pUsername);
		pUsername.sendKeys("Admin");
		wrpObj.waitToBeClickable(driver, pPassword);
		pPassword.sendKeys("admin123");
		wrpObj.waitToBeClickable(driver, pLoginButton);
		pLoginButton.click();
		wrpObj.waitToBeClickable(driver, pClockButton);
		pClockButton.click();
		wrpObj.waitToBeClickable(driver, pInButton);
		pInButton.click();
		System.out.println("Punched In");
		wrpObj.waitToBeClickable(driver, pDashboardButton);
		pDashboardButton.click();
		wrpObj.waitToBeClickable(driver, pClockButton);
		pClockButton.click();
		wrpObj.waitToBeClickable(driver, pOutDate);
		pOutDate.clear();
		pOutDate.sendKeys("2023-09-19");
		pOutDate.sendKeys(Keys.ENTER);
		wrpObj.waitToBeClickable(driver, pTimeIcon);
		pTimeIcon.click();
		pTimeIcon.click();
		pTimeIcon.click();
		pTimeIcon.click();
		pTimeIcon.click();
		pTimeIcon.click();
		pTimeIcon.click();
//		pOutTime.sendKeys("11:30 PM");
//		pOutTime.sendKeys(Keys.ENTER);
		pOutButton.click();
		System.out.println("Punched Out");
		String pValue = pOutValidate.getText();
//		wrpObj.waitToBeClickable(driver, pUserDropDown);
//		pUserDropDown.click();
//		wrpObj.waitToBeClickable(driver, pLogOut);
//		pLogOut.click();
		return pValue;
	}
}
