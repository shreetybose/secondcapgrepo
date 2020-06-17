package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {
	
public WebDriver driver;
	
	public HeaderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//*******page factory*******************8
	
	@FindBy(linkText="Logout")
	WebElement lnk_Logout;
	
	@FindBy(linkText="New Lead")
	WebElement lnk_NewLead;
	
	@FindBy(linkText="My Account")
	WebElement lnk_MyAccount;
	
	
	public void clickonLogout()
	{
		lnk_Logout.click();
	}
	
	public void clickonNewLead()
	{
		lnk_NewLead.click();
	}
	
	public void clickonMyAccount()
	{
		lnk_MyAccount.click();
	}

}
