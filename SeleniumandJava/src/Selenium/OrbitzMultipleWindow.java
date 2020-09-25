package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrbitzMultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.orbitz.com/");
	    String homewin= driver.getWindowHandle();
	    System.out.println(homewin);
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//*[@id=\"rewardsHeader\"]/a")).click();
	     
	     String title=driver.getTitle();
	     System.out.println(title);
	     String title1="Orbitz";
	     Set<String> allwindows= driver.getWindowHandles();
	     for(String win: allwindows)
	     {
	    	 if(title1.equals("Orbitz"))
	    	 {
	    		 driver.switchTo().window(win);
	    		 System.out.println(driver.getCurrentUrl());
	    	 }
	    	 driver.getCurrentUrl();
	    	 driver.switchTo().window(homewin);
	    	 System.out.println(driver.getCurrentUrl());
	    	 
	     }
	     driver.quit();
	}

}
