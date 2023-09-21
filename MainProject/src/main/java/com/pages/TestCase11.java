//Test to verify admin can approve Timesheets from the Timesheets record
//okay
package com.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;
import com.wrapper.Wrapper;

public class TestCase11 extends TestBase {
	
	Wrapper wrpObj = new Wrapper();
	
	@FindBy(xpath = "//input[@placeholder = 'Username']") 
	WebElement pUsername;
	
	@FindBy(xpath = "//input[@placeholder = 'Password']") 
	WebElement pPassword;
	
	@FindBy(xpath = "//button[@type = 'submit']") 
	WebElement pLoginButton;
	
	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[4]") 
	WebElement pTimeButton;
	
	@FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--text oxd-table-cell-action-space'])[5]") 
	WebElement pViewButton;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--success orangehrm-left-space']") 
	WebElement pApproveButton;
	
	@FindBy(xpath = "//div[@class='orangehrm-timesheet-footer--title']") 
	WebElement pApproveValidate;
	
	@FindBy(xpath = "//div[@class='orangehrm-timesheet-footer--options']") 
	WebElement pResetValidate;
	
	@FindBy(xpath = "//p[@class = 'oxd-userdropdown-name']") 
	WebElement pUserDropDown;
	
	@FindBy(xpath = "//a[text() = 'Logout']") 
	WebElement pLogOut;	
	
	public TestCase11() {
		PageFactory.initElements(driver, this);
	}
	
	public String CaseTest11() throws InterruptedException {
		wrpObj.waitToBeClickable(driver, pUsername);
		pUsername.sendKeys("Admin");
		wrpObj.waitToBeClickable(driver, pPassword);
		pPassword.sendKeys("admin123");
		wrpObj.waitToBeClickable(driver, pLoginButton);
		pLoginButton.click();
		wrpObj.waitToBeClickable(driver, pTimeButton);
		pTimeButton.click();
		wrpObj.waitToBeClickable(driver, pViewButton);
		pViewButton.click();
		wrpObj.waitToBeClickable(driver, pApproveButton);
		pApproveButton.click();
		wrpObj.waitToBeClickable(driver, pResetValidate);
		String pValue = pApproveValidate.getText();
		wrpObj.waitToBeClickable(driver, pUserDropDown);
		pUserDropDown.click();
		wrpObj.waitToBeClickable(driver, pLogOut);
		pLogOut.click();
		return pValue;
	}
	
}
