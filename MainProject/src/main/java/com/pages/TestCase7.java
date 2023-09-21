//Test to verify Admin is able to add new system User to the records
//okay
package com.pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;
import com.wrapper.Wrapper;

public class TestCase7 extends TestBase {
	
	Wrapper wrpObj = new Wrapper();
	
	@FindBy(xpath = "//input[@placeholder = 'Username']") 
	WebElement pUsername;
	
	@FindBy(xpath = "//input[@placeholder = 'Password']") 
	WebElement pPassword;
	
	@FindBy(xpath = "//button[@type = 'submit']") 
	WebElement pLoginButton;
	
	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]") 
	WebElement pAdminButton;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") 
	WebElement pAddButton;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]") 
	WebElement pUserRole;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']") 
	WebElement pEmployeeName;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]") 
	WebElement pStatus;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]") 
	WebElement pUsernameUser;
	
	@FindBy(xpath = "(//input[@type='password'])[1]") 
	WebElement pPasswordUser;
	
	@FindBy(xpath = "(//input[@type='password'])[2]") 
	WebElement pConfirmPasswordUser;
	
	@FindBy(xpath = "//button[@type='submit']") 
	WebElement pSaveUser;
	
	@FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']") 
	WebElement pSystemUserValidate;
	
	@FindBy(xpath = "//p[@class = 'oxd-userdropdown-name']") 
	WebElement pUserDropDown;
	
	@FindBy(xpath = "//a[text() = 'Logout']") 
	WebElement pLogOut;	
	
	public TestCase7() {
		PageFactory.initElements(driver, this);
	}
	
	public String CaseTest7() throws InterruptedException {
		wrpObj.waitToBeClickable(driver, pUsername);
		pUsername.sendKeys("Admin");
		wrpObj.waitToBeClickable(driver, pPassword);
		pPassword.sendKeys("admin123");
		wrpObj.waitToBeClickable(driver, pLoginButton);
		pLoginButton.click();
		wrpObj.waitToBeClickable(driver, pAdminButton);
		pAdminButton.click();
		wrpObj.waitToBeClickable(driver, pAddButton);
		pAddButton.click();
		wrpObj.waitToBeClickable(driver, pUserRole);
		pUserRole.click();
		for(int i=0;i<2;i++) {
			pUserRole.sendKeys(Keys.ARROW_DOWN);
		}
		pUserRole.sendKeys(Keys.ENTER);
		pEmployeeName.click();
		pEmployeeName.sendKeys("Linda Jane Anderson");
		Thread.sleep(3000);
		pEmployeeName.sendKeys(Keys.ARROW_DOWN);
		pEmployeeName.sendKeys(Keys.ENTER);
		pStatus.click();
		pStatus.sendKeys(Keys.ARROW_DOWN);
		pStatus.sendKeys(Keys.ENTER);
		pUsernameUser.sendKeys("aswinpchacko");
		pPasswordUser.sendKeys("aswin123");
		pConfirmPasswordUser.sendKeys("aswin123");
		pSaveUser.click();
		wrpObj.waitToBeClickable(driver, pAddButton);
		String pValue = pSystemUserValidate.getText();
		wrpObj.waitToBeClickable(driver, pUserDropDown);
		pUserDropDown.click();
		wrpObj.waitToBeClickable(driver, pLogOut);
		pLogOut.click();
		return pValue;
		
	}
	
}
