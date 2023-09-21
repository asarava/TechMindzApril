//Test to verify Admin is able to add new pay grade with  AED - Utd. Arab Emir. Dirham as currency
//okay
package com.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;
import com.wrapper.Wrapper;

public class TestCase18 extends TestBase {
	
	Wrapper wrpObj = new Wrapper();
	
	@FindBy(xpath = "//input[@placeholder = 'Username']") 
	WebElement pUsername;
	
	@FindBy(xpath = "//input[@placeholder = 'Password']") 
	WebElement pPassword;
	
	@FindBy(xpath = "//button[@type = 'submit']") 
	WebElement pLoginButton;
	
	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]") 
	WebElement pAdminButton;
	
	@FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[2]") 
	WebElement pJobButton;
	
	@FindBy(xpath = "(//a[@class='oxd-topbar-body-nav-tab-link'])[5]") 
	WebElement pWorkShift;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") 
	WebElement pAddButton;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]") 
	WebElement pShiftName;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active oxd-time-hour-input-text'])") 
	WebElement pFromTime;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]") 
	WebElement pFromIcon;
	
	@FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])[1]") 
	WebElement pSave;
	
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']") 
	WebElement pWorkShiftValidate;
	
	
	@FindBy(xpath = "//p[@class = 'oxd-userdropdown-name']") 
	WebElement pUserDropDown;
	
	@FindBy(xpath = "//a[text() = 'Logout']") 
	WebElement pLogOut;	
	
	public TestCase18() {
		PageFactory.initElements(driver, this);
	}
	
	public String CaseTest18() throws InterruptedException {
		wrpObj.waitToBeClickable(driver, pUsername);
		pUsername.sendKeys("Admin");
		wrpObj.waitToBeClickable(driver, pPassword);
		pPassword.sendKeys("admin123");
		wrpObj.waitToBeClickable(driver, pLoginButton);
		pLoginButton.click();
		wrpObj.waitToBeClickable(driver, pAdminButton);
		pAdminButton.click();
		wrpObj.waitToBeClickable(driver, pJobButton);
		pJobButton.click();
		wrpObj.waitToBeClickable(driver, pWorkShift);
		pWorkShift.click();
		wrpObj.waitToBeClickable(driver, pAddButton);
		pAddButton.click();
		wrpObj.waitToBeClickable(driver, pShiftName);
		pShiftName.sendKeys("New_Shift");
		pSave.click();
		wrpObj.waitToBeClickable(driver, pAddButton);
		String pValue = pWorkShiftValidate.getText();
		wrpObj.waitToBeClickable(driver, pUserDropDown);
		pUserDropDown.click();
		wrpObj.waitToBeClickable(driver, pLogOut);
		pLogOut.click();
		return pValue;
		
	}
	
}
