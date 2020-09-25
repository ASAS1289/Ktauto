package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalElementsinTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("//table[@class='w3-table-all notranslate']/tbody"));
		List<WebElement> values = table.findElements(By.tagName("tr"));
		
		System.out.println("Total no of tags are: " + values.size());
		
		//<var>
		String beforeNumber ="//tr[";
		String Aftertag ="]/td[1]";
		String AfterDesc="]/td[2]";
		
		for(int i=2; i<values.size(); i++)
		{
			String XpTag= new StringBuilder().append(beforeNumber).append(i).append(Aftertag).toString();
			String TagName=driver.findElement(By.xpath(XpTag)).getText();
			System.out.println("The tag is : " + TagName);
			
			String XpDesc= new StringBuilder().append(beforeNumber).append(i).append(AfterDesc).toString();
			String DescName=driver.findElement(By.xpath(XpDesc)).getText();
			System.out.println("The Description is : " + DescName);
			
		}
		/*
		 * only number is changing apar from that everthins is 1 and the same right
		 * i will use java StringBuilder concept which will build my xpath
		 * complete xpat i am psplititng into 3 parts 
		 * 1: beforennumber
		 * 2: number 
		 * 3" after number
		 */
		
		Thread.sleep(6500);
		driver.quit();
	}

}
