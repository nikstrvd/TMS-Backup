package com.tms.tests;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.CoursePage;
import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;
import com.tms.pages.StaffPage;
import com.tms.pages.VenuePage;

public class CoursePageTest extends BaseTest {

	private CoursePageTest() {
	}

	@Test
	public void AddnewCourseRecordTest(Map<String, String> data) {
		
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  CoursePage cp = new CoursePage();
		  cp.Addnewrecord();
		  cp.EnterdetailInName(data.get("name1"));
		  cp.EnterdetailInReferenceNumber(data.get("reference"));
		  cp.EnterdetailInCoursecode(data.get("coursecode"));
		  cp.Selectcoursemodule();
		  cp.SelectTrainers();
		  cp.updaterecord();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Courses List - TMS");
	}

	@Test()
	public void EditCourseRecordTest(Map<String, String> data) {
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  CoursePage cp = new CoursePage();
		  cp.Editrecord();
		  cp.EnterdetailInName(data.get("name1"));
		  cp.EnterdetailInReferenceNumber(data.get("reference"));
		  cp.EnterdetailInCoursecode(data.get("coursecode"));
		  cp.Selectcoursemodule();
		  cp.SelectTrainers();
		  cp.updaterecord();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Courses List - TMS");
	}
}
