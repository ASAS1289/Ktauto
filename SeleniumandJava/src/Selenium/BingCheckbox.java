package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bing.com/account/general?ru=");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("adlt_set_strict")).click();
		
		Thread.sleep(1500);
		//driver.switchTo().frame(0);
		//driver.findElement(By.id("enAS")).click();
		
		boolean StatusCheckBox = driver.findElement(By.id("enAS")).isSelected();
		
		if(StatusCheckBox)
		{
			System.out.println("checkbox is already in checked mode");
		}
		else
		{
			driver.findElement(By.id("enAS")).click();
			System.out.println("We checked this Checkbox");
		}
		Thread.sleep(6500);
		driver.quit();
	}

}
