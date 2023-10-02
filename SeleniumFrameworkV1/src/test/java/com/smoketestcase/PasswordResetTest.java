 package com.smoketestcase;

import com.pages.PasswordResetPage;
import com.testbase.TestBase;

public class PasswordResetTest extends TestBase {

    public static void main(String[] args) {
        // Initialize the WebDriver
        initWebDriver();

        PasswordResetPage passwordResetPage = new PasswordResetPage();
        driver.get(configprop.getProperty("URL"));

        passwordResetPage.resetPassword("Admin", "newPassword", "newPassword");

       // Close the WebDriver
        driver.quit();
    }

    public static void initWebDriver() {
        initialization(); // Initialize the WebDriver based on configuration in TestBase
    }
}




