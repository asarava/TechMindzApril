package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class PIM extends TestBase {
	
	Wrapper wrprObj2=new Wrapper();
	
	//PIM Module
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='PIM']")
	WebElement pimModule;
	
	//Add employee button
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-item' and text()='Add Employee']")
	WebElement addEmployeeButton;
	
	//Employee First Name
	@FindBy(xpath="//input[@placeholder=\"First Name\"]")
	WebElement employeeFirstName;
	
	//Employee Middle Name
	@FindBy(xpath="//input[@placeholder='Middle Name']")
	WebElement employeeMiddleName;
	
	//Employee Last Name
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement employeeLastName;
	
	//Employee Id
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement employeeId;
	
	//Create Login details switch
	@FindBy(xpath="//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	WebElement createLoginDetailsSwitch;
	
	//PIM Username
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement pimUsername;
	
	//PIM Pasword
	@FindBy(xpath="(//input[@type='password'])[1]")
	WebElement pimPassword;
	
	//PIM confirm password
	@FindBy(xpath="(//input[@type='password'])[2]")
	WebElement pimConfirmPassword;
	
	//save button
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement saveButton;
	
	//added employee
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 --strong' and text()='Re Ro']")
	WebElement addedEmployee;
	
	//Employee List
	@FindBy(xpath="(//a[@class='oxd-topbar-body-nav-tab-item'])[1]")
	WebElement employeeList;
	
	//Employee name search in employee list
	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[1]")
	WebElement employeeNameSearch;
	
	//Search button
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement searchButton;
	
	//Record Found
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span'])[1]")
	WebElement recordFound;
	
	public PIM() {       
	       PageFactory.initElements(driver, this);	       
	}
	
	public String addEmployee() throws InterruptedException {
		wrprObj2.webDriverWaitToBeClickable(driver, pimModule);
		pimModule.click();
		wrprObj2.webDriverWaitToBeClickable(driver, addEmployeeButton);
		addEmployeeButton.click();
		wrprObj2.webDriverWaitToBeClickable(driver, employeeFirstName);
		employeeFirstName.sendKeys("Rena");
		wrprObj2.webDriverWaitToBeClickable(driver, employeeMiddleName);
		employeeMiddleName.sendKeys("Susan");
		wrprObj2.webDriverWaitToBeClickable(driver, employeeLastName);
		employeeLastName.sendKeys("Roy");
		wrprObj2.webDriverWaitToBeClickable(driver, createLoginDetailsSwitch);
		if (createLoginDetailsSwitch.isEnabled()) {
			createLoginDetailsSwitch.click();
		}
		wrprObj2.webDriverWaitToBeClickable(driver, pimUsername);
		pimUsername.sendKeys("Renasuu8");        //change username after each test execution
		wrprObj2.webDriverWaitToBeClickable(driver, pimPassword);
		pimPassword.sendKeys("123Busticket");
		wrprObj2.webDriverWaitToBeClickable(driver, pimConfirmPassword);
		pimConfirmPassword.sendKeys("123Busticket");
		wrprObj2.webDriverWaitToBeClickable(driver, saveButton);
		saveButton.click();
		wrprObj2.webDriverWaitToBeClickable(driver, employeeList);
		employeeList.click();
		Thread.sleep(5000);
		employeeNameSearch.sendKeys("Rena Susan Roy");
		Thread.sleep(5000);
		searchButton.click();
		Thread.sleep(5000);
		String pValue10=recordFound.getText();
		return pValue10;
	}

}
