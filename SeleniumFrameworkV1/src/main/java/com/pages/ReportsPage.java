package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.wrapper.Wrapper; // Import the Wrapper class

public class ReportsPage {

    @FindBy(id = "searchBox")
    private WebElement searchBox;

    @FindBy(id = "searchBtn")
    private WebElement searchButton;

    public ReportsPage(WebDriver driver) {
        new Wrapper(driver); 
        PageFactory.initElements(driver, this);
    }

    public void searchForReport(String searchTerm) {
        searchBox.sendKeys(searchTerm);
        searchButton.click();
    }
}





