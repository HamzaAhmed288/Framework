package com.heeradigital.testcases;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.heeradigital.pages.BaseClass;
import com.heeradigital.pages.LoginPage;
import com.heeradigital.utility.BrowserFactory;
import com.heeradigital.utility.Helper;


public class HD_LOGIN_Test extends BaseClass{
	
	WebDriver driver;
	
	@Test
	public void loginApp() throws InterruptedException 
	{	
		
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getdevURL());
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.logintoHeeraDigital("hamza@geeksofkolachi.com", "Hamza@123");
		

	}
	
	//For Taking Screenshot if the test case gets failed
	
	@AfterMethod
	public void tearDownMethod(ITestResult result)
	{
		if (result.getStatus()==ITestResult.FAILURE)
		{
		Helper.captureScreenshot(driver);
		}
	}

}
