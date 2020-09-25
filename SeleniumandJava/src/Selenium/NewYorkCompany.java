package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewYorkCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.nyandcompany.com/");
		String acTitle=driver.getTitle();
		System.out.println(acTitle);
		String exeTitle="Women's Clothes & Accessories | Shop at New York & Company";
		if(acTitle.equals(exeTitle))
		{
			System.out.println("Test Case1 is Passed for Title" + acTitle);
		}
		else
		{
			System.out.println("Test Case1 is Failed for Title" + acTitle);
			
		}
		
		WebElement menuEva=driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[1]/li/a"));
		boolean value=menuEva.isDisplayed();
		System.out.println(value);
		
		if(value==true)
		{
			System.out.println("Test Case is Passed for isdisplayed : " + value);
		}
		else
		{
			System.out.println("Test Case is Failed for isdisplayed : " + value);
		}
		
		menuEva.click();
		String titleEva=driver.getTitle();
		System.out.println(titleEva);
		String exetitleEva="Eva Mendes Collection | Dresses, Tops & More | NY&C";
		
		if(titleEva.equals(exetitleEva))
		{
			System.out.println("Test Case is Passed for Title : " + titleEva);
		}
		else
		{
			System.out.println("Test Case is Failed for Title : " + titleEva);
		}
		
		driver.quit();
	}

}
