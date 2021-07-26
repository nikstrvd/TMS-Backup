package com.tms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;

import com.tms.enums.WaitStrategy;

public class CoursePage extends BasePage {
	
	
	private final By Addnew = By.xpath("//a[text()='+ Add New']");
	private final By Editrecord = By.xpath("//tr//i[@class='fas fa-edit text-info font-16']");
	private final By name = By.xpath("//input[@name='name']");
	private final By selectcoursemodule = By.id("select2-course_type_id-container");
	private final By Selectcourse = By.xpath("//li[text()='Booster Sessions ']");
	private final By referencenumber = By.xpath("//input[@name='reference_number']");
	private final By coursecode = By.xpath("//input[@name='course_code']");
	private final By trainers = By.xpath("(//ul[@class='select2-selection__rendered'])[1]");
	private final By selecttrainers = By.xpath("//li[text()='Nikhil Trivedi']");
	private final By updateprofile = By.cssSelector(".btn.btn-primary.px-4.float-right");
	private final By cancelprofile = By.cssSelector(".btn.btn-danger");
	private final By Addcourserun = By.xpath("(//i[@class='fas fa-plus text-info font-16'])[1]");
	private final By Coursetype = By.xpath("//select[@name='course_type']");
	private final By Selectcoursetype = By.xpath("//option[text()='WSQ']");
	private final By Assistenttrainer = By.xpath("//ul[@class='select2-selection__rendered']");
	private final By SelectAssitent = By.xpath("//li[text()='Nikhil Trivedi']");
	private final By Selectmodeoftraining = By.xpath("//span[@title='Select Mode']");
	private final By Selectoption = By.xpath("//li[text()='On-the-Job']");
	private final By Scheduleinfo = By.id("schinfotype_code");
	private final By Scheduleinfodesc = By.id("schinfotype_desc");
	private final By Courseprimatyvenue = By.xpath("//span[@id='select2-venue_id-container']");
	private final By Selectvenue = By.xpath("(//li[text()='Testing Street testing building 1 - 389350'])[2]");
	private final By Coursevacancycode = By.xpath("//select[@name='coursevacancy_code']");
	private final By Selectcoursevacancycode = By.xpath("//option[text()='Full']");
	private final By Coursevacdesc = By.id("coursevacancy_desc");
	private final By Scheduleinformation = By.id("sch_info");
	private final By Minintakesize = By.id("minintakesize");
	private final By Maxintakesize = By.id("intakesize");
	private final By Threshold = By.id("threshold");
	private final By Publish = By.cssSelector(".custom-control.custom-switch.switch-success");
	private final By Viewcourserun = By.xpath("(//a[@data-original-title='View Course Run'])[1]");
	private final By Editcourserun = By.xpath("(//a[@data-original-title='Edit'])[1]");
	
	public void Addcourserun()
	{
		click(Addcourserun, WaitStrategy.CLICKABLE, "Addcourserun button");

	}
	
	public void Viewcourserun()
	{
		click(Viewcourserun, WaitStrategy.CLICKABLE, "Viewcourserun button");

	}
	
	public void Editcourserun()
	{
		click(Editcourserun, WaitStrategy.CLICKABLE, "Editcourserun button");

	}
	
	public void Coursetype()
	{
		click(Coursetype, WaitStrategy.CLICKABLE, "Coursetype button");

	}
	
	public void Selectcoursetype()
	{
		click(Selectcoursetype, WaitStrategy.CLICKABLE, "Selectcoursetype button");

	}
	
	public void Assistenttrainer()
	{
		click(Assistenttrainer, WaitStrategy.CLICKABLE, "Assistenttrainer button");

	}
	
	public void SelectAssitent()
	{
		click(SelectAssitent, WaitStrategy.CLICKABLE, "SelectAssitent button");

	}
	
	public void Selectmodeoftraining()
	{
		click(Selectmodeoftraining, WaitStrategy.CLICKABLE, "Selectmodeoftraining button");

	}
	
	public void Selectoption()
	{
		click(Selectoption, WaitStrategy.CLICKABLE, "Selectoption button");

	}
	
	public void Courseprimatyvenue()
	{
		click(Courseprimatyvenue, WaitStrategy.CLICKABLE, "Courseprimatyvenue button");

	}
	
	public void Selectvenue()
	{
		click(Selectvenue, WaitStrategy.CLICKABLE, "Selectvenue button");

	}
	
	public void Coursevacancycode()
	{
		click(Coursevacancycode, WaitStrategy.CLICKABLE, "Coursevacancycode button");

	}
	
	public void Selectcoursevacancycode()
	{
		click(Selectcoursevacancycode, WaitStrategy.CLICKABLE, "Selectcoursevacancycode button");

	}
	
	public void Publish()
	{
		click(Publish, WaitStrategy.CLICKABLE, "Publish button");

	}	
	
