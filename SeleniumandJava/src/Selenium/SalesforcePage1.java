package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesforcePage1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("sushmav@techsolutions.com");
		driver.findElement(By.id("password")).sendKeys("Advithi@05");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[@class='label']")).click();
		
		driver.findElement(By.xpath("//span[@class='slds-align-middle']")).click();
		//driver.findElement(By.xpath("//img[@class='lookupIcon']")).click();
		
		// frame1=driver.findElement(By.id("name_firstName"));
		WebElement frame1=driver.findElement(By.xpath("//*[@name='vfFrameId_1589762827820']"));
		
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("name_firstName")).sendKeys("Sushma");
		//Thread.sleep(3000);
		//Explicit wait
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(frame1));
		
		//driver.findElement(By.xpath("//*[@alt='Call Center Lookup (New Window)']")).click();
		
		
		/*	WebDriverWait wait= new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='w3-table-all notranslate']/tbody")));
		
		FluentWait wait1= new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	*/
		driver.quit();
		
	}

}
