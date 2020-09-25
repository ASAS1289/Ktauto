package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookWindowHandle {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	    String homewin= driver.getWindowHandle();
	    System.out.println(homewin);
	    System.out.println(driver.getCurrentUrl());
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     WebElement title =driver.findElement(By.id("terms-link"));
	     title.click();
	      
	     Set<String> allwindows= driver.getWindowHandles();
	     String curl="https://www.facebook.com/legal/terms/update";
	    String curls="https://www.facebook.com/about/basics";
	     for(String win: allwindows)
	     {
	    	 	    	 
	    		if (driver.switchTo().window(win).getCurrentUrl().equals(curl))
	    		{
	    			String ptitle=driver.getCurrentUrl();
	    			
	    		 System.out.println(ptitle);
	    		 
	    		 WebElement basics=driver.findElement(By.xpath("//*[@id='content']/div/div/div[2]/div[1]/div[2]/a[2]"));
	    		 basics.click();
	    		 Set<String> allwindows1= driver.getWindowHandles();
	    		 for(String win1 : allwindows1)
	    		 {
	    			 if(driver.switchTo().window(win1).getCurrentUrl().equals(curls))
	    			 {
	    				 String ptitles=driver.getCurrentUrl();
	 	    			
	    	    		 System.out.println(ptitles);
	    			 }
	    		 }
	    		// driver.switchTo().window(curls);
	    		//WebElement fbproducts= driver.findElement(By.xpath("//*[@id='content']/div/div/div[2]/div[2]/div[1]/div/a[1]"));   
	    		// fbproducts.click();          
	    		// String fbtproductlinks = driver.getCurrentUrl(); 
	    		// System.out.println(fbtproductlinks);
	    	     System.out.println(driver.getCurrentUrl());
	    	 }
	    	 
	    	 
	     }
	     Thread.sleep(6500);
	     driver.quit();
	}

}
