package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.wrapper.Wrapper; 

public class MainPage {

    private Wrapper wrapper; 

    @FindBy(id = "txtUsername")
    private WebElement usernameField;

    @FindBy(id = "txtPassword")
    private WebElement passwordField;

    @FindBy(id = "btnLogin")
    private WebElement loginButton;

    public MainPage(WebDriver driver) {
        this.wrapper = new Wrapper(driver); 
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    
    public void performLogin(String username, String password) {
        wrapper.login(username, password);
    }
    WebDriver driver = new ChromeDriver(); 
    MainPage mainPage = new MainPage(driver);
    public void navigateToDashboardPage() {
        
        WebElement dashboardLink = driver.findElement(By.linkText("Dashboard"));
        dashboardLink.click();
    }
}
