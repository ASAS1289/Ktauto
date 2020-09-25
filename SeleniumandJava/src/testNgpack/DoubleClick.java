package testNgpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRep.ArtofTesting;

public class DoubleClick {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://artoftesting.com/samplesiteForSelenium");
		ArtofTesting.doubleClick(driver).click();
		try {
			//WebDriverWait wait=new WebDriverWait(driver,5);
			//wait.until(ExpectedConditions.alertIsPresent());
			//return true;
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		}
		catch(NoAlertPresentException e) {
	        System.out.println("No alert is present");
	    }
		Actions a=new Actions(driver);
		a.doubleClick(ArtofTesting.doubleClick(driver)).build().perform();
		String value=driver.switchTo().alert().getText();
		System.out.println(value);
		String exevalue="Hi! Art Of Testing, Here!";
		Assert.assertEquals(value, exevalue);
		
		
		
  }
}
