package com.tms.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;
import com.tms.pages.StudentEnrollmentPage;

public class StudentEnrollmentPageTest extends BaseTest {

	private StudentEnrollmentPageTest() { }
	  
	  @Test
	  public void EditStudentEnrollmentRecordTest(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonMenu(data.get("menuname"));
		  StudentEnrollmentPage se = new StudentEnrollmentPage();
		  se.Editrecord();
		  se.selectSession();
		  se.selectsessionfromdropdown();
		  se.EnterdetailInSponsered(data.get("Sponsored"));
		  se.EnterdetailIntpgateway(data.get("TPGateway"));
		  se.EnterdetailIncompanysme(data.get("Company SME"));
		  se.EnterdetailInnationality(data.get("Nationality"));
		  se.EnterdetailInAge(data.get("Age"));
		  se.EnterdetailInlearningmode(data.get("Learning Mode"));
		  se.EnterdetailInemail(data.get("Email"));
		  se.EnterdetailInmobileno(data.get("Mobile No"));
		  se.EnterdetailIndob(data.get("Date Of Birth"));
		  se.EnterdetailIndesignation(data.get("Designation"));
		  se.EnterdetailIneducation(data.get("Education Qualification"));
		  se.EnterdetailInsalary(data.get("Salary"));
		  se.EnterdetailIncompanyname(data.get("Company Name"));
		  se.EnterdetailIncompanycontactperson(data.get("Company Contact Person"));
		  se.EnterdetailIncompanycontactpersonemail(data.get("Company Contact Person Email"));
		  se.EnterdetailIncompanycontactpersonnumber(data.get("Company Contact Person Number"));
		  se.EnterdetailInbillingmail(data.get("Billing Email"));
		  se.EnterdetailInbillingzip(data.get("Billing Zip"));
		  se.EnterdetailInbillingaddress(data.get("Billing Address"));
		  se.EnterdetailInbillingcounty(data.get("Billing Country"));
		  se.EnterdetailInRemark(data.get("Remarks"));
		  se.EnterdetailInPaymentamount(data.get("Payment Amount"));
		  se.EnterdetailInMealrestriction(data.get("Meal Restrictions"));
		  se.EnterdetailInMealrestrictiontype(data.get("Meal Restrictions Type"));
		  se.EnterdetailIncomputernavskill(data.get("Computer Navigation Skill"));
		  se.EnterdetailIncoursebroucher(data.get("Course Brochure Determined"));
		  se.updaterecord();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Student Enrolment List - TMS");
	  }	
}
