package testNgpack;

import org.testng.annotations.Test;

import ObjectRep.CrmLoginPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class FreeCRMLoginPO {
	WebDriver driver;
	@BeforeMethod
	public void BrowserOpen() {
	 System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://ui.freecrm.com/");
	}
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	 
	  CrmLoginPage.email1(driver).sendKeys(n);
	 
	  CrmLoginPage.pswd1(driver).sendKeys(s);
	
	CrmLoginPage.submitbt(driver).click();
  }

  @DataProvider
  public Object[][] dp() throws IOException {
	  ExcelReader e1=new ExcelReader();
	   String fpath=System.getProperty("user.dir")+"\\src";
	   
	     return e1.readExcel(fpath, "Book1.xlsx", "Sheet1");
	   
	  };
	  
	  @AfterMethod
	  public void closeBrowser() {
		  driver.close();
		  
    
  }
}
