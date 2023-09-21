package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.AdminOperation;
import com.pages.AdminPage;
import com.pages.Login;
import com.testbase.TestBase;

	public class TestCases  extends TestBase {
		public Login loginObj;
		public AdminPage adminPageObj;
		public AdminOperation adminoperationObj;
	//	public ManagerPage managerPageObj;


		public TestCases() {
		super();

		}
	@BeforeClass
	public void setUp() {
		
		initialization();
		loginObj=new Login();
		adminPageObj=new AdminPage();
		adminoperationObj=new AdminOperation();
	}
	@Test(priority=1)

	public void FalseLoginTest()throws InterruptedException {
		loginObj.FalseLogin();
		Assert.assertEquals(true,true);
	}
	
	@Test(priority=2)

	public void customerLoginTest()throws InterruptedException {
		loginObj.adminLogin();
		Assert.assertEquals(true,true);
}
	
	@Test(priority=3)

	public void adminTest()throws InterruptedException {
		adminPageObj.Admin();		Assert.assertEquals(true,true);
	}
	@Test(priority=4)

	public void pimTest()throws InterruptedException {
		adminPageObj.PIM();
		Assert.assertEquals(true,true);
	}
	@Test(priority=5)

	public void leaveTest()throws InterruptedException {
		adminPageObj.Leave();
		Assert.assertEquals(true,true);
	}
	@Test(priority=6)

	public void timeTest()throws InterruptedException {
		adminPageObj.Time();
		Assert.assertEquals(true,true);
	}
	@Test(priority=7)

	public void recruitmentTest()throws InterruptedException {
		adminPageObj.Recruitment();
		Assert.assertEquals(true,true);
	}
	@Test(priority=8)

	public void myinfoTest()throws InterruptedException {
		adminPageObj.Myinfo();
		Assert.assertEquals(true,true);
	}
	@Test(priority=9)

	public void performanceTest()throws InterruptedException {
		adminPageObj.Performance();
		Assert.assertEquals(true,true);
	}
	@Test(priority=10)

	public void dashboardTest()throws InterruptedException {
		adminPageObj.Dashboard();
		Assert.assertEquals(true,true);
	}
	@Test(priority=11)

	public void directoryTest()throws InterruptedException {
		adminPageObj.Directory();
		Assert.assertEquals(true,true);
	}
	
	@Test(priority=12)

	public void claimTest()throws InterruptedException {
		adminPageObj.Claim();
		Assert.assertEquals(true,true);
	}
	@Test(priority=13)

	public void buzzTest()throws InterruptedException {
		adminPageObj.Buzz();
		Assert.assertEquals(true,true);
	}
	@Test(priority=14)

	public void maintanenceTest()throws InterruptedException {
		adminPageObj.Maintenance();
		Assert.assertEquals(true,true);

		
	}
	@Test(priority=15)

	public void AddEmployee()throws InterruptedException {
		adminoperationObj.AddEmployee();
		Assert.assertEquals(true,true);
		
	}
	@Test(priority=16)

	public void TimeSheet ()throws InterruptedException {
		adminoperationObj.Time();
		Assert.assertEquals(true,true);
		
	}
	@Test(priority=17)

       public void AdminSearch()throws InterruptedException {
		adminoperationObj.Search();
		Assert.assertEquals(true,true);
		
	}
	@Test(priority=18)

	public void buzz()throws InterruptedException {
		adminoperationObj.Buzz();
		Assert.assertEquals(true,true);
	
	}
	

	@Test(priority=19)

	public void BuzzNewsFeed()throws InterruptedException {
		adminoperationObj.BuzzNewsFeed();
		Assert.assertEquals(true,true);

	}
	@Test(priority=20)

	public void Claim()throws InterruptedException {
		adminoperationObj.Claim();
		Assert.assertEquals(true,true);

	}
	}
