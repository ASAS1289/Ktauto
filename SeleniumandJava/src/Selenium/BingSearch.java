package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		/* i want to launch a chrome browser
		 * open bing.com 
		 * enter krishnatraining 
		 * click on search button

		 * what is the syntax??? 
		 * hnow to create an object to webdriver???
		 * to work on any browser from selenium 3.X u ned to specifcy browser exe file specify to 
		 * the browser version which we have  
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get: used to open the application
		driver.get("https://www.bing.com/");
		
		
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		
		//sendkeys: wich is used to entyer a value tot he text field
		driver.findElement(By.id("sb_form_q")).sendKeys("Krishna Training");
		
		
		//click : to perform click operation on any button or image or anything
				driver.findElement(By.xpath("//label[@for='sb_form_go']")).click();
				
		Thread.sleep(6000);
		driver.quit();   //which will terminate the browser instance
		
	}

}
