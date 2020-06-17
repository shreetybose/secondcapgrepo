package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage extends HeaderPage {
	
	

	public CreateLeadPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//**********page factory ****************
	
	@FindBy(name="lastname")
	WebElement tb_lastname;
	
	@FindBy(name="company")
	WebElement tb_company;
	
	@FindBy(name="button")
	WebElement btn_button;
	
	@FindBy(xpath="//td[text()='Last Name:']/following::td[1]")
	WebElement lbl_lastname;
	
	public boolean createlead(String lname,String comp)
	{
		tb_lastname.sendKeys(lname);
		tb_company.sendKeys(comp);
		btn_button.click();
		if(lbl_lastname.getText().equals(lname))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
}
