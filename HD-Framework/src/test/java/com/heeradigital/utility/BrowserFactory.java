package com.heeradigital.utility;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class BrowserFactory {
	
	
	public static WebDriver startApplication(WebDriver driver,String browserName,String appURL) throws InterruptedException
	{
		if (browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");
			driver=new ChromeDriver();	
		}
		else if (browserName.equals("Firefox"))
		{
			
		}
		else if (browserName.equals("Safari"))
		{
			
		}
		else
		{
			System.out.println("We do not support this browser");
		}
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		/*
		driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F%3Fgws_rd%3Dssl&ec=GAZAmgQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	    Thread.sleep(2000);
	    driver.findElement(By.name("identifier")).sendKeys("hamza@geeksofkolachi.com"+Keys.ENTER);
	    Thread.sleep(5000);
	    driver.findElement(By.name("Passwd")).sendKeys("Hamzahmed288"+Keys.ENTER);
	    Thread.sleep(5000);
		*/
		
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("d3vh33r4pw22");
		alert.accept();
		
		return driver;
		
	}
	
	public static void quitbrowser(WebDriver driver) 
	{
		driver.quit();
	}

}
