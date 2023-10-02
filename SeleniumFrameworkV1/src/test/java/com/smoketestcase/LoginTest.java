package com.smoketestcase;

import com.pages.LoginPage;
import com.testbase.TestBase;

public class LoginTest extends TestBase {

    public static void main(String[] args) {
        // Initialize the WebDriver
        initialization(); // Make sure this method initializes the WebDriver properly

        LoginPage loginPage = new LoginPage(driver); // Pass the WebDriver instance to LoginPage constructor

        driver.get(configprop.getProperty("URL"));

        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginButton();

        // Close the WebDriver
        driver.quit();
    }
}










