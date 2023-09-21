//Test to verify admin is able to get employee contact details in the form of QR code and writtern from from directory
//okay
package com.pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;
import com.wrapper.Wrapper;

public class TestCase19 extends TestBase {
	
	Wrapper wrpObj = new Wrapper();
	
	@FindBy(xpath = "//input[@placeholder = 'Username']") 
	WebElement pUsername;
	
	@FindBy(xpath = "//input[@placeholder = 'Password']") 
	WebElement pPassword;
	
	@FindBy(xpath = "//button[@type = 'submit']") 
	WebElement pLoginButton;
	
	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[9]") 
	WebElement pDirectoryButton;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]") 
	WebElement pJobTitle;
	
	@FindBy(xpath = "//button[@type='submit']") 
	WebElement pSearch;
	
	@FindBy(xpath = "//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white orangehrm-directory-card']") 
	WebElement pContact;
	
	@FindBy(xpath = "//button[@class='oxd-icon-button oxd-icon-button--success']") 
	WebElement pPhoneContact;
	
	
	@FindBy(xpath = "//p[@class = 'oxd-userdropdown-name']") 
	WebElement pUserDropDown;
	
	@FindBy(xpath = "//a[text() = 'Logout']") 
	WebElement pLogOut;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-directory-card-header']") 
	WebElement pNameValidate;
	
	
	public TestCase19() {
		PageFactory.initElements(driver, this);
	}
	
	public String CaseTest19() throws InterruptedException {
		wrpObj.waitToBeClickable(driver, pUsername);
		pUsername.sendKeys("Admin");
		wrpObj.waitToBeClickable(driver, pPassword);
		pPassword.sendKeys("admin123");
		wrpObj.waitToBeClickable(driver, pLoginButton);
		pLoginButton.click();
		wrpObj.waitToBeClickable(driver, pDirectoryButton);
		pDirectoryButton.click();
		wrpObj.waitToBeClickable(driver, pJobTitle);
		pJobTitle.click();
		for(int i=0;i<3;i++) {
			pJobTitle.sendKeys(Keys.ARROW_DOWN);
		}
		pJobTitle.sendKeys(Keys.ENTER);
		pSearch.sendKeys(Keys.SPACE);
		wrpObj.waitToBeClickable(driver, pContact);
		pContact.click();
		wrpObj.waitToBeClickable(driver, pPhoneContact);
		String pValue = pNameValidate.getText();
		wrpObj.waitToBeClickable(driver, pUserDropDown);
		pUserDropDown.click();
		wrpObj.waitToBeClickable(driver, pLogOut);
		pLogOut.click();
		return pValue;	
	}
}
