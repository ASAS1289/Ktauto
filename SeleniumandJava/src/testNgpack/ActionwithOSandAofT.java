package testNgpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ObjectRep.OverStock;

public class ActionwithOSandAofT {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.overstock.com/");
		Actions a=new Actions(driver);
		a.moveToElement(OverStock.bedBathlink(driver)).build().perform();
		driver.get("https://artoftesting.com/samplesiteForSelenium#Sample_Page");
		Actions a1=new Actions(driver);
		WebElement drop=driver.findElement(By.id("targetDiv"));
		WebElement drag=driver.findElement(By.id("sourceImage"));
		a1.dragAndDrop(drag, drop).build().perform();
  }
}
