package com.heeradigital.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage (WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(xpath="//input[@name='email']") WebElement email;
	@FindBy(xpath="//input[@name='password']") WebElement pass;
	//@FindBy(xpath="//span/div") WebElement checkbox;
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/form/div[5]/button/div") WebElement loginButton;
	
	public void logintoHeeraDigital(String username, String password) throws InterruptedException
	{
		
		email.sendKeys(username);
		pass.sendKeys(password);
		Thread.sleep(10000);
		//checkbox.click();
		String framename=driver.findElement(By.tagName("iframe")).getAttribute("name");
        driver.switchTo().frame(framename);
        driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
        driver.switchTo().defaultContent();
        
		Thread.sleep(15000);
		loginButton.click();
	}

}
