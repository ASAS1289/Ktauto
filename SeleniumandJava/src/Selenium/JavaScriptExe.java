package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.indeed.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement what=driver.findElement(By.id("text-input-what-helpText"));
		
		//String text=what.getText();
		//
		//System.out.println(text);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script="return document.getElementById('text-input-what').placeholder;";
		//System.out.println(script);
		String text=(String) js.executeScript(script);
		System.out.println(text);
		driver.quit();

	}

}
