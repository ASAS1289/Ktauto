package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IndeedExample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.indeed.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.id("text-input-where")).click();
		WebElement what=driver.findElement(By.id("text-input-what"));
		WebElement where=driver.findElement(By.id("text-input-where-helpText"));
		String text1=where.getText();
		System.out.println(text1);
		Boolean value=what.isDisplayed();
		System.out.println(value);
		Boolean y=what.isSelected();
		System.out.println(y);
		String text=what.getText();
		System.out.println(text);
		//Boolean value1=true;
		//Assert.assertEquals(value, value1);
		String images=what.getCssValue("background-image");
		System.out.println(images);
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		String script="return document.getElementById('text-input-where').placeholder;";
		String text3=(String) js.executeScript(script);
		 System.out.println(text3);
		 driver.quit();
}
}