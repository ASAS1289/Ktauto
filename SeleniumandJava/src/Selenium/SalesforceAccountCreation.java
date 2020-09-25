package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SalesforceAccountCreation {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://login.salesforce.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	      WebElement username=driver.findElement(By.id("username"));
	      username.sendKeys("vodnalas@techsolutions.com");
	      WebElement password=driver.findElement(By.id("password"));
	      password.sendKeys("Krishna@2020");
	      WebElement login=driver.findElement(By.id("Login"));
	      login.click();
	      Thread.sleep(50000);
	      WebElement apps=driver.findElement(By.xpath("//*[@class='appLauncher slds-context-bar__icon-action']//button"));
	      apps.click();
	      WebElement service=driver.findElement(By.xpath("//*[@class='panel-content scrollable']//a"));
	    //*[@class='appLauncherMenu uiPanel--default uiPanel ryQAE")positioned south open active']/div//a
	     // 07p4R0000008XryQAE
	      service.click();
	      WebElement accounts=driver.findElement(By.xpath("//a[@title='Accounts']"));
	      accounts.click();
	      WebElement New=driver.findElement(By.xpath("//a[@title='New']"));
	      New.click();
	      
	    
	    
	      
	      
	      
	}

}
