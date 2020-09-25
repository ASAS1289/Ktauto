package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TooltipGetAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip");
		driver.manage().window().maximize();
		
		WebElement frame1 =driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame1);
		Thread.sleep(2500);
		
		String tooltip = driver.findElement(By.id("age")).getAttribute("title");
		System.out.println("Message in the title is : " + tooltip);
		
		Thread.sleep(6500);
		driver.quit();
	
		
	}

}
