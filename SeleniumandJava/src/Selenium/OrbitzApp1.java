package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrbitzApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.orbitz.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      List<WebElement> Alllinks=driver.findElements(By.xpath("//*[@id=\"header-container\"]/div[2]/div[8]//a"));
     int size=Alllinks.size();
     System.out.println(size);
     
     String expectedfontsize="15px";
     
     for(WebElement values : Alllinks)
     {
    	 String linkName= values.getAttribute("href");
    	 String allvalues= values.getCssValue("font-size");
    	 if(allvalues.equals(expectedfontsize))
    	 {
    		 System.out.println("tag name" + linkName);
    		 System.out.println("Expected Font-Size" + expectedfontsize);
    		 System.out.println("Actual Font-Size" + allvalues);
    		 System.out.println("test case is Passed");
    	    		   	 }
    	 else
    	 {
    		 System.out.println("tag name" + linkName);
    		 System.out.println("Expected Font-Size" + expectedfontsize);
    		 System.out.println("Actual Font-Size" + allvalues);
    		 System.out.println("test case is failed");
     }
     }
      driver.quit();
	

}
}
