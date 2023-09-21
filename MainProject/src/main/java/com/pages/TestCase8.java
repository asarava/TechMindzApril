//Test to verify Admin is able to apply leave
//okay
//okay
package com.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;
import com.wrapper.Wrapper;

public class TestCase8 extends TestBase {
	
	Wrapper wrpObj = new Wrapper();
	
	@FindBy(xpath = "//input[@placeholder = 'Username']") 
	WebElement pUsername;
	
	@FindBy(xpath = "//input[@placeholder = 'Password']") 
	WebElement pPassword;
	
	@FindBy(xpath = "//button[@type = 'submit']") 
	WebElement pLoginButton;
	
	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]") 
	WebElement pLeaveButton;
	
	@FindBy(xpath = "//div[@class='orangehrm-header-container']") 
	WebElement pLeaveRecordValidate;
	
	@FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--label-success oxd-table-cell-action-space'])[1]") 
	WebElement pApproveButton;
	
	@FindBy(xpath = "(//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active'])[1]") 
	WebElement pEmployeeNameValidate;
	
	@FindBy(xpath = "(//label[@class='oxd-label'])[4]") 
	WebElement pNameValidate;
	
	@FindBy(xpath = "//p[@class = 'oxd-userdropdown-name']") 
	WebElement pUserDropDown;
	
	@FindBy(xpath = "//a[text() = 'Logout']") 
	WebElement pLogOut;
	
	
	public TestCase8() {
		PageFactory.initElements(driver, this);
	}
	
	public String CaseTest8() throws InterruptedException {
		wrpObj.waitToBeClickable(driver, pUsername);
		pUsername.sendKeys("Admin");
		wrpObj.waitToBeClickable(driver, pPassword);
		pPassword.sendKeys("admin123");
		wrpObj.waitToBeClickable(driver, pLoginButton);
		pLoginButton.click();
		wrpObj.waitToBeClickable(driver, pLeaveButton);
		pLeaveButton.click();
		wrpObj.waitToBePresentLeaveBalance(driver, pLeaveRecordValidate);
//		if(pLeaveRecordValidate.getText().contains("No Records Found")) {
//			System.out.println("No record Left");
//		}
//		else {
		wrpObj.waitToBeClickable(driver, pApproveButton);
		pApproveButton.click();
//		}
		wrpObj.waitToBeClickable(driver, pEmployeeNameValidate);
		String pValue = pNameValidate.getText();
		wrpObj.waitToBeClickable(driver, pUserDropDown);
		pUserDropDown.click();
		wrpObj.waitToBeClickable(driver, pLogOut);
		pLogOut.click();
		return pValue;
	}
	
}
