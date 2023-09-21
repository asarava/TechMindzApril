//Test to verify the admin can edit the Corporate Branding color
//okay
package com.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;
import com.wrapper.Wrapper;

public class TestCase17 extends TestBase {
	
	Wrapper wrpObj = new Wrapper();
	
	@FindBy(xpath = "//input[@placeholder = 'Username']") 
	WebElement pUsername;
	
	@FindBy(xpath = "//input[@placeholder = 'Password']") 
	WebElement pPassword;
	
	@FindBy(xpath = "//button[@type = 'submit']") 
	WebElement pLoginButton;
	
	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]") 
	WebElement pAdminButton;
	
	@FindBy(xpath = "(//li[@class='oxd-topbar-body-nav-tab'])[2]") 
	WebElement pCorparateButton;
	
	@FindBy(xpath = "(//div[@class='oxd-color-input-preview'])[1]") 
	WebElement pPrimaryColorButton;
	
	@FindBy(xpath = "(//div[@class='oxd-color-input-preview'])[2]") 
	WebElement pSecondaryColorButton;
	
	@FindBy(xpath = "(//div[@class='oxd-color-input-preview'])[5]") 
	WebElement pPrimaryGradientButton;
	
	@FindBy(xpath = "(//div[@class='oxd-color-input-preview'])[6]") 
	WebElement pSecondaryGradientButton;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]") 
	WebElement pPrimaryColorText;
	
	@FindBy(xpath = "//div[@class='oxd-color-picker-indicator']") 
	WebElement pColor;
	
	@FindBy(xpath = "//input[@class='oxd-color-picker-range']") 
	WebElement pRange;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]") 
	WebElement pSecondaryColor;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") 
	WebElement pPublishButton;
	
	@FindBy(xpath = "//h6[@class = 'oxd-text oxd-text--h6 orangehrm-main-title']") 
	WebElement pCorporateValidate;
	
	@FindBy(xpath = "//p[@class = 'oxd-userdropdown-name']") 
	WebElement pUserDropDown;
	
	@FindBy(xpath = "(//a[@role='menuitem'])[4]") 
	WebElement pLogOut;
	
	public TestCase17() {
		PageFactory.initElements(driver, this);
	}
	
	public String CaseTest17() throws InterruptedException {
		wrpObj.waitToBeClickable(driver, pUsername);
		pUsername.sendKeys("Admin");
		wrpObj.waitToBeClickable(driver, pPassword);
		pPassword.sendKeys("admin123");
		wrpObj.waitToBeClickable(driver, pLoginButton);
		pLoginButton.click();
		wrpObj.waitToBeClickable(driver, pAdminButton);
		pAdminButton.click();
		wrpObj.waitToBeClickable(driver, pCorparateButton);
		pCorparateButton.click();
		wrpObj.waitToBeClickable(driver, pPrimaryColorButton);
		pPrimaryColorButton.click();
		wrpObj.waitToBeClickable(driver, pColor);
		wrpObj.actionDragNDropByPixel(pRange, 45, 70);
		wrpObj.actionDragNDropByPixel(pColor, 56, 70);
		pSecondaryColorButton.click();
		wrpObj.waitToBeClickable(driver, pColor);
		wrpObj.actionDragNDropByPixel(pRange, 23, 60);
		wrpObj.actionDragNDropByPixel(pColor, 56, 70);
		pPrimaryGradientButton.click();
		wrpObj.waitToBeClickable(driver, pColor);
		wrpObj.actionDragNDropByPixel(pRange, 13, 90);
		wrpObj.actionDragNDropByPixel(pColor, 56, 70);
		pSecondaryGradientButton.click();
		wrpObj.waitToBeClickable(driver, pColor);
		wrpObj.actionDragNDropByPixel(pRange, 11, 69);
		wrpObj.actionDragNDropByPixel(pColor, 56, 70);
		wrpObj.waitToBeClickable(driver, pPublishButton);
		pPublishButton.click();
		wrpObj.waitToBeClickable(driver, pPrimaryColorButton);
		String pValue = pCorporateValidate.getText();
		wrpObj.waitToBeClickable(driver, pUserDropDown);
		pUserDropDown.click();
		wrpObj.waitToBeClickable(driver, pLogOut);
		pLogOut.click();
		return pValue;
		
	}
	
}
