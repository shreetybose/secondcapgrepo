package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class newleadpage extends headerpage {
	
	public newleadpage(WebDriver driver) 
	{
		super(driver);
		
		this.driver=driver;
	}

	private WebDriver driver;
	
	//********locator definition*****************
	
	By tb_leads=By.xpath("//a[@class='currentTab'][text()='Leads']");
	By tb_lstname=By.name("lastname");
	By tb_comp=By.name("company");
	By btn_save=By.name("button");
	
	
	public void fillformmandatoryfields(String lname,String comp)
	{
		driver.findElement(tb_lstname).clear();
		driver.findElement(tb_lstname).sendKeys(lname);
		driver.findElement(tb_comp).clear();
		driver.findElement(tb_comp).sendKeys(comp);
		driver.findElements(btn_save).get(0).click();
		
	}
	
	public boolean verifyleadcontentdata(String lname,String comp)
	{
		try
		{
	
		if(driver.findElement(By.xpath("//td[@class='dataLabel'][text()='Last Name:']/following::td[text()='+lname+']")).isDisplayed() && driver.findElement(By.xpath("//td[@class='dataLabel'][text()='Company:']/following::td[text()='BJP']")).isDisplayed())
		{
			return true;
		}
		else 
		{
			return false;
		}
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			return false;
		}
		
	}
	
	

}
