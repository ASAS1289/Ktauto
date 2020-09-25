package testNgpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
public class test4 {
	String baseUrl="https://www.nyandcompany.com/";
	String driverpath="C://Program Files//chromedriver.exe";
	 public WebDriver driver; 
	String actualTitle=null;
	String ecpectedTitle=null;
@Test
	public void newYork() {
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
	
	          String expectedTitle = "Women's Clothes & Accessories | Shop at New York & Company";
	          String actualTitle = driver.getTitle();
	          System.out.println(actualTitle);
	          Assert.assertEquals(actualTitle, expectedTitle);
	  
		WebElement menuEva=driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[1]/li/a"));
		boolean value=menuEva.isDisplayed();
		//System.out.println(value);
		Assert.assertEquals(value, true);
	}
		
	}
	
