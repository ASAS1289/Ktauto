package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforcePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
      WebDriver driver = new ChromeDriver();
     // driver.quit();
      driver.get("https://developer.salesforce.com/signup?d=70130000000td6N");
      driver.manage().window().maximize();
      
      WebElement Roleid = driver.findElement(By.id("job_role"));
      
      List<WebElement> DDOptions = Roleid.findElements(By.tagName("option"));
      
      for(int i =0; i<DDOptions.size(); i++)
      {
    	  String values = DDOptions.get(i).getText();
    	  System.out.println(values);
      }
      WebElement Country = driver.findElement(By.id("country"));
      List<WebElement> option = Country.findElements(By.tagName("option"));
      
      for(int k=0; k<option.size(); k++)
      {
    	  String ddown = option.get(k).getText();
    	  System.out.println(ddown);
      }
      Thread.sleep(6500);
      driver.quit();
     // Select s = new Select(DDOptions);
      
      //Thread.sleep(6500);
      
     // driver.findElement(By.linkText("Sign Up")).click();
     // driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
      
     // Thread.sleep(6500);
      //driver.switchTo().window();
      
     // driver.quit();
	}

}
