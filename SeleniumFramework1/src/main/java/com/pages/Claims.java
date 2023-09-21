package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class Claims extends TestBase {
	
	Wrapper wrprObj9=new Wrapper();
	
	//Claims Module
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[11]")
	WebElement claimsModule;
	
	//Reference id button
	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[2]")
	WebElement referenceIdButton;
	
	//Search Button
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchButton;
	
	//Record Found Message
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span'])[1]")
	WebElement recordFoundText;
	
	public Claims() {
		PageFactory.initElements(driver, this);
	}

	public String viewEmployeeClaims() throws InterruptedException {
		wrprObj9.webDriverWaitToBeClickable(driver, claimsModule);
		claimsModule.click();
		wrprObj9.webDriverWaitToBeClickable(driver, referenceIdButton);
		referenceIdButton.click();
		referenceIdButton.sendKeys("202307180000006");	
		wrprObj9.webDriverWaitToBeClickable(driver, searchButton);
		searchButton.click();
		Thread.sleep(5000);
		//wrprObj9.webDriverWaitToBeClickable(driver, recordFoundText);
		String pValue=recordFoundText.getText();
		return pValue;		
	}
}
