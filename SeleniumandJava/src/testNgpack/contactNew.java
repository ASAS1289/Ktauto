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

public class contactNew {
	
	WebDriver driver;
	@BeforeMethod
	public void BrowserOpen() {
	 System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://ui.freecrm.com/");
	 WebElement emailId=driver.findElement(By.xpath("//*[@type='text']"));
	  emailId.sendKeys("studentuser2020@gmail.com");
	  WebElement password=driver.findElement(By.xpath("//*[@type='password']"));
	  password.sendKeys("nevergiveup2020");
	 WebElement login= driver.findElement(By.cssSelector("div.ui.fluid.large.blue.submit.button"));
	 login.click();
	 WebElement contact=driver.findElement(By.xpath("//*[@id='main-nav']/a[3]"));
		contact.click();
		WebElement newButton=driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a/button"));
		newButton.click();
	
	
	}
  @Test(dataProvider = "dp")
  public void f(String fName, String lName, String Company, String email) {
	  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  WebElement fname=driver.findElement(By.name("first_name"));
	  fname.sendKeys(fName);
	  WebElement lname=driver.findElement(By.name("last_name"));
	  lname.sendKeys(lName);
	  WebElement company=driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/input"));
	  company.sendKeys(Company);
	  WebElement emailId=driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div/div/div[1]/input"));
	  emailId.sendKeys(email);
	  WebElement category=driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[4]/div[2]/div/div"));
	  category.click();
	  WebElement contacts=driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[4]/div[2]/div/div/div[2]/div[4]"));
	  contacts.click();
	  WebElement savebutton=driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/button[2]"));
	  savebutton.submit();
  }

  @DataProvider
  public Object[][] dp() throws IOException {
	  ExcelReader e2=new ExcelReader();
	   String fapath=System.getProperty("user.dir")+"\\src";
	   
	     return e2.readExcel(fapath, "ContactNew.xlsx", "Sheet1");
	   
    };

    
    @AfterMethod
	  public void closeBrowser() {
		  driver.close();
		  
  

  }
}
