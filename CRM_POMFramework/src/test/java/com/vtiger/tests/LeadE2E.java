package com.vtiger.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vtiger.pages.CreateLeadPage;
import com.vtiger.pages.HomePage;
import com.vtiger.pages.LoginPage;

public class LeadE2E extends BaseTest {
	
	
	
	@BeforeClass
	public void launchapp()
	{
	if(driver==null)
	{
		openURL();
	}
	}
	
	@Test
	public void verifyleadE2Efunctionality()
	{
		LoginPage lp=new LoginPage(driver);
		lp.Login();
		HomePage hp=new HomePage(driver);
		hp.clickonNewLead();
		CreateLeadPage clp=new CreateLeadPage(driver);
		clp.createlead("Modi", "BJP");
		hp.clickonLogout();
				
	}

	@AfterClass
	public void closeapp()
	{
		driver.quit();
	}

	

}
