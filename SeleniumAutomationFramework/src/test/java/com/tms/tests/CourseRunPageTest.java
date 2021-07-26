package com.tms.tests;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.CoursePage;
import com.tms.pages.CourseRunPage;
import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;
import com.tms.pages.StaffPage;
import com.tms.pages.VenuePage;

public class CourseRunPageTest extends BaseTest {
	

	private CourseRunPageTest() {
	}

	@Test(enabled = false)
	public void AddCourseRunRecordTest(Map<String, String> data) {
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  CoursePage cp = new CoursePage();
		  cp.Addcourserun();
		  cp.Coursetype();
		  cp.Selectcoursetype();
		  cp.Assistenttrainer();
		  cp.SelectAssitent();
		  cp.Selectmodeoftraining();
		  cp.Selectoption();
		  cp.Courseprimatyvenue();
		  cp.Selectvenue();
		  cp.Scheduleinfo(data.get("Scheduleinfo"));
		  cp.Scheduleinfodesc(data.get("Scheduleinfodesc"));
		  cp.Coursevacdesc(data.get("Coursevacdesc"));
		  cp.Coursevacancycode();
		  cp.Selectcoursevacancycode();
		  cp.Scheduleinformation(data.get("Scheduleinformation"));
		  cp.Minintakesize(data.get("Minintakesize"));
		  cp.Maxintakesize(data.get("Maxintakesize"));
		  cp.Threshold(data.get("Threshold"));
		  cp.Publish();
		  cp.updaterecord();
	}
	
	@Test()
	public void EditCourseRunRecordTest(Map<String, String> data) {
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  CourseRunPage cp = new CourseRunPage();
		  cp.Viewcourserun();
		  cp.Editcourserun();
		  cp.Coursetype();
		  cp.Selectcoursetype();
		  cp.Assistenttrainer();
		  cp.SelectAssitent();
		  cp.Selectmodeoftraining();
		  cp.Selectoption();
		  cp.Courseprimatyvenue();
		  cp.Selectvenue();
		  cp.Scheduleinfo(data.get("Scheduleinfo"));
		  cp.Scheduleinfodesc(data.get("Scheduleinfodesc"));
		  cp.Coursevacdesc(data.get("Coursevacdesc"));
		  cp.Coursevacancycode();
		  cp.Selectcoursevacancycode();
		  cp.Scheduleinformation(data.get("Scheduleinformation"));
		  cp.Coursecode(data.get("Coursecode"));
		  cp.Minintakesize(data.get("Minintakesize"));
		  cp.Maxintakesize(data.get("Maxintakesize"));
		  cp.Threshold(data.get("Threshold"));
		  cp.Publish();
		  cp.updaterecord();
	}
}
