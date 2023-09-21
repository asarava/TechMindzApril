//Test to verify the admin can Shortlist, schedule for an interview, give job offer and hire a candidate
//okay
package com.pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;
import com.wrapper.Wrapper;

public class TestCase5 extends TestBase {
	
	Wrapper wrpObj = new Wrapper();
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--success']") 
	WebElement pShortlistButton;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") 
	WebElement pSaveButtonShortlist;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--success']") 
	WebElement pScheduleInterviewButton;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[6]") 
	WebElement pInterviewTitle;
	
	@FindBy(xpath = "//input[@placeholder=\'Type for hints...\']")
	WebElement pInterviewer;
	
	@FindBy(xpath = "//input[@placeholder='yyyy-mm-dd']") 
	WebElement pDate;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") 
	WebElement pSaveButtonInterview;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--success']") 
	WebElement pMarkInterviewPassed;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") 
	WebElement pSaveInterviewPassed;
	
	@FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--success'])[2]") 
	WebElement pOfferJobbutton;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") 
	WebElement pSaveOfferJob;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--success']") 
	WebElement pHire;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") 
	WebElement pSaveHire;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") 
	WebElement pEditHireValidate;
	
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']") 
	WebElement pHireMessage;
	
	@FindBy(xpath = "//p[@class = 'oxd-userdropdown-name']") 
	WebElement pUserDropDown;
	
	@FindBy(xpath = "//a[text() = 'Logout']") 
	WebElement pLogOut;
	
	public TestCase5() {
		PageFactory.initElements(driver, this);
	}
	
	public String CaseTest5() throws InterruptedException {
		wrpObj.waitToBeClickable(driver, pShortlistButton);
		pShortlistButton.click();
		System.out.println("Candidate Shortlisted");
		wrpObj.waitToBeClickable(driver, pSaveButtonShortlist);
		pSaveButtonShortlist.click();
		wrpObj.waitToBeClickable(driver, pScheduleInterviewButton);
		pScheduleInterviewButton.click();
		System.out.println("Interview Scheduled");
		wrpObj.waitToBeClickable(driver, pInterviewTitle);
		pInterviewTitle.sendKeys("QA Engineer");
		pInterviewer.click();
		pInterviewer.sendKeys("Peter Mac Anderson");
		Thread.sleep(3000);
		for(int j=0; j<2;j++) {
			pInterviewer.sendKeys(Keys.ARROW_DOWN);
		}
		pInterviewer.sendKeys(Keys.ENTER);
		pDate.sendKeys("2023-09-27");
		pSaveButtonInterview.click();
		wrpObj.waitToBeClickable(driver, pSaveButtonInterview);
		//pSaveButtonInterview.click();
		wrpObj.waitToBeClickable(driver, pMarkInterviewPassed);
		pMarkInterviewPassed.click();
		wrpObj.waitToBeClickable(driver, pSaveInterviewPassed);
		pSaveInterviewPassed.click();
		System.out.println("Interview Passed");
		wrpObj.waitToBeClickable(driver, pOfferJobbutton);
		pOfferJobbutton.click();
		wrpObj.waitToBeClickable(driver, pSaveOfferJob);
		pSaveOfferJob.click();
		System.out.println("Job Offered");
		wrpObj.waitToBeClickable(driver, pHire);
		pHire.click();
		wrpObj.waitToBeClickable(driver, pSaveHire);
		pSaveHire.click();
		System.out.println("Candidate Hired");
		wrpObj.waitToBeClickable(driver, pEditHireValidate);
		wrpObj.waitToBePresentApplicationStage(driver, pHireMessage);
		String pValue = pHireMessage.getText();
		wrpObj.waitToBeClickable(driver, pUserDropDown);
		pUserDropDown.click();
		wrpObj.waitToBeClickable(driver, pLogOut);
		pLogOut.click();
		return pValue;
		
	}
	
}
