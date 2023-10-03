package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.Admin;
import com.pages.AdminMain;
import com.pages.Login;
import com.testbase.TestBase;

	public class Testcases  extends TestBase {
		public Login loginObj;
		public AdminMain adminMainObj;
		public Admin adminObj;
	//	public ManagerPage managerPageObj;


		public Testcases() {
		super();

		}
	@BeforeClass
	public void setUp() {
		
		initialization();
		loginObj=new Login();
		adminMainObj=new AdminMain();
		adminObj=new Admin();
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
		adminMainObj.Admin();		Assert.assertEquals(true,true);
	}
	@Test(priority=4)

	public void pimTest()throws InterruptedException {
		adminMainObj.PIM();
		Assert.assertEquals(true,true);
	}
	@Test(priority=5)

	public void leaveTest()throws InterruptedException {
		adminMainObj.Leave();
		Assert.assertEquals(true,true);
	}
	
	@Test(priority=7)

	public void recruitmentTest()throws InterruptedException {
		adminMainObj.Recruitment();
		Assert.assertEquals(true,true);
	}
	@Test(priority=6)

	public void myinfoTest()throws InterruptedException {
		adminMainObj.Myinfo();
		Assert.assertEquals(true,true);
	}
	@Test(priority=9)

	public void performanceTest()throws InterruptedException {
		adminMainObj.Performance();
		Assert.assertEquals(true,true);
	}
	@Test(priority=8)

	public void dashboardTest()throws InterruptedException {
		adminMainObj.Dashboard();
		Assert.assertEquals(true,true);
	}
	@Test(priority=11)

	public void directoryTest()throws InterruptedException {
		adminMainObj.Directory();
		Assert.assertEquals(true,true);
	}
	

	@Test(priority=12)

	public void buzzTest()throws InterruptedException {
		adminMainObj.Buzz();
		Assert.assertEquals(true,true);
	}
	@Test(priority=14)

	public void maintanenceTest()throws InterruptedException {
		adminMainObj.Maintenance();
		Assert.assertEquals(true,true);

		
	}
	@Test(priority=15)

	public void AddEmployee()throws InterruptedException {
		adminObj.AddEmployee();
		Assert.assertEquals(true,true);
		
	}
	
	@Test(priority=13)

       public void AdminSearch()throws InterruptedException {
		adminObj.Search();
		Assert.assertEquals(true,true);
		
	}
	@Test(priority=10)

	public void buzz()throws InterruptedException {
		adminObj.Buzz();
		Assert.assertEquals(true,true);
	
	}
	


	}
