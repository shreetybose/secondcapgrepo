package com.vTiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends HeaderPage {

	public HomePage(WebDriver driver) 
	
	{
		
		super(driver);
		
		this.driver=driver;
		
	}
	
	By tabhome=By.xpath("//a[@class='currentTab'][text()='Home']");
	
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
