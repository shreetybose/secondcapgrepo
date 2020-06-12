package com.vtiger.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.common.config;

public class basetest {
	
	public WebDriver driver;
	
	public void launchapp()
	{
		System.setProperty("webdriver.chrome.driver", config.chromepath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(config.url);
		driver.manage().timeouts().implicitlyWait(config.globaltimeout, TimeUnit.SECONDS);
	}
	
	public void closeapp()
	{
		driver.close();
		driver.quit();
	}

}
