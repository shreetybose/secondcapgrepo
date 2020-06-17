package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	private String Exptittle="vtiger CRM - Commercial Open Source CRM123";
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//********page factory*******************
	
	@FindBy(name="user_name")
	WebElement tb_user_name;
	
	@FindBy(name="user_password")
	WebElement tb_user_password;
	
	@FindBy(name="login_theme")
	WebElement dp_login_theme;
	
	@FindBy(name="Login")
	WebElement btn_Login;
	
	@FindBy(xpath="//img[@src='include/images/vtiger-crm.gif']")
	WebElement img_logo;
	
	
	// Loginpage related functionalities defining here
	//***********************************************************
	//method name- Verifytittle-parameters
	//created by-Shreety Bose
	//reviewed by-Rajesh
	//modified date-09-09-9999
	//************************************************************
	public void Login()
	{
		tb_user_name.sendKeys("admin");
		tb_user_password.sendKeys("admin");
		dp_login_theme.sendKeys("blue");
		btn_Login.click();
	}
	
	public boolean verifytittle()
	{
		if(Exptittle.equals(driver.getTitle().trim()))
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	
	public boolean verifylogo()
	{
		if(img_logo.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	
	
	
	
}
