package com.gurubank.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginValidation {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='uid']") WebElement Username;
	@FindBy(how=How.XPATH, using="//input[@name='password']") WebElement password;
	@FindBy(xpath="//input[@value='LOGIN']") WebElement Login_Button;
	
	
	public LoginValidation(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void UserLogin(String uid,String pass)
	{
		
		Username.sendKeys(uid);
		
		password.sendKeys(pass);
		
		Login_Button.click();
		
	}
	
	
	
	

}
