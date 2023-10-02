package com.smoketestcase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.testbase.TestBase;
import com.pages.MainPage;
import com.pages.DashboardPage;

public class DashboardAccessTest extends TestBase {

    @BeforeMethod
    public void setUp() {
        initialization();
    }

    @Test
    public void testDashboardAccess() {
        MainPage mainPage = new MainPage(driver);
        mainPage.enterUsername("Admin");
        mainPage.enterPassword("admin123");
        mainPage.clickLoginButton();
        
        DashboardPage dashboardPage = new DashboardPage(driver);
        Assert.assertTrue(dashboardPage.isWelcomeMessageDisplayed(), "Dashboard page not accessible");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
