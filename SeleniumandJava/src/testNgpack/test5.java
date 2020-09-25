package testNgpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test5 {
	static WebDriver driver;
	
	 public void openBrowser() { 
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.nyandcompany.com/");
	 }
		 @Test(priority=1)
		  public void gettitle() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Women's Clothes & Accessories | Shop at New York & Company");
	  }
		 @Test(priority=2)
		 public void evaMenu() {
		WebElement menuEva=driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[1]/li/a"));
		boolean value=menuEva.isDisplayed();
		System.out.println(value);
		
		if(value==true)
		{
			Reporter.log("Test Case is Passed for isdisplayed : " + value);
		}
		else
		{
			Reporter.log("Test Case is Failed for isdisplayed : " + value);
		}
		
		menuEva.click();
		String titleEva=driver.getTitle();
		System.out.println(titleEva);
		String exetitleEva="Eva Mendes Collection | Dresses, Tops & More | NY&C";
		
		if(titleEva.equals(exetitleEva))
		{
			Reporter.log("Test Case is Passed for Title : " + titleEva);
		}
		else
		{
			Reporter.log("Test Case is Failed for Title : " + titleEva);
		}
		 }
		 @Test(priority=3)
		 public void menuGU() {
		WebElement menuGU=driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[2]/li[1]/a"));
		boolean valueGU=menuGU.isDisplayed();
		System.out.println(valueGU);
		
		if(valueGU==true)
		{
			Reporter.log("Test Case is Passed for isdisplayed : " + valueGU);
		}
		else
		{
			Reporter.log("Test Case is Failed for isdisplayed : " + valueGU);
		}
		
		menuGU.click();
		String titleGU=driver.getTitle();
		System.out.println(titleGU);
		String exetitleGU="Gabrielle Union Collection at New York & Company";
		
		if(titleGU.equals(exetitleGU))
		{
			System.out.println("Test Case is Passed for Title : " + titleGU);
		}
		else
		{
			System.out.println("Test Case is Failed for Title : " + titleGU);
		}
		 }
		 @Test(priority=4)
		 public void menuBwl() {
		WebElement menuBWl=driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[2]/li[2]/a"));
		boolean valueBWl=menuBWl.isDisplayed();
		System.out.println(valueBWl);
		
		if(valueBWl==true)
		{
			System.out.println("Test Case is Passed for isdisplayed : " + valueBWl);
		}
		else
		{
			System.out.println("Test Case is Failed for isdisplayed : " + valueBWl);
		}
		
		menuBWl.click();
		String titleBWl=menuBWl.getText();
		System.out.println(titleBWl);
		String exetitleBWl="BRANDS WE LOVE";
		
		if(titleBWl.equals(exetitleBWl))
		{
			System.out.println("Test Case is Passed for Title : " + titleBWl);
		}
		else
		{
			System.out.println("Test Case is Failed for Title : " + titleBWl);
		}
		 }
		 @Test(priority=5)
		 public void menuNA() {
		WebElement menuNA=driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[2]/li[3]/a"));
		boolean valueNA=menuNA.isDisplayed();
		System.out.println(valueNA);
		
		if(valueNA==true)
		{
			System.out.println("Test Case is Passed for isdisplayed : " + valueNA);
		}
		else
		{
			System.out.println("Test Case is Failed for isdisplayed : " + valueNA);
		}
		
		menuNA.click();
		String titleNA=driver.getCurrentUrl();
		System.out.println(titleNA);
		String exetitleNA="https://www.nyandcompany.com/new/must-haves/N-103455/";
		
		if(titleNA.equals(exetitleNA))
		{
			System.out.println("Test Case is Passed for Title : " + titleNA);
		}
		else
		{
			System.out.println("Test Case is Failed for Title : " + exetitleNA);
		}
		 }
		 @Test(priority=6)
		public void closeBrowser() {
		driver.quit();
	}

 
  
}
