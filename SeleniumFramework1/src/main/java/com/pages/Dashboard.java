package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Dashboard extends TestBase {
	
	//Time at Work
	
	@FindBy(xpath="//p[text()='Time at Work']")
	WebElement timeAtWorkText;
	
	//My Actions
	@FindBy(xpath="//p[text()='My Actions']")
	WebElement myActionsText;
	
	//Quick Launch
	@FindBy(xpath="//p[text()='Quick Launch']")
	WebElement quickLaunchText;
	
	//Buzz Latest Posts
	@FindBy(xpath="//p[text()='Buzz Latest Posts']")
	WebElement buzzLatestPostsText;
	
	//Employees on Leave Today
	@FindBy(xpath="//p[text()='Employees on Leave Today']")
	WebElement employeesOnLeaveText;
	
	//Employee Distribution by Sub Unit
	@FindBy(xpath="//p[text()='Employee Distribution by Sub Unit']")
	WebElement employeeDistributionBySubUnitText;
	
	//Employee Distribution by Location
	@FindBy(xpath="//p[text()='Employee Distribution by Location']")
	WebElement employeeDistributionByLocationText;
	
	public Dashboard() {       
	       PageFactory.initElements(driver, this);	       
	}

	public String getTimeatWorkMessage() {
		String pValue1=timeAtWorkText.getText();
		return pValue1;		
	}
	
	public String myActionsMessage() {
		String pValue2=myActionsText.getText();
		return pValue2;		
	}
	
	public String quickLaunchMessage() {
		String pValue3=quickLaunchText.getText();
		return pValue3;		
	}
	
	public String buzzLatestPostsMessage() {
		String pValue4=buzzLatestPostsText.getText();
		return pValue4;		
	}
	
	public String employeesOnLeaveTodayMessage() {
		String pValue5=employeesOnLeaveText.getText();
		return pValue5;		
	}
	
	public String employeeDistributionBySubUnitMessage() {
		String pValue6=employeeDistributionBySubUnitText.getText();
		return pValue6;		
	}
	
	public String employeeDistributionByLocationMessage() {
		String pValue7=employeeDistributionByLocationText.getText();
		return pValue7;		
	}
	
}
