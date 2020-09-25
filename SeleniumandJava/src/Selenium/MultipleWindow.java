package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.orbitz.com/");
	    String homewin= driver.getWindowHandle();
	    System.out.println(homewin);
	    System.out.println(driver.getCurrentUrl());
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	    WebElement child= driver.findElement(By.id("EG-logo"));
	    child.click();
	    Thread.sleep(4000);
	     Set<String> allwindows= driver.getWindowHandles();
	    //// int count=allwindows.size();
	     //System.out.println(count);
	     for(String win:allwindows)
	     {
	    	 if(!homewin.equalsIgnoreCase(win))
	    	 {
	    		 driver.switchTo().window(win);
	    		System.out.println(driver.getTitle());
	    		
	    		WebElement child1= driver.findElement(By.xpath("//*[@id='menu-item-5622']/a"));
	    		child1.click();
	    	 
	     
	    		Set<String> allwindows1= driver.getWindowHandles();
	    		//int count1=allwindows1.size();
	    		//System.out.println(count1);
	    	 
	    		for(String win1:allwindows1)
	    		{
	    			if(!win.equalsIgnoreCase(win1))
	    				driver.switchTo().window(win1);
	    			
	    			System.out.println(driver.getCurrentUrl());
	    		}
	    	 }
	     }
	    		
	    		System.out.println(driver.getTitle());
	    	 	    
	     
	 Thread.sleep(4000);
	    driver.quit();
	}
}
