package testNgpack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	WebDriver driver;
	@BeforeClass
	public void BrowserOpen() {
	 System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://ui.freecrm.com/");
	}
	@Parameters({"email1", "Pwsd1"})
  @Test(priority=1)
  public void loginPage(String email1, String Pwsd1) {
	  WebElement emailId=driver.findElement(By.xpath("//*[@type='text']"));
	  emailId.sendKeys(email1);
	  WebElement password=driver.findElement(By.xpath("//*[@type='password']"));
	  password.sendKeys(Pwsd1);
	 WebElement login= driver.findElement(By.cssSelector("div.ui.fluid.large.blue.submit.button"));
	 login.click();
	  
  }
	@Test(priority=2)
	public void homePageValidation() {
		String homePageTitle=driver.getTitle();
		String exehomePageTitle="Cogmento CRM";
		System.out.println("Title of the home Page is " + homePageTitle);
		Assert.assertEquals(homePageTitle, exehomePageTitle);
		
	}
	@Test(priority=3)
	public void calenderPageValidation() {
	List<WebElement> links=driver.findElements(By.xpath("//*[@id='main-nav']/a/span"));
	int size=links.size();
	System.out.println(size);
	for(WebElement ele:links)
	{
		String linksText=ele.getText();
		Reporter.log(linksText);
	}
	}
  @AfterClass
  public void CloseBrowser() throws Throwable {
	  Thread.sleep(5000);
	  driver.quit();
  }
}
