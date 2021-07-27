package com.tms.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.BasePage;
import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;

public final class DashboardPageTest extends BaseTest {
	
	BasePage bp = new BasePage();
	
	private DashboardPageTest()
	{
		
	}
	
	@Test
	public void Menutest(Map<String, String> data)
	{
		LoginPage lp = new LoginPage();
		DashboardPage dp = new DashboardPage();
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		new DashboardPage().clickonMenu(data.get("menuname"));
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Dashboard - TMS");	}
	
	@Test
	public void Menutest1(Map<String, String> data)
	{
		LoginPage lp = new LoginPage();
		DashboardPage dp = new DashboardPage();
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		new DashboardPage().clickonMenu(data.get("menuname"));
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Venues - TMS");
	}
	
	@Test
	public void Menutest2(Map<String, String> data)
	{
		LoginPage lp = new LoginPage();
		DashboardPage dp = new DashboardPage();
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		new DashboardPage().clickonMenu(data.get("menuname"));
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Student Enrolment List - TMS");
	}
	
	@Test
	public void Menutest3(Map<String, String> data)
	{
		LoginPage lp = new LoginPage();
		DashboardPage dp = new DashboardPage();
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		new DashboardPage().clickonMenu(data.get("menuname"));
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Student Enrolment List - TMS");
	}
	
	@Test
	public void Menutest4(Map<String, String> data)
	{
		LoginPage lp = new LoginPage();
		DashboardPage dp = new DashboardPage();
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		new DashboardPage().clickonMenu(data.get("menuname"));
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Payment - TMS");
	}
	

	 @Test 
	  public void SubMenutest6(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Managers - TMS");		  
	  
	  }	
	 
	 @Test 
	  public void SubMenutest10(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Waiting List Course - TMS");		  
	  
	  }	
	 
	 @Test 
	  public void SubMenutest7(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "All Course Runs - TMS");		  
	  
	  }	
	 
	 @Test 
	  public void SubMenutest8(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "All Completed Course Runs - TMS");		  
	  
	  }	
	 
	 @Test 
	  public void SubMenutest9(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Soft Booking Course - TMS");		  
	  
	  }	
	
	  @Test 
	  public void SubMenutest(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Staff Users - TMS");
		  
	  
	  }	
	  
	  @Test 
	  public void SubMenutest1(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Trainers - TMS");
	  
	  }
	  
	  @Test 
	  public void SubMenutest2(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Courses List - TMS");
	  
	  }
	  
	  @Test 
	  public void SubMenutest3(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  bp.scrool1();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Staff Permissions - TMS");
	  
	  }
	  
	  @Test 
	  public void SubMenutest4(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  bp.scrool1();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Xero Connection - TMS");
	  
	  }
	  
	  @Test 
	  public void SubMenutest5(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Add Course - TMS");
	  
	  }
	  
	  @Test
	  public void VerifyChangePasswordTest(Map<String, String> data)
	  {
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonLoggedinUserDropdownlist();
		  dp.clickonChangepassword();
		  dp.oldpassword(data.get("oldpassword1"));
		  dp.newpassword(data.get("newpassword1"));
		  dp.confirmpassword(data.get("confirmpassword"));
		  dp.updatepassword();
		  }

}
