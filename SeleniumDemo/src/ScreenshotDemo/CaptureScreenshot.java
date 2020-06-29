package ScreenshotDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class CaptureScreenshot  {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.get("https://www.apsrtconline.in/oprs-web/");
	    
	    driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("Chennai");
	    
	    TakesScreenshot shot=(TakesScreenshot)driver;
	    File source=shot.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(source, new File("C:\\Users\\dELL\\Desktop\\Screenshots/ping1.png"));
	    
	    //driver.close();
	    
	    

	}

}
