package FacebookDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFacebook {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//first name
		WebElement fname=driver.findElement(By.xpath("//*[@name='firstname']"));
		fname.sendKeys("Selenium");
		
		//Last  name
		
	   WebElement Lname=driver.findElement(By.xpath("//*[@name='lastname']"));
	   Lname.sendKeys("TestAutomation");
	   
	   
	    Thread.sleep(3000);
	   //Dropdown Day
	   Select day=new Select(driver.findElement(By.xpath("//*[@id='day']")));
	   day.selectByValue("24");
	   
	    Thread.sleep(3000);
	   // Dropdown Month
	   Select Month= new Select(driver.findElement(By.xpath("//*[@id='month']")));
	   Month.selectByVisibleText("Jul");
	   Thread.sleep(3000);
	   //Dropdown Year
	   
	   Select year= new Select(driver.findElement(By.xpath("//*[@id='year']"))); 
	   year.selectByIndex(4);
	   
	    Thread.sleep(3000);
	   //Radiobtn
	    WebElement fRadio= driver.findElement(By.xpath("//input[@type='radio'][@value='1']"));
	    fRadio.click(); 
	    Thread.sleep(3000);
	   // Submitt btn
	   WebElement btn=driver.findElement(By.xpath("//*[@type='submit' and @name='websubmit']"));
	   btn.click();
	   
	   //driver.close();
	   
	   
	}

}
