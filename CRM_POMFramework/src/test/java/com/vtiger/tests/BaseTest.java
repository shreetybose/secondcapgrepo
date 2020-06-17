package com.vtiger.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest {
	
	public WebDriver driver;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;

	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", "C:/SELENIUM/Selenium_software/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://localhost:100");
	    driver.manage().window().maximize();
	}
	
	
	@BeforeSuite
	public void reporting()
	{
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\src\\test\\java\\com\\vtiger\\reports\\extent.html");
	
		extent  = new ExtentReports();
        // attach only HtmlReporter
		extent.attachReporter(htmlReporter);	
	}
	
	@AfterMethod
	public void flushreport()
	{
		extent.flush();
	}
}
