package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	private WebDriver driver;
	
	public void loginpage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	//**********locator definition*************
	
	By tb_username=By.name("user_name");
	By tb_pwd=By.name("user_password");
	By btn_login=By.name("Login");
	By txt_loginerrmsg=By.xpath("//td[contains(text(),'You must specify a valid username and password.')]");
	By img_logo=By.xpath("//img[@src='include/images/vtiger-crm.gif']");
	
	
	//******parameter definition****************
	//name-
	//method name-
	//created by-
	//modified by-
	//date -
	
	//*************************************************
	
	public boolean verifytitle(String exptitltle)
	{
		try
		{
		if(exptitltle.equals(driver.getTitle().trim()))
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
	
	
	public void login(String user,String pwd)
	{
	driver.findElement(tb_username).clear();
	driver.findElement(tb_username).sendKeys(user);
	driver.findElement(tb_pwd).clear();
	driver.findElement(tb_pwd).sendKeys(pwd);
	driver.findElement(btn_login).click();
	
	}
	
	
	public boolean verifyloginerrmsg()
	{
		try
		{
	if(driver.findElement(txt_loginerrmsg).isDisplayed())
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
	
	public boolean verifyloginpagelogo()
	{
		try
		{
		if(driver.findElement(img_logo).isDisplayed())
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
