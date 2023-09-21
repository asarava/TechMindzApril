//Test to verify admin can apply leave

package com.pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;
import com.wrapper.Wrapper;

public class TestCase14 extends TestBase {
	
	Wrapper wrpObj = new Wrapper();
	
	@FindBy(xpath = "//input[@placeholder = 'Username']") 
	WebElement pUsername;
	
	@FindBy(xpath = "//input[@placeholder = 'Password']") 
	WebElement pPassword;
	
	@FindBy(xpath = "//button[@type = 'submit']") 
	WebElement pLoginButton;
	
	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]") 
	WebElement pLeaveButton;
	
	@FindBy(xpath = "(//li[@class= 'oxd-topbar-body-nav-tab'])[1]") 
	WebElement pApplyButton;
	
	@FindBy(xpath = "//div[@class= 'oxd-select-text-input']") 
	WebElement pLeaveType;
	
	@FindBy(xpath = "(//input[@class= 'oxd-input oxd-input--active'])[2]") 
	WebElement pFromDate;
	
	@FindBy(xpath = "(//input[@class= 'oxd-input oxd-input--active'])[2]") 
	WebElement pToDate;
	
	@FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']") 
	WebElement pTextArea;
	
	@FindBy(xpath = "//*[text()=\" Apply \"]") 
	WebElement pApply;
	
	@FindBy(xpath = "(//a[@class= 'oxd-topbar-body-nav-tab-item'])[2]") 
	WebElement pMyLeaveButton;
	
	@FindBy(xpath = "//button[@class= 'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") 
	WebElement pLeaveSearch;
	
	@FindBy(xpath = "//h5[@class= 'oxd-text oxd-text--h5 oxd-table-filter-title']") 
	WebElement pLeaveCancel;
	
	@FindBy(xpath = "//p[@class = 'oxd-userdropdown-name']") 
	WebElement pUserDropDown;
	
	@FindBy(xpath = "//a[text() = 'Logout']") 
	WebElement pLogOut;	
	
	public TestCase14() {
		PageFactory.initElements(driver, this);
	}
	

	public String CaseTest14() throws InterruptedException {
		wrpObj.waitToBeClickable(driver, pUsername);
		pUsername.sendKeys("Admin");
		wrpObj.waitToBeClickable(driver, pPassword);
		pPassword.sendKeys("admin123");
		wrpObj.waitToBeClickable(driver, pLoginButton);
		pLoginButton.click();
		wrpObj.waitToBeClickable(driver, pLeaveButton);
		pLeaveButton.click();
		wrpObj.waitToBeClickable(driver, pApplyButton);
		pApplyButton.click();
		wrpObj.waitToBeClickable(driver, pApply);
		pLeaveType.click();
		for(int i=0;i<3;i++) {
			pLeaveType.sendKeys(Keys.ARROW_DOWN);
		}
		pLeaveType.sendKeys(Keys.ENTER);
		pFromDate.click();
		pFromDate.sendKeys("2023-09-24");
		pToDate.sendKeys("2023-09-22");
		pApply.sendKeys(Keys.SPACE);
		wrpObj.waitToBeClickable(driver, pApply);
		pMyLeaveButton.click();
		wrpObj.waitToBeClickable(driver, pLeaveSearch);
		String pValue = pLeaveCancel.getText();
		return pValue;
	}
}
