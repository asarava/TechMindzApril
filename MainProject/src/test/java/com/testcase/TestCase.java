package com.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.testbase.TestBase;
import com.pages.TestCase1;
import com.pages.TestCase2;
import com.pages.TestCase3;
import com.pages.TestCase4;
import com.pages.TestCase5;
import com.pages.TestCase6;
import com.pages.TestCase7;
import com.pages.TestCase8;
import com.pages.TestCase9;
import com.pages.TestCase10;
import com.pages.TestCase11;
import com.pages.TestCase12;
import com.pages.TestCase13;
import com.pages.TestCase14;
import com.pages.TestCase15;
import com.pages.TestCase16;
import com.pages.TestCase17;
import com.pages.TestCase18;
import com.pages.TestCase19;
import com.pages.TestCase20;

public class TestCase extends TestBase{
	public TestCase1 TestCase1Obj;
	public TestCase2 TestCase2Obj;
	public TestCase3 TestCase3Obj;
	public TestCase4 TestCase4Obj;
	public TestCase5 TestCase5Obj;
	public TestCase6 TestCase6Obj;
	public TestCase7 TestCase7Obj;
	public TestCase8 TestCase8Obj;
	public TestCase9 TestCase9Obj;
	public TestCase10 TestCase10Obj;
	public TestCase11 TestCase11Obj;
	public TestCase12 TestCase12Obj;
	public TestCase13 TestCase13Obj;
	public TestCase14 TestCase14Obj;
	public TestCase15 TestCase15Obj;
	public TestCase16 TestCase16Obj;
	public TestCase17 TestCase17Obj;
	public TestCase18 TestCase18Obj;
	public TestCase19 TestCase19Obj;
	public TestCase20 TestCase20Obj;
	
	
	public TestCase() {
		super();
	}
	@BeforeClass
	public void setUp() {
		initialization();
		TestCase1Obj = new TestCase1();
		TestCase2Obj = new TestCase2();
		TestCase3Obj = new TestCase3();
		TestCase4Obj = new TestCase4();
		TestCase5Obj = new TestCase5();
		TestCase6Obj = new TestCase6();
		TestCase7Obj = new TestCase7();
		TestCase8Obj = new TestCase8();
		TestCase9Obj = new TestCase9();
		TestCase10Obj = new TestCase10();
		TestCase11Obj = new TestCase11();
		TestCase12Obj = new TestCase12();
		TestCase13Obj = new TestCase13();
		TestCase14Obj = new TestCase14();
		TestCase15Obj = new TestCase15();
		TestCase16Obj = new TestCase16();
		TestCase17Obj = new TestCase17();
		TestCase18Obj = new TestCase18();
		TestCase19Obj = new TestCase19();
		TestCase20Obj = new TestCase20();		
	}
//okay
	@Test (priority = 1)
	public void TestCase1() throws InterruptedException {
		String pValue = TestCase1Obj.CaseTest1();
		Assert.assertEquals(pValue,"Time at Work");
	}
//	//okay
	@Test (priority = 2)
	public void TestCase2() throws InterruptedException {
		String pValue = TestCase2Obj.CaseTest2();
		Assert.assertEquals(pValue,"Invalid credentials");
	}
	//okay
	
	@Test (priority = 4)
	public void TestCase3() throws InterruptedException {
		String pValue = TestCase3Obj.CaseTest3();
		Assert.assertEquals(pValue,"Add Vacancy");
	}
//	//okay
	@Test (priority = 5)
	public void TestCase4() throws InterruptedException {
		String pValue = TestCase4Obj.CaseTest4();
		Assert.assertEquals(pValue,"Status: Application Initiated");
	}
	//okay
	@Test (priority = 6)
	public void TestCase5() throws InterruptedException {
		String pValue = TestCase5Obj.CaseTest5();
		Assert.assertEquals(pValue,"Application Stage");
	}
////okay	
	@Test (priority = 7)
	public void TestCase6() throws InterruptedException {
		String pValue = TestCase6Obj.CaseTest6();
		Assert.assertEquals(pValue,"Add Employee");
	}
	
	//okay
	
	@Test (priority = 8)
	public void TestCase7() throws InterruptedException {
		String pValue = TestCase7Obj.CaseTest7();
		Assert.assertEquals(pValue,"System Users");
	}
	
//	okay
	
	@Test (priority = 9)
	public void TestCase8() throws InterruptedException {
		String pValue = TestCase8Obj.CaseTest8();
		Assert.assertEquals(pValue,"Employee Name");
	}
	
	//okay
	@Test (priority = 10)
	public void TestCase9() throws InterruptedException {
		String pValue = TestCase9Obj.CaseTest9();
		Assert.assertEquals(pValue,"Submit Claim");
	}
	
	////okay
	@Test (priority = 11)
	public void TestCase10() throws InterruptedException {
		String pValue = TestCase10Obj.CaseTest10();
		Assert.assertEquals(pValue,"Juliet");
	}
	
	//okay
	
	@Test (priority = 12)
	public void TestCase11() throws InterruptedException {
		String pValue = TestCase11Obj.CaseTest11();
		Assert.assertEquals(pValue,"Status: Submitted");
	}
	
//	//okay
//	
	@Test (priority = 13)
	public void TestCase12() throws InterruptedException {
		String pValue = TestCase12Obj.CaseTest12();
		Assert.assertEquals(pValue,"Punch In");
	}
//	
	//okay

	@Test (priority = 3)
	public void TestCase13() throws InterruptedException {
		String pValue = TestCase13Obj.CaseTest13();
		Assert.assertEquals(pValue,"Reset Password link sent successfully");
	}
//	
	@Test (priority = 14)
	public void TestCase14() throws InterruptedException {
		String pValue = TestCase14Obj.CaseTest14();
		Assert.assertEquals(pValue,"My Leave List");
	}
////	
	@Test (priority = 15)
	public void TestCase15() throws InterruptedException {
		String pValue = TestCase15Obj.CaseTest15();
		Assert.assertEquals(pValue,"Cancelled (1.00)");
	}
	//okay
	@Test (priority = 16)
	public void TestCase16() throws InterruptedException {
		String pValue = TestCase16Obj.CaseTest16();
		Assert.assertEquals(pValue,"Work Shifts");
	}
	////okay
	@Test (priority = 17)
	public void TestCase17() throws InterruptedException {
		String pValue = TestCase17Obj.CaseTest17();
		Assert.assertEquals(pValue,"Corporate Branding");
	}
//	//okay
	@Test (priority = 18)
	public void TestCase18() throws InterruptedException {
		String pValue = TestCase18Obj.CaseTest18();
		Assert.assertEquals(pValue,"Work Shifts");
	}
//	//okay
	@Test (priority = 19)
	public void TestCase19() throws InterruptedException {
		String pValue = TestCase19Obj.CaseTest19();
		Assert.assertEquals(pValue,"Peter Mac Anderson");
	}
//	//okay
	@Test (priority = 20)
	public void TestCase20() throws InterruptedException {
		String pValue = TestCase20Obj.CaseTest20();
		Assert.assertEquals(pValue,"Login");
	}
	
	

}
