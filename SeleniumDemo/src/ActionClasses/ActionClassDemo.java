package ActionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com");
	    driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	  
	    Actions action= new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath(" //span[text()='Women']"))).build().perform();
	    
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//a[@title='Sarees']")).click();
	    Thread.sleep(4000);
	    
	   WebElement text=driver.findElement(By.xpath("//div[text()='Sarees']"));
	   String expecttxt=text.getText();
	   String actualtxt="Sarees";
	   
	   if (expecttxt.equals(actualtxt))
	   {
		   System.out.println("We are Navigated to Sarees Page");
	   }
	   else
	   {
		   System.out.println("We are not in sarees page");
	   }
	    
	    

	}

}
