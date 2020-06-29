package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//1-id
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//2- name
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//4-xpathLocator
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).clear();
		
		//5-cssSelector
		
		driver.findElement(By.cssSelector("#txtPassword")).clear();
		
		//6-Link text
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//navigate to back
		driver.navigate().back();
		
		
	
	
	}

}
