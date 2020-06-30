package com.guru.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.guru.pages.GuruBankLoginPage;

public class VerifyGuruLoginValidation {
	
	@Test
	public void GuruLogin()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/");
		
		GuruBankLoginPage login= new GuruBankLoginPage(driver);
		
		login.UserLogin("mgr123", "mgr!23");
		
		
	}

}
