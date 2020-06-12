package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class headerpage {
	
	
		
		private WebDriver driver;
		
		public headerpage(WebDriver driver)
		
		{
			this.driver=driver;
		}
		
		//##############3LOCATOR DEFINITION###############
		
		
		
		
		
		//#############################################3
		
		public boolean verifylogout(String lnktxt)
		{
			try
			{
			if(driver.findElement(By.linkText(lnktxt)).isDisplayed())
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
		
		
		public void clicklink(String lnktxt)
		{
			driver.findElement(By.linkText(lnktxt)).click();
		}
		
		public Loginpage clicklogout(String lnktxt)
		{
			driver.findElement(By.linkText(lnktxt)).click();
			return new Loginpage();
		}
}
