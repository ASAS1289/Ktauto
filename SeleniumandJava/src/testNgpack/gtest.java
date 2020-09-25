package testNgpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gtest {
	
	public String baseUrl="https://www.nyandcompany.com/";
	String driverpath="C://Program Files//chromedriver.exe";
	public WebDriver driver;
	
	
	
  @BeforeMethod
  public void verifyHomePageTitle() {
	  System.setProperty("webdriver.chrome.driver", driverpath);
		driver= new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		 
	  String exetitle="Women's Clothes & Accessories | Shop at New York & Company";
	  String actitle=driver.getTitle();
	  Assert.assertEquals(actitle, exetitle);
	  
  }
  @Test(priority = 1)
  public void evaMenu(){
	  WebElement menuEva=driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[1]/li/a"));
		boolean value=menuEva.isDisplayed();
        Assert.assertEquals(value, true);
        Reporter.log("Test is passed");
  }
  @Test(priority = 2)
  public void evaMenuClick() {
	  WebElement menuEva=driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[1]/li/a"));
      menuEva.click();
 	String titleEva=driver.getTitle();
 	System.out.println(titleEva);
 	String exetitleEva="Eva Mendes Collection | Dresses, Tops & More | NY&C";
 	Assert.assertEquals(titleEva, exetitleEva);
 	Reporter.log("test is passed");
 	//driver.navigate().back();
  }
	
	  @Test(priority = 3) public void guMenu() { WebElement
	  menuGU=driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[2]/li[1]/a"));
	 
	   boolean valueGU=menuGU.isDisplayed();
	   Assert.assertEquals(valueGU, true);
	  Reporter.log("Test passed");
	  }
	  
	  @Test(priority = 4) 
	  public void guMenuClick()
	  { 
		  WebElement menuGU=driver.findElement(By.xpath( "/html/body/header/nav[1]/div[3]/div/ul[2]/li[1]/a"));
		  menuGU.click();
	 
	   String titleGU=driver.getTitle(); System.out.println(titleGU);
	  String exetitleGU="Gabrielle Union Collection at New York & Company";
	  Assert.assertEquals(titleGU, exetitleGU); 
	  Reporter.log("TestCase is passed");
	  //driver.navigate().back();
	  }
	  
	  @Test(priority = 5)
	  public void bwlMenu() {
		  WebElement menuBWl=driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[2]/li[2]/a"));
	   boolean valueBWl=menuBWl.isDisplayed();
	   Assert.assertEquals(valueBWl, true);
	  Reporter.log("Test Case is Passed");
	  }
	  
	  @Test(priority = 6)
	  public void bwlMenuClick() { 
		  WebElement menuBWl=driver.findElement(By.xpath( "/html/body/header/nav[1]/div[3]/div/ul[2]/li[2]/a")); 
	   
	  String titleBWl=menuBWl.getText();
	  
	  String exetitleBWl="BRANDS WE LOVE"; 
	  Assert.assertEquals(titleBWl,exetitleBWl);
	  Reporter.log("test is passed"); }
	  
	  @Test(priority = 7) 
	  public void naMenu() { 
	  WebElement menuNA=driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[2]/li[3]/a"));
	  boolean valueNA=menuNA.isDisplayed();
	  Assert.assertEquals(valueNA, true);
	  Reporter.log("test is passed");
	  }
	  
	  @Test(priority = 8) 
	  public void naMenuClick() { 
		  WebElement menuNA=driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[2]/li[3]/a"));
	  menuNA.click(); 
	  String titleNA=driver.getCurrentUrl(); System.out.println(titleNA); 
	  String exetitleNA="https://www.nyandcompany.com/new/must-haves/N-103455/";
	  Assert.assertEquals(titleNA, exetitleNA); 
	  Reporter.log("test is passed");
	  //driver.navigate().back(); }
	 
	  }
	
	  @AfterMethod
	  public void goBackToHomepage ( )
	  {
		  driver.navigate().back();
		  }
	 
	 
  /*
  */
}
