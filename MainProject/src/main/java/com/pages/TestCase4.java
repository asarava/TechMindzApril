//Test to verify admin can add new candidates to the recruitment record
//okay
package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.wrapper.Wrapper;
import com.testbase.TestBase;

public class TestCase4 extends TestBase{
	
	Wrapper wrpObj = new Wrapper();
	
	@FindBy(xpath = "//input[@placeholder = 'Username']") 
	WebElement pUsername;
	
	@FindBy(xpath = "//input[@placeholder = 'Password']") 
	WebElement pPassword;
	
	@FindBy(xpath = "//button[@type = 'submit']") 
	WebElement pLoginButton;
	
	@FindBy(xpath = "//span[text()='Recruitment']") 
	WebElement pRecruitmentButton;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") 
	WebElement pAddButton;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-firstname']") 
	WebElement pFirstName;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-middlename']") 
	WebElement pMiddleName;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-lastname']") 
	WebElement pLastName;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]") 
	WebElement pEmail;
	
	@FindBy(xpath = "//div[@class='oxd-select-text-input']") 
	WebElement pVacancy;
	
	@FindBy(xpath = "//button[@type='submit']") 
	WebElement pSaveButton;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--success']") 
	WebElement pShortlistButton;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--subtitle-2']") 
	WebElement pMessageValidate;
	
	@FindBy(xpath = "//p[@class = 'oxd-userdropdown-name']") 
	WebElement pUserDropDown;
	
	@FindBy(xpath = "//a[text() = 'Logout']") 
	WebElement pLogOut;
	
	public TestCase4() {
		PageFactory.initElements(driver, this);
	}
	
	public String CaseTest4() throws InterruptedException {
		wrpObj.waitToBeClickable(driver, pUsername);
		pUsername.sendKeys("Admin");
		wrpObj.waitToBeClickable(driver, pPassword);
		pPassword.sendKeys("admin123");
		wrpObj.waitToBeClickable(driver, pLoginButton);
		pLoginButton.click();
		wrpObj.waitToBeClickable(driver, pRecruitmentButton);
		pRecruitmentButton.click();
		wrpObj.waitToBeClickable(driver, pAddButton);
		pAddButton.click();
		wrpObj.waitToBeClickable(driver, pFirstName);
		pFirstName.sendKeys("Aswin");
		pMiddleName.sendKeys("P");
		pLastName.sendKeys("Chacko");
		pVacancy.click();
		for(int j=0; j<11;j++) {
			pVacancy.sendKeys(Keys.ARROW_DOWN);
		}
		pVacancy.sendKeys(Keys.ENTER);
		
		pEmail.sendKeys("abcd@efg.hi");
		pSaveButton.click();
		wrpObj.waitToBeClickable(driver, pShortlistButton);
		String pValue = pMessageValidate.getText();
		return pValue;
	}
}
