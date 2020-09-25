package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		WebElement frame1=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame1);
		
		Thread.sleep(2500);
		
		/* 
		 * we can perfom these operations using actions class 
		 * drag n drop : if we know both source n dest then we will use 
		 * drag n drop by : if we know only source then we will use 
		 * build : 2 diff actions: into 1 action
		 * perform : will perform the operations 
		 * 
		 * whenever we r using actions aclass its mandatry for us to add .build().perform();
		*/
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions drag = new Actions(driver);
		
		drag.dragAndDrop(source, target).build().perform();
		
		Thread.sleep(6500);
		driver.quit();
	}

}
