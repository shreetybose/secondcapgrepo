package com.vtiger.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.vtiger.common.GenericMethods;
import com.vtiger.pages.HomePage;
import com.vtiger.pages.LoginPage;

public class LoginTests extends BaseTest {
	
	
	
	@BeforeClass
	public void launchapp()
	{
	if(driver==null)
	{
		openURL();
	}
	}
	
	@Test
	public void validlogin()
	{
		logger=extent.createTest("validlogin");
		LoginPage lp=new LoginPage(driver);
		logger.info("Navigated to login page");
		lp.Login();
		logger.pass("Login successfully");
		HomePage hp=new HomePage(driver);
		logger.info("Navigated to home page");
		hp.clickonLogout();
		logger.pass("Logout successfully");			
	}
	
	@Test
	public void verigyloginpagecontent() throws IOException
	{
		SoftAssert as=new SoftAssert();
		logger=extent.createTest("verigyloginpagecontent");
		LoginPage lp=new LoginPage(driver);
		logger.info("Navigated to home page");
		if(lp.verifytittle())
		{
			logger.pass("Tittle matched successfully");
		}
		else
		{
		String path=GenericMethods.getscreenshot("verigyloginpagecontent", driver);
			logger.fail("Tittle did not match");
			logger.fail("Tittle did not match",MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		}
				
		//as.assertEquals(val, true);
		
		if(lp.verifylogo())
		{
			logger.pass("logo matched successfully");
		}
		else
		{
			logger.fail("logo did not match");
		}
	//	as.assertEquals(val, false);
	//	as.assertAll();
		
		
	}
	
	@AfterClass
	
	public void closeapp() throws IOException
	{
		/*
		 * if(itest.getStatus()==itest.FAILURE) {
		 * logger.fail(itest.getThrowable().toString()+"Logo not found");
		 * logger.fail(itest.getThrowable().toString()+"Logo not found"
		 * ,MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build()); }
		 */
		
		driver.quit();
	}

	

}
