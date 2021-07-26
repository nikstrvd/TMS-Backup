package com.tms.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;
import com.tms.pages.PaymentsPage;

public class PaymentPageTest extends BaseTest{
	
	private PaymentPageTest() { }
	
	
	  @Test 
	  public void AddnewPaymentRecordTest(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonMenu(data.get("menuname"));
		  PaymentsPage pp = new PaymentsPage();
		  pp.Addnewrecord();
		  pp.Studentenrollment();
		  pp.Entertext(data.get("EnterText"));
		  pp.Selectdata();
		  pp.Paymentmode();
		  pp.Selectpaymentmode();
		  pp.EnterdetailInFeespaidamount(data.get("FeesPaid"));
		  pp.updaterecord();
		  String ActualTitle = lp.getTitle();
			Assert.assertEquals(ActualTitle, "Payment - TMS");
	  }	

	  @Test 
	  public void EditPaymentRecordTest(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonMenu(data.get("menuname"));
		  PaymentsPage pp = new PaymentsPage();
		  pp.Editrecord();
		  pp.Studentenrollment();
		  pp.Entertext(data.get("EnterText"));
		  pp.Selectdata1();
		  pp.Paymentmode();
		  pp.Selectpaymentmode();
		  pp.EnterdetailInFeespaidamount(data.get("FeesPaid"));
		  pp.updaterecord();
		  String ActualTitle = lp.getTitle();
			Assert.assertEquals(ActualTitle, "Payment - TMS");
	  }	
}
