package com.vtiger.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vtiger.common.config;
import com.vtiger.pages.Loginpage;
import com.vtiger.pages.homepage;

public class Logintest extends basetest{
	
	public WebDriver driver;
	
	@BeforeClass
	public void launchapp()
	{
		System.setProperty("webdriver.chrome.driver", config.chromepath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(config.url);
		driver.manage().timeouts().implicitlyWait(config.globaltimeout, TimeUnit.SECONDS);
	}
	
	
	@Test
    public void validatetitle()
    {
		Loginpage lp=new Loginpage();
		boolean output=lp.verifytitle("vtiger CRM - Commercial Open Source CRM");
		Assert.assertEquals(output, true);
    }
	
	@Test
	public void validatelogo()
	{
		Loginpage lp=new Loginpage();
		boolean output=lp.verifyloginpagelogo();
		Assert.assertEquals(output, true);
	}
	
	@Test
	public void validateinvalidlogin()

	{
	Loginpage lp=new Loginpage();
	lp.login("abcd", "lmnk");
	boolean output=lp.verifyloginerrmsg();
	Assert.assertEquals(output, true);	
	}
	
	@Test
	public void validatevalidlogin()
	{
		Loginpage lp=new Loginpage();
		lp.login("admin", "admin");
		homepage hp=new homepage(driver);
		boolean output=hp.verifylogout(lnktxt);
		Assert.assertEquals(output, true);
		
	}
	
	
	
	
	
	@AfterClass
	public void tierdown()
	{
		driver.close();
		driver.quit();
	}

}
