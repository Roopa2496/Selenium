package AlertDemo;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AlertPopUp {
	
	
	@Test
	public void HandleAlert() throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); 
    driver.manage().window().maximize();
    driver.get("https://www.apsrtconline.in/oprs-web/");
    
    driver.findElement(By.xpath("//*[@value='Check Availability']")).click();
    Thread.sleep(3000);
    
    Alert  alert= driver.switchTo().alert();
    String actualmsg="Please select start place.";
    String expctmsg=alert.getText();
    System.out.println("The alert message is:"+expctmsg );
    Assert.assertEquals(expctmsg, actualmsg);
    
    alert.accept();
    
    
    
	}

}
