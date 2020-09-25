package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		/*
		 * isDisplayed(): whether that object is displayed in the browser or not
		 */
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links: " + links.size());
		
		
		
		for(int i = 0; i < links.size(); i++)
		{
			if(links.get(i).isDisplayed())
			{
				String linkName = links.get(i).getText();
				System.out.println("Name of the link is:" +linkName);
			}
			
		}
		
		Thread.sleep(6500);
		driver.quit();
	}
	

}
