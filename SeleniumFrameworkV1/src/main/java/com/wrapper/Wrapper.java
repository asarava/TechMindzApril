package com.wrapper;
import com.pages.*;

import org.openqa.selenium.WebDriver;

public class Wrapper {

    private WebDriver driver;

    public Wrapper(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }
    public void logout() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickLogout();
    }

    public void navigateToDashboard() {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToDashboardPage(); // You need to implement this method in your MainPage class.
    }

    public void performLeaveApproval(String leaveRecordId) {
        LeaveApprovalPage leaveApprovalPage = new LeaveApprovalPage(driver);
        leaveApprovalPage.enterLeaveRecordId(leaveRecordId);
        leaveApprovalPage.clickApproveButton();
    }

    public void searchForReport(String searchTerm) {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.searchForReport(searchTerm);
    }
    public void addEmployee() {
        PIMPage pimPage = new PIMPage(driver);
        pimPage.clickAddEmployee();
        
    }
}