	public void Addnewrecord()
	{
		click(Addnew, WaitStrategy.CLICKABLE, "Add New button");

	}
	
	public void Editrecord()
	{
		click(Editrecord, WaitStrategy.CLICKABLE, "Editrecord button");

	}
	
	public void updaterecord()
	{
		click(updateprofile, WaitStrategy.CLICKABLE, "Update button");
	}
	
	public void Selectcoursemodule()
	{
		click(selectcoursemodule, WaitStrategy.CLICKABLE, "selectcoursemodule button");
		click(Selectcourse, WaitStrategy.CLICKABLE, "selectvalue button");
		//List<WebElement> values = driver.findElements(By.xpath("//li[@class='select2-results__option']"));
		//System.out.println("Number of options : " +values.size());
		//selectOptionFromDropDown(values, "Single");
		
		
	}
	
	public void SelectTrainers()
	{
		click(trainers, WaitStrategy.CLICKABLE, "trainers button");
		click(selecttrainers, WaitStrategy.CLICKABLE, "selectvalue button");
		//@SuppressWarnings("unchecked")
		//List<WebElement> values1 = driver.findElements(By.xpath("//li[@class='select2-results__option']"));
		//System.out.println("Number of options : " +values1.size());
		//selectOptionFromDropDown(values1, "Nikhil");
	}
	
	public void cancelreocrd()
	{
		click(cancelprofile, WaitStrategy.CLICKABLE, "Cancel button");
	}
	
	public CoursePage EnterdetailInName(String Name)
	{
		clear(name, Name, WaitStrategy.PRESENSE, "Name Textbox field");
		sendKeys(name, Name, WaitStrategy.PRESENSE, "Name Textbox field");
		return this;
	}
	
	public CoursePage EnterdetailInReferenceNumber(String ReferenceNumber)
	{
		clear(referencenumber, ReferenceNumber, WaitStrategy.PRESENSE, "ReferenceNumber Textbox field");
		sendKeys(referencenumber, ReferenceNumber, WaitStrategy.PRESENSE, "ReferenceNumber Textbox field");
		return this;
	}
	
	public CoursePage EnterdetailInCoursecode(String Coursecode)
	{
		clear(coursecode, Coursecode, WaitStrategy.PRESENSE, "Coursecode Textbox field");
		sendKeys(coursecode, Coursecode, WaitStrategy.PRESENSE, "Coursecode Textbox field");
		return this;
	}
	
	public CoursePage Scheduleinfo(String scheduleinfo)
	{
		clear(Scheduleinfo, scheduleinfo, WaitStrategy.PRESENSE, "Scheduleinfo Textbox field");
		sendKeys(Scheduleinfo, scheduleinfo, WaitStrategy.PRESENSE, "Scheduleinfo Textbox field");
		return this;
	}
	
	public CoursePage Scheduleinfodesc(String scheduleinfodesc)
	{
		clear(Scheduleinfodesc, scheduleinfodesc, WaitStrategy.PRESENSE, "Scheduleinfodesc Textbox field");
		sendKeys(Scheduleinfodesc, scheduleinfodesc, WaitStrategy.PRESENSE, "Scheduleinfodesc Textbox field");
		return this;
	}
	
	public CoursePage Coursevacdesc(String coursevacdesc)
	{
		scroll();
		clear(Coursevacdesc, coursevacdesc, WaitStrategy.PRESENSE, "Coursevacdesc Textbox field");
		sendKeys(Coursevacdesc, coursevacdesc, WaitStrategy.PRESENSE, "Coursevacdesc Textbox field");
		return this;
	}
	
	public CoursePage Scheduleinformation(String scheduleinformation)
	{
		clear(Scheduleinformation, scheduleinformation, WaitStrategy.PRESENSE, "Scheduleinformation Textbox field");
		sendKeys(Scheduleinformation, scheduleinformation, WaitStrategy.PRESENSE, "Scheduleinformation Textbox field");
		return this;
	}
	
	public CoursePage Minintakesize(String minintakesize)
	{
		clear(Minintakesize, minintakesize, WaitStrategy.PRESENSE, "Minintakesize Textbox field");
		sendKeys(Minintakesize, minintakesize, WaitStrategy.PRESENSE, "Minintakesize Textbox field");
		return this;
	}
	
	public CoursePage Maxintakesize(String maxintakesize)
	{
		clear(Maxintakesize, maxintakesize, WaitStrategy.PRESENSE, "Maxintakesize Textbox field");
		sendKeys(Maxintakesize, maxintakesize, WaitStrategy.PRESENSE, "Maxintakesize Textbox field");
		return this;
	}
	
	public CoursePage Threshold(String threshold)
	{
		clear(Threshold, threshold, WaitStrategy.PRESENSE, "Threshold Textbox field");
		sendKeys(Threshold, threshold, WaitStrategy.PRESENSE, "Threshold Textbox field");
		return this;
	}

}
