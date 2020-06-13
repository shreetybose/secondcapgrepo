package com.vTiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//################## Locator definition############################
	
	By tb_username=By.name("user_name");
	By tb_pwd=By.name("user_password");
	By dp_Theme=By.name("login_theme");
	By btn_Login=By.name("Login");
	By txt_ErrorMsgLogin=By.xpath("//td[contains(text(),'You must specify a valid username and password.')]");
	By img_LogoLogin=By.xpath("//img[@src='include/images/vtiger-crm.gif']");
	
	
	
//################################################################
// Method Name: verifyTitle --Parameters...
// Created By : 
// Date:
// Modified By: 
// Date	
//############################################################
	
	public boolean verifyTitle(String expTitle)
	{
		if(expTitle.equals(driver.getTitle().trim()))// if 1.1 started here
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public void Login(String user, String pwd)
	{
		driver.findElement(tb_username).clear();
		driver.findElement(tb_username).sendKeys(user);
		driver.findElement(tb_pwd).clear();
		driver.findElement(tb_pwd).sendKeys(pwd);
		driver.findElement(btn_Login).click();
	}
	
	
	public boolean VerifyLoginErrorMsg()
	{
		try
		{
			if(driver.findElement(txt_ErrorMsgLogin).isDisplayed())
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
	
	
	public boolean VerifyLoginPageLogo()
	{
		try
		{
			if(driver.findElement(img_LogoLogin).isDisplayed())
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
