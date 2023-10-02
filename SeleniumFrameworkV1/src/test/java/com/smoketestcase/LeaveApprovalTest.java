package com.smoketestcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.testbase.TestBase;
import com.pages.MainPage;
import com.pages.LeaveApprovalPage;

public class LeaveApprovalTest extends TestBase {

    @BeforeMethod
    public void setUp() {
        initialization();
    }

    @Test
    public void testLeaveApproval() {
       
        MainPage mainPage = new MainPage(driver);
        mainPage.enterUsername("Admin");
        mainPage.enterPassword("admin123");
        mainPage.clickLoginButton();
        LeaveApprovalPage leaveApprovalPage = new LeaveApprovalPage(driver);

        
        leaveApprovalPage.enterLeaveRecordId("your_leave_record_id");

        // Click the Approve button
        leaveApprovalPage.clickApproveButton();

         }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
