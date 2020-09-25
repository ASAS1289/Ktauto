package testNgpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ObjectRep.ArtofTesting;

public class ArtofTestingOS {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://artoftesting.com/samplesiteForSelenium");
		Actions act=new Actions(driver);
		act.contextClick(ArtofTesting.rightClick(driver)).build().perform();
  }
}
