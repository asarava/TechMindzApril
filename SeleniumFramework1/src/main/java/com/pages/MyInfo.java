package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class MyInfo extends TestBase {
	
	Wrapper wrprObj11=new Wrapper();
	
	//My Info Module
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[6]")
	WebElement myInfoModule;
	
	//PIM Text
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement pimText;
	
	public MyInfo() {
		PageFactory.initElements(driver, this);
	}

	public String viewMyInfo() {
		wrprObj11.webDriverWaitToBeClickable(driver, myInfoModule);
		myInfoModule.click();
		wrprObj11.webDriverWaitToBeClickable(driver, pimText);
		String pValue=pimText.getText();
		return pValue;
	}
}
