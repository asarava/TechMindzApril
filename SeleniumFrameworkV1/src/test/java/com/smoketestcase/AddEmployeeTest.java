package com.smoketestcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.testbase.TestBase;
import com.pages.MainPage;
import com.pages.PIMPage;

public class AddEmployeeTest extends TestBase {

    @BeforeMethod
    public void setUp() {
        initialization();
    }

    @Test
    public void testAddEmployee() {
      
        MainPage mainPage = new MainPage(driver);
        mainPage.enterUsername("Admin");
        mainPage.enterPassword("admin123");
        mainPage.clickLoginButton();
        
     // Navigate to the PIM page
        PIMPage pimPage = new PIMPage(driver);
        pimPage.clickAddEmployee();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}