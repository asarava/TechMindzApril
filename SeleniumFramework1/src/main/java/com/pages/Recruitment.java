package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class Recruitment extends TestBase{
	
	Wrapper wrprObj5=new Wrapper();
	
	//Recruitment Module
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[5]")
	WebElement recruitmentModule;
	
	//Vacancies Button
	@FindBy(xpath="(//a[@class='oxd-topbar-body-nav-tab-item'])[2]")
	WebElement vacanciesButton;
	
	//Hiring Manager Button
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[3]")
	WebElement hiringManagerButton;
	
	//Search button
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement searchButton;
	
	//Record Found
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span'])[1]")
	WebElement recordFoundText;
	
	public Recruitment() {       
	       PageFactory.initElements(driver, this);	       
	}
	
	public String  viewVaccancies() throws InterruptedException {
		wrprObj5.webDriverWaitToBeClickable(driver, recruitmentModule);
		recruitmentModule.click();
		wrprObj5.webDriverWaitToBeClickable(driver, vacanciesButton);
		vacanciesButton.click();
		wrprObj5.webDriverWaitToBeClickable(driver, hiringManagerButton);
		//Thread.sleep(5000);
		hiringManagerButton.click();
		for (int i=0;i<2;i++) {
			hiringManagerButton.sendKeys(Keys.ARROW_DOWN);                //dropdown if not inside select tag
			Thread.sleep(5000);
			//wrprObj5.webDriverWaitToBeClickable(driver, hiringManagerButton);
		}
		hiringManagerButton.click();
		hiringManagerButton.sendKeys(Keys.ENTER);
		wrprObj5.webDriverWaitToBeClickable(driver, searchButton);
		searchButton.click();
		wrprObj5.webDriverWaitToBeClickable(driver, recordFoundText);
		String pValue1=recordFoundText.getText();
		return pValue1;
		};
	}
	


