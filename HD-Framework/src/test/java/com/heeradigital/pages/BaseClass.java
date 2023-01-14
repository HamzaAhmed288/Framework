package com.heeradigital.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import com.heeradigital.utility.ConfigDataProvider;



public class BaseClass {
	
	WebDriver driver;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void setUpSuite()
	{
		config = new ConfigDataProvider();
	}
	
	

}
