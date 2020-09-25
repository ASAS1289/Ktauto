package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ddotApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://test.primesource.com/DDOTPermitSystem/DDOTPermitOnline/Login.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement username=driver.findElement(By.id("txtUserName"));
		username.sendKeys("alexn");
		WebElement password=driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPassword"));
		password.sendKeys("sunny1");
		WebElement login=driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnLogin"));
		login.click();
		driver.quit();
	}

}
