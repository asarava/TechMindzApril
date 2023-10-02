package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.wrapper.Wrapper; // Import the Wrapper class

public class DashboardPage {

    @FindBy(id = "welcome")
    private WebElement welcomeMessage;

    @FindBy(id = "logoutLink")
    private WebElement logoutLink;

    public DashboardPage(WebDriver driver) {
        new Wrapper(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickLogout() {
        logoutLink.click();
    }

    public boolean isWelcomeMessageDisplayed() {
        return welcomeMessage.isDisplayed();
    }
}