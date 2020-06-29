package iFramesDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.get("https://www.w3schools.com/html/html_iframe.asp");
	    
	    Thread.sleep(3000);
	    
	    int total_frames=driver.findElements(By.tagName("iframe")).size();
	    System.out.println("Total frames in webpage are:"+total_frames);
	    
	    WebElement myframe= driver.findElement(By.xpath("//iframe[@src='default.asp']"));
	    driver.switchTo().frame(myframe);
	    
	    WebElement search=driver.findElement(By.xpath("//a[@onclick='open_search(this)'][1]"));
	    search.click();
	    WebElement searchbox=driver.findElement(By.xpath("//input[@name='search']"));
	    searchbox.sendKeys("Search");
	    
	    driver.switchTo().defaultContent();
	  

	}

}
