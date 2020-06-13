package com.vTiger.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vTiger.common.config;
import com.vTiger.pages.HomePage;
import com.vTiger.pages.LoginPage;

public class LoginTest {
	
	public WebDriver driver;
	
	@BeforeClass
	public void launchapp()
	{
	System.setProperty("webddriver.chrome.driver", config.chromepath);
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get(config.url);
	
	driver.manage().timeouts().implicitlyWait(config.globaltimeout, TimeUnit.SECONDS);
	}
	
	@Test
	public void validatetittle()
	{
		LoginPage lp=new LoginPage(driver);
		
		boolean output=lp.verifyTitle("vtiger CRM - Commercial Open Source CRM");
		
		Assert.assertEquals(output, true);
	}
	
	
	@Test
	public void validateLogo()
	{
		LoginPage lp=new LoginPage(driver);
		
		boolean output=lp.VerifyLoginPageLogo();
		
		Assert.assertEquals(output, true);
	}
	
	
	@Test
	public void validateinvalidlogin()
	{
		LoginPage lp=new LoginPage(driver);
		
		lp.Login("abcd", "shreety");
		
		boolean output=lp.VerifyLoginErrorMsg();
		
		Assert.assertEquals(output, true);
		
	}
	
	
	
	@Test
	public void validatevalidlogin()
	{
		LoginPage lp=new LoginPage(driver);
		
		lp.Login("admin", "admin");
		
		HomePage hp=new HomePage(driver);
		
	    boolean output=hp.verifyLink("Logout");
	
		Assert.assertEquals(output, true);
		
	}
	
	
	
	@AfterClass
	public void tierdown()
	{
		driver.close();
		driver.quit();
	}

}
