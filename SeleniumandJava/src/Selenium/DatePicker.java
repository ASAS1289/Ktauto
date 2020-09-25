package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		WebElement frame1=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frame1);
		
		Thread.sleep(2500);
		

		/* if some object int he browser is staring with tagname as "a" 
		 * i can use linktext in webdriver to identify thatr obect
		 */
		//boolean dateWidget = driver.findElement(By.id("datepicker")).isSelected();
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //may
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  //june
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  //julu
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  //August
		
		//driver.findElement(By.linkText("20")).click();
		
		WebElement dateWidget = driver.findElement(By.xpath("//tr[3]"));
		List<WebElement> columns=dateWidget.findElements(By.tagName("td"));

		for (WebElement cell: columns){
		   //Select 13th Date 
		   if (cell.getText().equals("17")){
		      cell.findElement(By.linkText("17")).click();
		      break;
		 }
		}
		Thread.sleep(6500);
		
		driver.quit();
		
	}

	

}
	
