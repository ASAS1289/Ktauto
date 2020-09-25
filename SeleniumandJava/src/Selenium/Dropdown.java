package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         driver.get("https://www.bing.com/account/general?ru=");
         driver.manage().window().maximize();
         //this is for dropdown values will send by send keys
        // driver.findElement(By.id("rpp")).sendKeys("15");
         //
       WebElement DDOtion= driver.findElement(By.id("rpp"));
        
        Select s = new Select(DDOtion);
       // Select s = new Select(driver.findElement(By.id("rpp")));
        
        // We can pass values in dropdown in three ways
        // 1.ByIndex
        //2.ByValue
        //3.Byvisibletext
       // s.selectByIndex(1);
        //s.selectByValue("30");
        s.selectByVisibleText("50");
         
         Thread.sleep(6500);
         driver.quit();
	}

}
