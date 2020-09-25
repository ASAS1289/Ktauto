package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SalesforceSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	   
	      driver.get("https://developer.salesforce.com/signup");
	      driver.manage().window().maximize();
	      WebElement fname=driver.findElement(By.id("first_name"));
	      fname.sendKeys("Advithi");
	      WebElement lname=driver.findElement(By.id("last_name"));
	      lname.sendKeys("Chandra");
	      WebElement emailId=driver.findElement(By.id("email"));
	      emailId.sendKeys("vodnalas20@gmail.com");
	      WebElement role=driver.findElement(By.id("job_role"));
	      Select s= new Select(role);
	      s.selectByValue("Developer");
	      WebElement cname=driver.findElement(By.id("company"));
	      cname.sendKeys("atgtech");
	      WebElement countryname=driver.findElement(By.id("country"));
	      Select sc=new Select(countryname);
	      sc.selectByVisibleText("United States");
	      WebElement postalcode=driver.findElement(By.id("postal_code"));
	      postalcode.sendKeys("20152");
	      WebElement uname=driver.findElement(By.id("username"));
	      uname.sendKeys("advithi@atg.com");
	      WebElement checkbox=driver.findElement(By.id("eula"));
	      checkbox.click();
	      WebElement signupsubmit=driver.findElement(By.id("submit_btn"));
	      signupsubmit.click();
	      
	      
	      
	      
	}

}
