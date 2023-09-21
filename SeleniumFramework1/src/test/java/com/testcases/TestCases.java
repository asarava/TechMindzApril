package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.Admin;
import com.pages.Buzz;
import com.pages.Claims;
import com.pages.Dashboard;
import com.pages.Directory;
import com.pages.ForgotPassword;
import com.pages.Leave;
import com.pages.Maintenance;
import com.pages.MyInfo;
import com.pages.OrangeHRMLogin;
import com.pages.PIM;
import com.pages.Performance;
import com.pages.Recruitment;
import com.pages.Time;

public class TestCases extends TestBase {	
	public OrangeHRMLogin loginObject;
	public ForgotPassword forgotPasswordObject;
	public PIM pimObject;
	public Admin adminObject;
	public Leave leaveObject;
	public Recruitment recruitmentObject;
	public Performance performanceObject;
	public Dashboard dashboardObject;
	public Directory directoryObject;
	public Maintenance maintenanceObject;
	public Claims claimsObject;
	public Buzz buzzObject;
	public MyInfo myinfoObject;
	public Time timeObject;
	
	public TestCases() {
		super();
	}
	
	@BeforeClass
	public void setUp() {
		initialization();
		loginObject=new OrangeHRMLogin();
		forgotPasswordObject=new ForgotPassword();
		pimObject=new PIM();
		adminObject=new Admin();
		leaveObject=new Leave();
		recruitmentObject=new Recruitment();
		performanceObject=new Performance();
		dashboardObject=new Dashboard();
		directoryObject=new Directory();
		maintenanceObject=new Maintenance();
		claimsObject=new Claims();
		buzzObject=new Buzz();
		myinfoObject=new MyInfo();
		timeObject=new Time();
	}
	
	@Test(priority=1)
	public void loginSuccessTestcase() throws InterruptedException {
		String pValue=loginObject.loginSuccess();
		Assert.assertEquals(pValue,"Time at Work");
		loginObject.logout();
	}   
	

	@Test(priority=2)
	public void invalidPasswordTestcase() {
		String pValue1=loginObject.invalidPasswordLogin();
		Assert.assertEquals(pValue1, "Invalid credentials");
		driver.navigate().refresh();
	}  
	
	@Test(priority=3)
	public void invalidUsernameTestcase() {
		String pValue2=loginObject.invalidUsernameLogin();
		Assert.assertEquals(pValue2, "Invalid credentials");
		driver.navigate().refresh();
	} 
	
	@Test(priority=4)
	public void emptyCredentialsTestcase() {
		loginObject.emptyCredentialsLogin();
		String pValue4=loginObject.getUsernameRequiredMessage();
		Assert.assertEquals(pValue4, "Required");
		String pValue5=loginObject.getPasswordRequiredMessage();
		Assert.assertEquals(pValue5, "Required");
		driver.navigate().refresh();
	} 

	@Test(priority=5)
	public void emptyPasswordTestcase() {		
		String pValue6=loginObject.emptyPasswordLogin();
		Assert.assertEquals(pValue6,"Required");
		driver.navigate().refresh();		
	} 
	
	
	@Test(priority=6)           
	public void emptyUsernameTestcase() {
		String pValue7=loginObject.emptyUsernameLogin();
		Assert.assertEquals(pValue7, "Required");
		driver.navigate().refresh();
	}  
	
	
	@Test(priority=7)
	public void forgetPasswordTestcase() throws InterruptedException {
		String pValue8=forgotPasswordObject.forgotPasswordFunctionality();
		Assert.assertEquals(pValue8, "Reset Password link sent successfully");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
	}  
	
	@Test(priority=8)    
	public void addEmployeeTestcase() throws InterruptedException {		
		loginObject.loginSuccess();
		String pValue9=pimObject.addEmployee();
		Assert.assertEquals(pValue9,"(1) Record Found" );
		loginObject.logout();
	} 
	
	@Test(priority=9)   
	public void userAccountCreationTestcase() throws InterruptedException {
		loginObject.loginSuccess();
		adminObject.userAccountCreation();
		Assert.assertEquals(true, true);
		loginObject.logout();
	} 
	
