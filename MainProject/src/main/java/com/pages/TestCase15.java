//Test to verify admin can able to cancel the already applied leave

package com.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;
import com.wrapper.Wrapper;

public class TestCase15 extends TestBase {
	
	Wrapper wrpObj = new Wrapper();
	
	@FindBy(xpath = "//input[@placeholder = 'Username']") 
	WebElement pUsername;
	
	@FindBy(xpath = "//input[@placeholder = 'Password']") 
	WebElement pPassword;
	
	@FindBy(xpath = "//button[@type = 'submit']") 
	WebElement pLoginButton;
	
	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]") 
	WebElement pLeaveButton;
	
	@FindBy(xpath = "(//a[@class= 'oxd-topbar-body-nav-tab-item'])[2]") 
	WebElement pMyLeaveButton;
	
	@FindBy(xpath = "(//button[@class= 'oxd-button oxd-button--medium oxd-button--label-warn oxd-table-cell-action-space'])[1]") 
	WebElement pLeaveCancel;
	
	@FindBy(xpath = "//p[@class = 'oxd-userdropdown-name']") 
	WebElement pUserDropDown;
	
	@FindBy(xpath = "//a[text() = 'Logout']") 
	WebElement pLogOut;
	
	@FindBy(xpath = "(//div[text()='Cancelled (1.00)'])[1]") 
	WebElement pCancelValidate;
	
	
	public TestCase15() {
		PageFactory.initElements(driver, this);
	}
	
	public String CaseTest15() throws InterruptedException {
//		wrpObj.waitToBeClickable(driver, pUsername);
//		pUsername.sendKeys("Admin");
//		wrpObj.waitToBeClickable(driver, pPassword);
//		pPassword.sendKeys("admin123");
//		wrpObj.waitToBeClickable(driver, pLoginButton);
//		pLoginButton.click();
		wrpObj.waitToBeClickable(driver, pMyLeaveButton);
		pMyLeaveButton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		pLeaveCancel.click();
		String pValue = pCancelValidate.getText();
		wrpObj.waitToBeClickable(driver, pUserDropDown);
		pUserDropDown.click();
		wrpObj.waitToBeClickable(driver, pLogOut);
		pLogOut.click();
		return pValue;
		
	}
	
}
