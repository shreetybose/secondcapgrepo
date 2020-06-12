package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepage extends headerpage {
	
	public homepage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	private WebDriver driver;
	
	
	
	//################locator definition################
	
		By tabhome=By.xpath("//a[@class='currentTab'][text()='Home']");
		
		//#######################################################
		
		public boolean verifyhomepagetab()
		{
			try
			{
			if(driver.findElement(tabhome).isDisplayed())
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
