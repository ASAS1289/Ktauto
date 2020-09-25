package testNgpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gtest1 {
	public String baseUrl="https://www.nyandcompany.com/";
	 String driverpath="C://Program Files//chromedriver.exe";
	public WebDriver driver;
	
	
	@BeforeTest
	public void setbaseUrl() {
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver= new ChromeDriver();
		driver.get(baseUrl);
	
	}
 @Test
 public void verifyHomePageTitle() {
	  String exetitle="Women's Clothes & Accessories | Shop at New York & Company";
	  String actitle=driver.getTitle();
	  Assert.assertEquals(actitle, exetitle);
	  
 }

	
 @AfterTest
 public void closeBrowser() {
	  driver.quit();
 }
  }

