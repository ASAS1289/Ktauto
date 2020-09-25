package Selenium;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertiesFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//get: used to open the application
			driver.get("https://www.bing.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Properties pr=new Properties();

		FileInputStream fis= new FileInputStream("C:\\Users\\advit\\eclipse-workspace\\NaveenAutomation\\src\\Selenium\\OR");
		pr.load(fis);
	
		String p1= pr.getProperty("Bing.search.id");
		String p2= pr.getProperty("Bing.serch.button.xpath");
		
		System.out.println(p1);
		System.out.println(p2);
		
		driver.findElement(By.id(p1)).sendKeys("Krishna Training");
		driver.findElement(By.xpath(p2)).click();
		driver.quit();
		
		
	}

}
