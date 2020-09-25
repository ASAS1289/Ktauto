package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontitle {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3500);
		String expected="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		if(title.equals(expected))
		{
			System.out.println("Testcase is passed");
		}
		else
		{
			System.out.println("Testcase is failed");

		}
		
		String actual=driver.getCurrentUrl();
		String expected1="https://www.amazon.com/";
		System.out.println(actual);
		
		if(actual.equals(expected1))
		{
			System.out.println(actual);
			System.out.println("Testcase is passed");

		}
		else {
			System.out.println("Testcase is failed");

		}
		
		String acpagesource=driver.getPageSource();
		String expected2="http://www.amazon.com";
		//System.out.println(acpagesource);
		
		if(acpagesource.equals(expected2))
		{
			System.out.println(acpagesource);
			System.out.println("Testcase is passed");

		}
		else {
			System.out.println("Testcase is failed");

		}
		
		driver.quit();
	}

}
