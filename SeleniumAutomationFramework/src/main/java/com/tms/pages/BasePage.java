package com.tms.pages;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.tms.driver.DriverManager;
import com.tms.enums.WaitStrategy;
import com.tms.factories.ExplicitWaitFactory;
import com.tms.reports.ExtentLogger;

public class BasePage {
	
	protected void click(By by, WaitStrategy waitstrategy, String elementname)
	{
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitstrategy, by);
		element.click();
		ExtentLogger.pass(elementname+ " is clicked");
	}
	
	protected void clear(By by, String value, WaitStrategy waitstrategy, String elementname)
	{
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitstrategy, by);
		element.clear();
		ExtentLogger.pass(elementname+ " is Cleared");
	}
	
	
	
	protected void sendKeys(By by, String value, WaitStrategy waitstrategy, String elementname)
	{
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitstrategy, by);
		element.sendKeys(value);
		ExtentLogger.pass(value + " is entered successfully in " +elementname);
	}
	
	public void scroll()
	{
		JavascriptExecutor jse =  (JavascriptExecutor) DriverManager.getDriver();
		jse.executeScript("window.scrollBy(0, 500)");
	}
	
	public void scrool1()
	{
		JavascriptExecutor jse =  (JavascriptExecutor) DriverManager.getDriver();
		jse.executeScript("document.querySelector('.menu-body.slimscroll.in').scrollTop=2000");
	}
	
	public static void selectOptionFromDropDown(List<WebElement> options, String value)
	{
		for (WebElement option:options)
		{
			if(option.getText().contains(value))
			{
				option.click();
				break;
			}
		}	
	}
		
	public static void sortinglist() {
		
		List<WebElement> elementList = DriverManager.getDriver().findElements(By.xpath("//tr/td[2]"));
		
		List<String> orignalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		System.out.println(orignalList);
		
		List<String> sortedList = orignalList.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		Assert.assertTrue(orignalList.equals(sortedList));
	}
	
public static void sortinglist1() {
		
		List<WebElement> elementList = DriverManager.getDriver().findElements(By.xpath("//tr/td[3]"));
		
		List<String> orignalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		System.out.println(orignalList);
		
		List<String> sortedList = orignalList.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		Assert.assertTrue(orignalList.equals(sortedList));
	}

public static void sortinglist2() {
	
	List<WebElement> elementList = DriverManager.getDriver().findElements(By.xpath("//tr/td[4]"));
	
	List<String> orignalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
	
	System.out.println(orignalList);
	
	List<String> sortedList = orignalList.stream().sorted().collect(Collectors.toList());
	
	System.out.println(sortedList);
	
	Assert.assertTrue(orignalList.equals(sortedList));
}

public static void sortinglist3() {
	
	List<WebElement> elementList = DriverManager.getDriver().findElements(By.xpath("//tr/td[5]"));
	
	List<String> orignalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
	
	System.out.println(orignalList);
	
	List<String> sortedList = orignalList.stream().sorted().collect(Collectors.toList());
	
	System.out.println(sortedList);
	
	Assert.assertTrue(orignalList.equals(sortedList));
}
	
	protected String getPageTitle()
	{
		return DriverManager.getDriver().getTitle();
	}
}
