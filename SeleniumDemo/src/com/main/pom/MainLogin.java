package com.main.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.gurubank.pom.LoginValidation;

public class MainLogin {
	
	public void ValidLogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/");
		
		LoginValidation logobj=PageFactory.initElements(driver, LoginValidation.class);
	    
		logobj.UserLogin("mgr123", "mgr!23");
	
	
	}

}
