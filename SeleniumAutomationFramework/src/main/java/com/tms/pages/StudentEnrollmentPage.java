package com.tms.pages;

import org.openqa.selenium.By;

import com.tms.enums.WaitStrategy;

public class StudentEnrollmentPage extends BasePage {
	
	private final By SelectSession = By.cssSelector(".select2-selection__rendered");
	private final By selectsessionfromdropdown = By.xpath("//ul[@class='select2-results__options']/li[3]");
	private final By Editrecord = By.xpath("//tr//i[@class='fas fa-edit text-info font-16']");
	private final By Sponsered = By.id("sponsored_by_company");
	private final By tpgateway = By.id("tpgateway_refno");
	private final By companysme = By.id("company_sme");
	private final By nationality = By.id("nationality");
	private final By Age = By.id("age");
	private final By learningmode = By.id("learning_mode");
	private final By email = By.id("email");
	private final By mobileno = By.id("mobile_no");
	private final By dob = By.id("dob");
	private final By designation = By.id("designation");
	private final By education = By.id("education_qualification");
	private final By salary = By.id("salary");
	private final By companyname = By.id("company_name");
	private final By companycontactperson = By.id("company_contact_person");
	private final By companycontactpersonemail = By.id("company_contact_person_email");
	private final By companycontactpersonnumber = By.id("company_contact_person_number");
	private final By billingmail = By.id("billing_email");
	private final By billingzip = By.id("billing_zip");
	private final By billingaddress = By.id("billing_address");
	private final By billingcounty = By.id("billing_country");
	private final By Remark = By.id("remarks");
	private final By Paymentamount = By.id("amount");
	private final By Mealrestriction = By.id("meal_restrictions");
	private final By Mealrestrictiontype = By.id("meal_restrictions_type");
	private final By computernavskill = By.id("computer_navigation_skill");
	private final By coursebroucher = By.id("course_brochure_determined");
	private final By updateprofile = By.cssSelector(".btn.btn-primary.px-4.float-right");
	
	public void Editrecord()
	{
		click(Editrecord, WaitStrategy.CLICKABLE, "Editrecord button");

	}
	
	public void selectSession()
	{
		click(SelectSession, WaitStrategy.CLICKABLE, "SelectSession button");
	}
	
	public void selectsessionfromdropdown()
	{
		click(selectsessionfromdropdown, WaitStrategy.CLICKABLE, "selectsessionfromdropdown button");
	}
	
