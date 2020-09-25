package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.xpath("//*[@name='q']"));
		search.sendKeys("Selenium");
		search.submit();
		List<WebElement> tagname=driver.findElements(By.xpath("//*[@class='r']/a"));
		int size=tagname.size();
		System.out.println(size);
		for(WebElement link:tagname)
		{
			boolean value=link.getAttribute("href").contains("selenium");
			if(value==true)
			{
				String val=link.getText();
				System.out.println(val);
			}
			//System.out.println(value);
			//if(value.contains("selenium"))
			//{
			//	String texts=link.getText();
			//	System.out.println(texts)
			//}
			//*[@id="hdtb-msb"]//a
			
		}
	}

}
