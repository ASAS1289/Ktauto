package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Freecrm {
	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://ui.freecrm.com/");
	 WebElement emailId=driver.findElement(By.xpath("//*[@type='text']"));
	  emailId.sendKeys("studentuser2020@gmail.com");
	  WebElement password=driver.findElement(By.xpath("//*[@type='password']"));
	  password.sendKeys("nevergiveup2020");
	 WebElement login= driver.findElement(By.cssSelector("div.ui.fluid.large.blue.submit.button"));
	 login.click();
	 WebElement contact=driver.findElement(By.xpath("//*[@id='main-nav']/a[3]"));
		contact.click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		WebElement newButton=driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a/button"));
		newButton.click();
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		Thread.sleep(10000);
		//WebElement formElement = driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]//form"));
		//WebDriverWait wait=new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOf(formElement));
		//WebElement formElement = driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]//form"));
		//WebDriverWait wait=new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOf(formElement));
		 WebElement fname=driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input"));
		 fname.click(); 
		 fname.sendKeys("test");
	
		 System.out.println(fname.getAttribute("name"));
		 WebElement lname=driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/div/input"));
			  lname.sendKeys("Sunny");
			
		  /*WebElement email1=driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div/div/div[1]/input"));
		  email1.sendKeys("test1@sunny.com");
		  WebElement company=driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/input"));
		  company.sendKeys("techsolutions");
		  WebElement category=driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[4]/div[2]/div/div"));
		  category.click();
		  WebElement contacts=driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[4]/div[2]/div/div/div[2]/div[4]"));
		  contacts.click();
		  WebElement saveb=driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/button[2]"));
		  saveb.submit();
		  
		 // fname1.sendKeys("Sunny");
		 // WebElement lname=driver.findElement(By.xpath("//form/div[1]/div[1]/div/div/input[@name='first_name']"));
		 // lname.sendKeys("Sunny");
		//*[@class='two fields']//input[@name='last_name']
		//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input"
		//input[@name='first_name']*/
		  Thread.sleep(4000);
		  //driver.quit();
	}
}
