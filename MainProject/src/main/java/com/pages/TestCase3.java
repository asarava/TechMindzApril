//Test to verify admin can add new Vacancies
//okay
package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.wrapper.Wrapper;
import com.testbase.TestBase;

public class TestCase3 extends TestBase {
	
	Wrapper wrpObj = new Wrapper();
	
	@FindBy(xpath = "//input[@placeholder = 'Username']") 
	WebElement pUsername;
	
	@FindBy(xpath = "//input[@placeholder = 'Password']") 
	WebElement pPassword;
	
	@FindBy(xpath = "//button[@type = 'submit']") 
	WebElement pLoginButton;
	
	@FindBy(xpath = "//span[text()='Recruitment']") 
	WebElement pRecruitmentButton;
	
	@FindBy(xpath = "//a[text()='Vacancies']") 
	WebElement pVacanciesButton;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") 
	WebElement pAddButton;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]") 
	WebElement pVacancyName;
	
	@FindBy(xpath = "//div[@class='oxd-select-text-input']") 
	WebElement pJobTitle;
	
	@FindBy(xpath = "//div[text()='QA Engineer']") 
	WebElement pQAEngineer;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']") 
	WebElement pHiringManager;
	
	@FindBy(xpath = "//button[@type='submit']") 
	WebElement pSaveButton;
	
	@FindBy(xpath = "(//div[@class= 'oxd-select-text-input'])[2]") 
	WebElement pVacancyValidate;
	
	@FindBy(xpath = "//div[text() = 'Odis Adalwin']") 
	WebElement pHRValidate;
	
	@FindBy(xpath = "//button[@type=  'submit']") 
	WebElement pSearchValidate;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]") 
	WebElement pVacancyNameValidate;
	
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']") 
	WebElement pTestValidate;
	
	@FindBy(xpath = "//p[@class = 'oxd-userdropdown-name']") 
	WebElement pUserDropDown;
	
	@FindBy(xpath = "//a[text() = 'Logout']") 
	WebElement pLogOut;
	
	
	public TestCase3() {
		PageFactory.initElements(driver, this);
	}
	
	public String CaseTest3() throws InterruptedException {
		wrpObj.waitToBeClickable(driver, pUsername);
		pUsername.sendKeys("Admin");
		wrpObj.waitToBeClickable(driver, pPassword);
		pPassword.sendKeys("admin123");
		wrpObj.waitToBeClickable(driver, pLoginButton);
		pLoginButton.click();
		wrpObj.waitToBeClickable(driver, pRecruitmentButton);
		pRecruitmentButton.click();
		wrpObj.waitToBeClickable(driver, pVacanciesButton);
		pVacanciesButton.click();
		wrpObj.waitToBeClickable(driver, pAddButton);
		pAddButton.click();
		wrpObj.waitToBeClickable(driver, pVacancyName);
		pVacancyName.sendKeys("Jnr Test Engineer");
		pJobTitle.click();
		for(int i=0; i<18;i++) {
			pJobTitle.sendKeys(Keys.ARROW_DOWN);
		}
		pJobTitle.sendKeys(Keys.ENTER);

		pHiringManager.sendKeys("Odis  Adalwin");
		Thread.sleep(3000);

		for(int j=0; j<2;j++) {
			pHiringManager.sendKeys(Keys.ARROW_DOWN);
		}
		pHiringManager.sendKeys(Keys.ENTER);
		pSaveButton.click();
		wrpObj.waitToBeClickable(driver, pVacancyName);
		String pValue = pTestValidate.getText();
		wrpObj.waitToBeClickable(driver, pUserDropDown);
		pUserDropDown.click();
		wrpObj.waitToBeClickable(driver, pLogOut);
		pLogOut.click();
		return pValue;
	}
}
