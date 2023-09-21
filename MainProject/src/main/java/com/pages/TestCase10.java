//Test to verify Admin can edit the Marital status and also add details of emergency contact of the employee

package com.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;
import com.wrapper.Wrapper;

public class TestCase10 extends TestBase {
	
	Wrapper wrpObj = new Wrapper();
	
	@FindBy(xpath = "//input[@placeholder = 'Username']") 
	WebElement pUsername;
	
	@FindBy(xpath = "//input[@placeholder = 'Password']") 
	WebElement pPassword;
	
	@FindBy(xpath = "//button[@type = 'submit']") 
	WebElement pLoginButton;
	
	@FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[2]") 
	WebElement pPIMButton;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]") 
	WebElement pEmployeeID;
	
	@FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])[1]") 
	WebElement pSearchButton;
	
	@FindBy(xpath = "(//div[@class='oxd-table-cell oxd-padding-cell'])[3]") 
	WebElement pSearchName;
	
	@FindBy(xpath = "(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[2]") 
	WebElement pEditButton;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-firstname']") 
	WebElement pEmployeeFirstName;
;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]") 
	WebElement pMaritalStatus;
	
	@FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])[1]") 
	WebElement pSaveButton;
	
	@FindBy(xpath = "(//a[@class='orangehrm-tabs-item'])[2]") 
	WebElement pEmergencyContacts;
	
	@FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--text'])[1]") 
	WebElement pAdd;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]") 
	WebElement pName;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]") 
	WebElement pRelationship;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]") 
	WebElement pMobile;
	
	@FindBy(xpath = "//button[@type='submit']") 
	WebElement pSave;
	
	@FindBy(xpath = "(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[2]") 
	WebElement pEditIcon;
	
	@FindBy(xpath = "(//div[text()='Juliet'])[1]") 
	WebElement pJulietValidate;
	
	@FindBy(xpath = "//p[@class = 'oxd-userdropdown-name']") 
	WebElement pUserDropDown;
	
	@FindBy(xpath = "//a[text() = 'Logout']") 
	WebElement pLogOut;
	
	
	public TestCase10() {
		PageFactory.initElements(driver, this);
	}
	
	public String CaseTest10() throws InterruptedException {
		wrpObj.waitToBeClickable(driver, pUsername);
		pUsername.sendKeys("Admin");
		wrpObj.waitToBeClickable(driver, pPassword);
		pPassword.sendKeys("admin123");
		wrpObj.waitToBeClickable(driver, pLoginButton);
		pLoginButton.click();
		wrpObj.waitToBeClickable(driver, pPIMButton);
		pPIMButton.click();
		wrpObj.waitToBeClickable(driver, pEmployeeID);
		pEmployeeID.sendKeys("0066");
		pSearchButton.click();
		wrpObj.waitToBePresentEmployeeName(driver, pSearchName);
		pEditButton.click();
		wrpObj.waitToBeClickable(driver, pEmployeeFirstName);
		pMaritalStatus.click();
		for(int i=0;i<2;i++) {
			pMaritalStatus.sendKeys(Keys.ARROW_DOWN);
		}
		pMaritalStatus.sendKeys(Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		pSaveButton.click();
		pEmergencyContacts.click();
		wrpObj.waitToBeClickable(driver, pAdd);
		pAdd.click();
		wrpObj.waitToBeClickable(driver, pName);
		pName.sendKeys("Juliet");
		pRelationship.sendKeys("Wife");
		pMobile.sendKeys("9876543210");
		pSave.click();
		wrpObj.waitToBeClickable(driver, pEditIcon);
		String pValue = pJulietValidate.getText();
		wrpObj.waitToBeClickable(driver, pUserDropDown);
		pUserDropDown.click();
		wrpObj.waitToBeClickable(driver, pLogOut);
		pLogOut.click();
		return pValue;
		
	}
	
}
