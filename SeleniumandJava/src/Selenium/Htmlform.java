package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmlform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.w3schools.com/html/html_forms.asp");
		 WebElement fName=driver.findElement(By.id("fname"));
		 fName.clear();
		  fName.sendKeys("David");
		  WebElement lName=driver.findElement(By.id("lname"));
		  lName.clear();
		  lName.sendKeys("Paul");
		 WebElement submit1= driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/form/input[3]"));
		 submit1.submit();;
	}

}