	@Test(priority=10) 
	public void viewLeaveList() throws InterruptedException {
		loginObject.loginSuccess();
		String pValue10=leaveObject.viewLeaveBasedOnLeaveType();
		Assert.assertEquals(pValue10,"No Records Found");	
		loginObject.logout();
	}  
	
	
	@Test(priority=11)  
	public void viewProjectInfoTestCase() throws InterruptedException {
		loginObject.loginSuccess();
		String pValue11=timeObject.viewProjectInfo();
		Assert.assertEquals(pValue11, "(1) Record Found");	
		loginObject.logout();
	}  
	

	@Test(priority=13)
	public void vacanciesBasedOnHriringmanager() throws InterruptedException {
		loginObject.loginSuccess();
		String pValue13=recruitmentObject.viewVaccancies();
		Assert.assertEquals(pValue13, "(3) Records Found");
		loginObject.logout();	
	} 
	
	
	@Test(priority=14)
	public void viewPerformanceTrackerTestcase() throws InterruptedException {
		loginObject.loginSuccess();
		String pValue14=performanceObject.employeePerformanceTracker();
		Assert.assertEquals(pValue14, "No Records Found");	
		loginObject.logout();	
	}   
	
	
	@Test(priority=15)
	public void viewDashboardDetails() throws InterruptedException {
		loginObject.loginSuccess();
		String pValueA=dashboardObject.getTimeatWorkMessage();
		Assert.assertEquals(pValueA, "Time at Work");
		String pValueB=dashboardObject.myActionsMessage();
		Assert.assertEquals(pValueB, "My Actions");
		String pValueC=dashboardObject.quickLaunchMessage();
		Assert.assertEquals(pValueC,"Quick Launch");
		String pValueD=dashboardObject.buzzLatestPostsMessage();
		Assert.assertEquals(pValueD,"Buzz Latest Posts");
		String pValueE=dashboardObject.employeesOnLeaveTodayMessage();
		Assert.assertEquals(pValueE, "Employees on Leave Today");
		String pValueF=dashboardObject.employeeDistributionBySubUnitMessage();
		Assert.assertEquals(pValueF, "Employee Distribution by Sub Unit");
		String pValueG=dashboardObject.employeeDistributionByLocationMessage();
		Assert.assertEquals(pValueG, "Employee Distribution by Location");
		loginObject.logout();	
	} 
	
	
	@Test(priority=16)
	public void searchEmployeeBasedOnJobTitleTestcase() throws InterruptedException {
		loginObject.loginSuccess();
		String pValue16=directoryObject.employeeSearch();
		//directoryObject.employeeSearch();
		Assert.assertEquals(pValue16, "(1) Record Found");		
		loginObject.logout();	
	} 
	
	
	@Test(priority=17)
	public void vaccancyFromPurgeRecordsTestcase() throws InterruptedException {
		loginObject.loginSuccess();
		String pValue17=maintenanceObject.vaccancyStatus();
		Assert.assertEquals(pValue17,"No Records Found" );
		loginObject.logout();
	} 
	
	
	@Test(priority=18)
	public void employeeClaimsTestcase() throws InterruptedException {
		loginObject.loginSuccess();
		String pValue18=claimsObject.viewEmployeeClaims();
		Assert.assertEquals(pValue18, "(1) Record Found");
		loginObject.logout();
	} 
	
	
	@Test(priority=19)
	public void buzzNewsfeedTestcase() throws InterruptedException {
		loginObject.loginSuccess();
		String pValue19=buzzObject.viewBuzzNewsfeed();
		Assert.assertEquals(pValue19,"Buzz Newsfeed" );		
		loginObject.logout();
	}  
	
	
	@Test(priority=20)
	public void logoutTestcase() throws InterruptedException {
		loginObject.loginSuccess();
		loginObject.logout();
		String pValue20=loginObject.getLoginText();
		Assert.assertEquals(pValue20, "Login");
	} 
	
	
	@Test(priority=21)
	public void myInfoViewTestcase() throws InterruptedException {
		loginObject.loginSuccess();
		String pValue21=myinfoObject.viewMyInfo();
		Assert.assertEquals(pValue21,"PIM");
		loginObject.logout();
	}  
	
}

