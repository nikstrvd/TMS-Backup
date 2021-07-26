package com.tms.pages;

import org.openqa.selenium.By;
import com.tms.enums.WaitStrategy;

public class DashboardPage extends BasePage{

	private final By linkSuperadmin = By.cssSelector(".mdi.mdi-chevron-down");
	private final By linkLogout = By.xpath("//a[text()=' Logout']");
	private final By changepassword = By.xpath("//a[text()=' Change Password']");
	private final By oldpassword = By.id("old_password");
	private final By newpassword = By.id("new_password");
	private final By confirmnewpassword = By.id("confirm_new_password");
	private final By updateprofile = By.cssSelector(".btn.btn-primary.px-4.float-right");
	private final By cancelprofile = By.cssSelector(".btn.btn-danger");
	
	
	
	public void clickonMenu(String menu)
	{
		String menupath = "//a[text()='"+menu+"']";
		click(By.xpath(menupath), WaitStrategy.CLICKABLE, menu);
	}
	
	public void clickonSubMenu(String submenu, String submenu1)
	{
		String menupath = "//ul[@class='nav metismenu in mm-show']//i//following-sibling::span[text()='"+submenu+"']";
		click(By.xpath(menupath), WaitStrategy.CLICKABLE, submenu);
		String menupath1 = "//ul[@class='nav metismenu in mm-show']//i//following-sibling::span[text()='"+submenu+"']/ancestor::a/following-sibling::ul/li/a[text()='"+submenu1+"']";
		click(By.xpath(menupath1), WaitStrategy.CLICKABLE, submenu1);
		
	}
	
	public void clickonLoggedinUserDropdownlist()
	{
		click(linkSuperadmin, WaitStrategy.CLICKABLE, "Super Admin button");
	}
	
	public void clickonChangepassword()
	{
		click(changepassword, WaitStrategy.CLICKABLE, "Changepassword button");
	}
	
	public DashboardPage oldpassword(String oldpassword1)
	{
		sendKeys(oldpassword, oldpassword1, WaitStrategy.PRESENSE, "Oldpassword Field");
		return this;
	}
	
	public DashboardPage newpassword(String newpassword1)
	{
		sendKeys(newpassword, newpassword1, WaitStrategy.PRESENSE, "Newpassword Field");
		return this;
	}
	
	public DashboardPage confirmpassword(String confirmpassword)
	{
		sendKeys(confirmnewpassword, confirmpassword, WaitStrategy.PRESENSE, "Confirmpassword Field");
		return this;
	}
	
	public void updatepassword()
	{
		click(updateprofile, WaitStrategy.CLICKABLE, "Update button");
	}
	
	public void cancelpassword()
	{
		click(cancelprofile, WaitStrategy.CLICKABLE, "Cancel button");
	}	
		
	public DashboardPage clickSuperAdmin()
	{

		click(linkSuperadmin, WaitStrategy.CLICKABLE, "SuperAdmin Button");
		return this;
	}
	
	public LoginPage clickLogout()
	{
		
		click(linkLogout, WaitStrategy.CLICKABLE, "Logout Button");
		return new LoginPage();
	}
	
	
}
