package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orbitz {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
		driver.get("https://www.orbitz.com/");
		driver.manage().window().maximize();
		
		WebElement hotel=driver.findElement(By.id("primary-header-hotel"));
		hotel.click();
		driver.navigate().back();
		
		WebElement flight=driver.findElement(By.id("primary-header-flight"));
		flight.click();
		Thread.sleep(3500);
		
		driver.navigate().back();
		
		List<WebElement> tags=driver.findElements(By.tagName("a"));
		int s=tags.size();
		
		
		System.out.println(s);
          
		for(WebElement numberoftags : tags)
		{
			
			System.out.println(numberoftags.getAttribute("href"));
		}
		driver.quit();
		
	}

}
