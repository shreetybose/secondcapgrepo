package com.vTiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewLeadpage extends HeaderPage {
	private WebDriver driver;
	

	public NewLeadpage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;		
	}
	
	
	By tabLead=By.xpath("//a[@class='currentTab'][text()='Leads']");
	By tbLastName=By.name("lastname");
	By tbCompany=By.name("company");
	By btnSave=By.name("button");
	
	
	
	public void fillLeadFormwithMandatoryFields(String lname, String comp)
	{
		driver.findElement(tbLastName).clear();
		driver.findElement(tbLastName).sendKeys(lname);
		driver.findElement(tbCompany).clear();
		driver.findElement(tbCompany).sendKeys(comp);
		driver.findElement(btnSave).click();
	}
	
	public boolean verifyLeadContent(String lname, String comp)
	{
		if((driver.findElement(By.xpath("//td[@class='dataLabel'][text()='Last Name:']/following::td[text()="+lname+"]")).isDisplayed()) && (driver.findElement(By.xpath("//td[@class='dataLabel'][text()='Company:']/following::td[text()="+comp+"]")).isDisplayed()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	

}
