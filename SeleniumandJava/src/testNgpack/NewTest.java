package testNgpack;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class NewTest {
	WebDriver driver;
	@BeforeMethod
	public void BrowserOpen() {
	 System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.get("https://www.w3schools.com/html/html_forms.asp");
	}
  @Test(dataProvider = "dp")
  public void f(String fname, String lname) {
	  WebElement fName=driver.findElement(By.id("fname"));
	  fName.clear();
	  fName.sendKeys(fname);
	  WebElement lName=driver.findElement(By.id("lname"));
	  lName.clear();
	  lName.sendKeys(lname);
	 WebElement submit1= driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/form/input[3]"));
	 submit1.submit();
  }

  @DataProvider
  public Object[][] dp() throws IOException {
	  ExcelReader e1=new ExcelReader();
	   String fpath=System.getProperty("user.dir")+"\\src";
	   
	     return e1.readExcel(fpath, "Html.xlsx", "Values");
	   
	  };
	  
	  @AfterMethod
	  public void closeBrowser() {
		  driver.quit();
		  
   
 }
  }

