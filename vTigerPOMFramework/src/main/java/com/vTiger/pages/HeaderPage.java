package com.vTiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage {
	
public WebDriver driver;
	
	public HeaderPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//################## Locator definition############################
	
	
	
	
	
	public boolean verifyLink(String lnktext)
	{
		try
		{
			if(driver.findElement(By.linkText(lnktext)).isDisplayed())
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
	
	
	public void clickLink(String lnktext)
	{
		driver.findElement(By.linkText(lnktext)).click();
	}
	
	
	
	
	
	
	public LoginPage clickLogout(String lnktext)
	{
		driver.findElement(By.linkText(lnktext)).click();
		return new LoginPage(driver);
	}
	

}
