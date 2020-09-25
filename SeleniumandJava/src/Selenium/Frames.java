package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
		
		/*
		 * 3 methods : 
		 * 1: index : if we know exactly frame number 
		 * 2: name or id : if the frame is having either name or id proeprty then we can pass it as astring
		 * 3: webElement: if the frame is having any other properties then we will create wbelemtn n we will ask webdriver to switch
		 * to that frame which has those properties
		 */
		WebElement frame1=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("draggable"));
		
		Thread.sleep(6500);
		driver.quit();
	}

}
