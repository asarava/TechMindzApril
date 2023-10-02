package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.wrapper.Wrapper; // Import the Wrapper class

public class PIMPage {

    @FindBy(id = "menu_pim_addEmployee")
    private WebElement addEmployeeButton;

    public PIMPage(WebDriver driver) {
        new Wrapper(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickAddEmployee() {
        addEmployeeButton.click();
    }
}







