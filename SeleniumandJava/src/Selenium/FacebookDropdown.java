package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("lang-chooser")).click();
		driver.manage().window().maximize();
		//driver.findElement(By.id("lang-chooser")).click();
	// driver.findElement(By.id("//*[@id=\"lang-chooser\"]/div[1]/div[1]/div[3]")).click();
	
	List<WebElement> options=driver.findElements(By.id("month"));
	int size=options.size();
	System.out.println(size);
	//Boolean value=Option.isDisplayed();
	//Sy//stem.out.println(value);
	
	}
}
//*[@id="lang-chooser"]
