//Test to verify admin can able to create a new claim request
//okay
package com.pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;
import com.wrapper.Wrapper;

public class TestCase9 extends TestBase {
	
	Wrapper wrpObj = new Wrapper();
	
	@FindBy(xpath = "//input[@placeholder = 'Username']") 
	WebElement pUsername;
	
	@FindBy(xpath = "//input[@placeholder = 'Password']") 
	WebElement pPassword;
	
	@FindBy(xpath = "//button[@type = 'submit']") 
	WebElement pLoginButton;
	
	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[11]") 
	WebElement pClaimButton;
	
	@FindBy(xpath = "(//li[@class='oxd-topbar-body-nav-tab'])[1]") 
	WebElement pSubmitClaim;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']") 
	WebElement pEmployeeName;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]") 
	WebElement pEvent;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]") 
	WebElement pCurrency;
	
	@FindBy(xpath = "//button[@type='submit']") 
	WebElement pCreate;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-sm-button']") 
	WebElement pSubmit;
	
	@FindBy(xpath = "(//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title'])[1]") 
	WebElement pSubmitClaimValidate;
	
	@FindBy(xpath = "//p[@class = 'oxd-userdropdown-name']") 
	WebElement pUserDropDown;
	
	@FindBy(xpath = "//a[text() = 'Logout']") 
	WebElement pLogOut;	
	
	public TestCase9() {
		PageFactory.initElements(driver, this);
	}
	
	public String CaseTest9() throws InterruptedException {
		wrpObj.waitToBeClickable(driver, pUsername);
		pUsername.sendKeys("Admin");
		wrpObj.waitToBeClickable(driver, pPassword);
		pPassword.sendKeys("admin123");
		wrpObj.waitToBeClickable(driver, pLoginButton);
		pLoginButton.click();
		wrpObj.waitToBeClickable(driver, pClaimButton);
		pClaimButton.click();
		wrpObj.waitToBeClickable(driver, pSubmitClaim);
		pSubmitClaim.click();
		wrpObj.waitToBeClickable(driver, pCreate);
		pEvent.click();
		for(int i=0;i<6;i++) {
			pEvent.sendKeys(Keys.ARROW_DOWN);
		}
		pEvent.sendKeys(Keys.ENTER);
		pCurrency.click();
		for(int i=0;i<62;i++) {
			pCurrency.sendKeys(Keys.ARROW_DOWN);
		}
		pCurrency.sendKeys(Keys.ENTER);
		pCreate.click();
		wrpObj.waitToBeClickable(driver, pSubmit);
		pSubmit.click();
		String pValue = pSubmitClaimValidate.getText();
		wrpObj.waitToBeClickable(driver, pUserDropDown);
		pUserDropDown.click();
		wrpObj.waitToBeClickable(driver, pLogOut);
		pLogOut.click();
		return pValue;
	}
	
}
