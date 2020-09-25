package testNgpack;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
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
	  WebElement emailId=driver.findElement(By.xpath("//*[@type='text']"));
	  emailId.sendKeys(n);
	  WebElement password=driver.findElement(By.xpath("//*[@type='password']"));
	  password.sendKeys(s);
	 WebElement login= driver.findElement(By.cssSelector("div.ui.fluid.large.blue.submit.button"));
	 login.click();
	 //driver.close();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "test1@test.com", "test2" },
      new Object[] { "test2@test.com", "test1" },
    };
  }
    
    @AfterMethod
    public void CloseBrowser() throws Throwable {
  	  Thread.sleep(5000);
  	  driver.quit();
    
  }
}
