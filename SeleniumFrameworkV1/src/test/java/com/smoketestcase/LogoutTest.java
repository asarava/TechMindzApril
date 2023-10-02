package com.smoketestcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.testbase.TestBase;
import com.pages.MainPage;
import com.pages.DashboardPage;

public class LogoutTest extends TestBase {

    @BeforeMethod
    public void setUp() {
        initialization();
    }

    @Test
    public void testLogout() {
        
        MainPage mainPage = new MainPage(driver);
        mainPage.enterUsername("Admin");
        mainPage.enterPassword("admin123");
        mainPage.clickLoginButton();

        DashboardPage dashboardPage = new DashboardPage(driver);

        // Click the Logout link
        dashboardPage.clickLogout();
        }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
