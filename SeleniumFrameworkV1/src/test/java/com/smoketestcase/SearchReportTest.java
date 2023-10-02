package com.smoketestcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.testbase.TestBase;
import com.pages.MainPage;
import com.pages.ReportsPage;

public class SearchReportTest extends TestBase {

    @BeforeMethod
    public void setUp() {
        initialization();
    }

    @Test
    public void testSearchReport() {
        
        MainPage mainPage = new MainPage(driver);
        mainPage.enterUsername("Admin");
        mainPage.enterPassword("admin123");
        mainPage.clickLoginButton();
        
        ReportsPage reportsPage = new ReportsPage(driver);

        // Enter the search term and perform the search
        reportsPage.searchForReport("Employee Contact Info");
        
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}