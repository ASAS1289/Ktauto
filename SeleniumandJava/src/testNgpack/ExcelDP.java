package testNgpack;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class ExcelDP {
	WebDriver driver;
	@BeforeMethod
	public void browserOpen() {
	System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
     driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://www.orbitz.com/");
	}
  @Test(dataProvider = "dp")
  public void f(String des, String checkin, String cOut) {
	 WebElement goingTo= driver.findElement(By.xpath("//*[@id='hotel-destination-hp-hotel']"));
	 goingTo.sendKeys(des, Keys.ENTER);
	 WebElement checkIn= driver.findElement(By.id("hotel-checkin-hp-hotel"));
	 checkIn.sendKeys(checkin);
	 WebElement checkOut= driver.findElement(By.id("hotel-checkout-hp-hotel"));
	 checkOut.sendKeys(cOut);
	 WebElement Room=driver.findElement(By.id("hotel-rooms-hp-hotel"));
     Room.click();
     Select s= new Select(Room);
     s.selectByVisibleText("1");
     WebElement dAdult= driver.findElement(By.id("hotel-1-adults-hp-hotel"));
     dAdult.click();
     Select sel= new Select(dAdult);
     sel.selectByValue("2");
     WebElement children= driver.findElement(By.id("hotel-1-children-hp-hotel"));
     children.click();
     Select sele=new Select(children);
     sele.selectByIndex(2);
    
     WebElement age=driver.findElement(By.id("hotel-1-age-select-1-hp-hotel"));
     age.click();
     Select selec= new Select(age);
     selec.selectByValue("8");
     WebElement cage=driver.findElement(By.id("hotel-1-age-select-2-hp-hotel"));
     cage.click();
     Select select=new Select(cage);
     select.selectByValue("11");
     driver.findElement(By.id("hotel-add-flight-checkbox-hp-hotel")).click();
     driver.findElement(By.id("hotel-add-car-checkbox-hp-hotel")).click();
     driver.findElement(By.xpath("//*[@id='hotel-flight-origin-hp-hotel']")).sendKeys("IAD");
     WebDriverWait waits= new WebDriverWait(driver, 30);
     waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='aria-option-1']")));
     driver.findElement(By.xpath("//*[@id='aria-option-1']")).click();
     driver.findElement(By.id("packageDirectFlight-hp-hotel")).click();
     driver.findElement(By.xpath("//*[@id=\"gcw-hotel-form-hp-hotel\"]/div[7]/label/button")).click();
	 
		 
  }

  @DataProvider
  public String[][] dp() throws IOException {
	  ExcelReader e1=new ExcelReader();
   String fpath=System.getProperty("user.dir")+"\\src";
   
     return e1.readExcel(fpath, "Orbitz.xlsx", "Hotels");
   // };
  };
  @AfterMethod
  public void closeBrowser() {
	  driver.close();
	  
  }
}

//C:\Users\advit\eclipse-workspace\NaveenAutomation\src\Orbitz.xlsx