	public StudentEnrollmentPage EnterdetailInSponsered(String sponsered)
	{
		clear(Sponsered, sponsered, WaitStrategy.PRESENSE, "Sponsered Textbox field");
		sendKeys(Sponsered, sponsered, WaitStrategy.PRESENSE, "Sponsered Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailIntpgateway(String Tpgateway)
	{
		clear(tpgateway, Tpgateway, WaitStrategy.PRESENSE, "tpgateway Textbox field");
		sendKeys(tpgateway, Tpgateway, WaitStrategy.PRESENSE, "tpgateway Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailIncompanysme(String Companysme)
	{
		clear(companysme, Companysme, WaitStrategy.PRESENSE, "companysme Textbox field");
		sendKeys(companysme, Companysme, WaitStrategy.PRESENSE, "companysme Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInnationality(String Nationality)
	{
		clear(nationality, Nationality, WaitStrategy.PRESENSE, "nationality Textbox field");
		sendKeys(nationality, Nationality, WaitStrategy.PRESENSE, "nationality Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInAge(String age)
	{
		clear(Age, age, WaitStrategy.PRESENSE, "Age Textbox field");
		sendKeys(Age, age, WaitStrategy.PRESENSE, "Age Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInlearningmode(String Learningmode)
	{
		clear(learningmode, Learningmode, WaitStrategy.PRESENSE, "learningmode Textbox field");
		sendKeys(learningmode, Learningmode, WaitStrategy.PRESENSE, "learningmode Textbox field");
		return this;
	}

	public StudentEnrollmentPage EnterdetailInemail(String Email)
	{
		clear(email, Email, WaitStrategy.PRESENSE, "email Textbox field");
		sendKeys(email, Email, WaitStrategy.PRESENSE, "email Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInmobileno(String Mobileno)
	{
		clear(mobileno, Mobileno, WaitStrategy.PRESENSE, "mobileno Textbox field");
		sendKeys(mobileno, Mobileno, WaitStrategy.PRESENSE, "mobileno Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailIndob(String Dob)
	{
		clear(dob, Dob, WaitStrategy.PRESENSE, "dob Textbox field");
		sendKeys(dob, Dob, WaitStrategy.PRESENSE, "dob Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailIndesignation(String Designation)
	{
		clear(designation, Designation, WaitStrategy.PRESENSE, "designation Textbox field");
		sendKeys(designation, Designation, WaitStrategy.PRESENSE, "designation Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailIneducation(String Education)
	{
		clear(education, Education, WaitStrategy.PRESENSE, "education Textbox field");
		sendKeys(education, Education, WaitStrategy.PRESENSE, "education Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInsalary(String Salary)
	{
		clear(salary, Salary, WaitStrategy.PRESENSE, "salary Textbox field");
		sendKeys(salary, Salary, WaitStrategy.PRESENSE, "salary Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailIncompanyname(String Companyname)
	{
		clear(companyname, Companyname, WaitStrategy.PRESENSE, "companyname Textbox field");
		sendKeys(companyname, Companyname, WaitStrategy.PRESENSE, "companyname Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailIncompanycontactperson(String Companycontactperson)
	{
		clear(companycontactperson, Companycontactperson, WaitStrategy.PRESENSE, "companycontactperson Textbox field");
		sendKeys(companycontactperson, Companycontactperson, WaitStrategy.PRESENSE, "companycontactperson Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailIncompanycontactpersonemail(String Companycontactpersonemail)
	{
		clear(companycontactpersonemail, Companycontactpersonemail, WaitStrategy.PRESENSE, "companycontactpersonemail Textbox field");
		sendKeys(companycontactpersonemail, Companycontactpersonemail, WaitStrategy.PRESENSE, "companycontactpersonemail Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailIncompanycontactpersonnumber(String Companycontactpersonnumber)
	{
		clear(companycontactpersonnumber, Companycontactpersonnumber, WaitStrategy.PRESENSE, "companycontactpersonnumber Textbox field");
		sendKeys(companycontactpersonnumber, Companycontactpersonnumber, WaitStrategy.PRESENSE, "companycontactpersonnumber Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInbillingmail(String Billingmail)
	{
		clear(billingmail, Billingmail, WaitStrategy.PRESENSE, "billingmail Textbox field");
		sendKeys(billingmail, Billingmail, WaitStrategy.PRESENSE, "billingmail Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInbillingzip(String Billingzip)
	{
		clear(billingzip, Billingzip, WaitStrategy.PRESENSE, "billingzip Textbox field");
		sendKeys(billingzip, Billingzip, WaitStrategy.PRESENSE, "billingzip Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInbillingaddress(String Billingaddress)
	{
		clear(billingaddress, Billingaddress, WaitStrategy.PRESENSE, "billingaddress Textbox field");
		sendKeys(billingaddress, Billingaddress, WaitStrategy.PRESENSE, "billingaddress Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInbillingcounty(String Billingcounty)
	{
		clear(billingcounty, Billingcounty, WaitStrategy.PRESENSE, "billingcounty Textbox field");
		sendKeys(billingcounty, Billingcounty, WaitStrategy.PRESENSE, "billingcounty Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInRemark(String remark)
	{
		clear(Remark, remark, WaitStrategy.PRESENSE, "Remark Textbox field");
		sendKeys(Remark, remark, WaitStrategy.PRESENSE, "Remark Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInPaymentamount(String paymentamount)
	{
		clear(Paymentamount, paymentamount, WaitStrategy.PRESENSE, "Paymentamount Textbox field");
		sendKeys(Paymentamount, paymentamount, WaitStrategy.PRESENSE, "Paymentamount Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInMealrestriction(String mealrestriction)
	{
		clear(Mealrestriction, mealrestriction, WaitStrategy.PRESENSE, "Mealrestriction Textbox field");
		sendKeys(Mealrestriction, mealrestriction, WaitStrategy.PRESENSE, "Mealrestriction Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailInMealrestrictiontype(String mealrestrictiontype)
	{
		clear(Mealrestrictiontype, mealrestrictiontype, WaitStrategy.PRESENSE, "Mealrestrictiontype Textbox field");
		sendKeys(Mealrestrictiontype, mealrestrictiontype, WaitStrategy.PRESENSE, "Mealrestrictiontype Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailIncomputernavskill(String Computernavskill)
	{
		clear(computernavskill, Computernavskill, WaitStrategy.PRESENSE, "computernavskill Textbox field");
		sendKeys(computernavskill, Computernavskill, WaitStrategy.PRESENSE, "computernavskill Textbox field");
		return this;
	}
	
	public StudentEnrollmentPage EnterdetailIncoursebroucher(String Coursebroucher)
	{
		clear(coursebroucher, Coursebroucher, WaitStrategy.PRESENSE, "coursebroucher Textbox field");
		sendKeys(coursebroucher, Coursebroucher, WaitStrategy.PRESENSE, "coursebroucher Textbox field");
		return this;
	}
	
	public void updaterecord()
	{
		click(updateprofile, WaitStrategy.CLICKABLE, "Update button");
	}
}
