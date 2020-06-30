package com.guru.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GuruBankLoginPage {
	
	WebDriver driver;
	
	By uname=By.xpath("//input[@name='uid']");
	
	By password=By.xpath("//input[@name='password']");
	
	By Login_button=By.xpath("//input[@value='LOGIN']");
	
	public GuruBankLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void UserLogin(String uid,String pass)
	{
		
		driver.findElement(uname).sendKeys(uid);
		
		driver.findElement(password).sendKeys(pass);
		
		driver.findElement(Login_button).click();
		
	}
}
