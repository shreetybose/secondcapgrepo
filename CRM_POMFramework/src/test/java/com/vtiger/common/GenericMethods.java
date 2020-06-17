package com.vtiger.common;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenericMethods {
	
	public static String getfilename()
	{
		DateFormat format=new SimpleDateFormat("yyyyddmmhhss");
		Date date=new Date();
		String datestr=format.format(date);
		
		return datestr;
	}
	
	public static String getscreenshot(String testname,WebDriver driver) throws IOException
	{
		DateFormat format=new SimpleDateFormat("yyyyddmmhhss");
		Date date=new Date();
		String datestr=format.format(date);	
	    String filename=System.getProperty("user.dir")+"\\src\\test\\java\\com\\vtiger\\reports\\Screenshot\\"+testname+" "+datestr+" .png";
	    File Scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(Scrfile, new File(filename));
	    return filename;
	}

}
