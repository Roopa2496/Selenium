package TestPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.redbus.com");
		Thread.sleep(5000);
	//WebDriverWait wait = new WebDriverWait(driver,30);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("wewidgeticon we_close,'COMPOSE')]")));
		driver.findElement(By.id("go")).click();
		driver.close();

	}
	
}
