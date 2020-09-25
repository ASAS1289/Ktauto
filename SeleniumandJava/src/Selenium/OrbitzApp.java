package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrbitzApp {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.orbitz.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     try {
     WebElement hotellink=driver.findElement(By.xpath("//*[@id='primary-header-hotel1']"));
   
      hotellink.click();
      String Currenturl=driver.getCurrentUrl();
      System.out.println(Currenturl);
     
     String achotellink= driver.getTitle();
     
     String expectedhoteltitle="Hotels: Book Cheap Hotels, Deals & Discounts | Orbitz";
     
     if(achotellink.equals(expectedhoteltitle))
     { 
     System.out.println(expectedhoteltitle);
     System.out.println(achotellink);
     System.out.println("test case1 is passed");
     }
     else {
         System.out.println("test case is failed");
 
     }
     
     }
     catch (Exception e){
    	 System.out.println(e);
     }
     driver.navigate().back();
     //Thread.sleep(100000);
     //driver.navigate().refresh();
     WebElement hotellink1=driver.findElement(By.xpath("//*[@id='primary-header-hotel']"));
     String fontsizehotel=hotellink1.getCssValue("font-size");
     String displayedText=hotellink1.getText();
     System.out.println(displayedText);
     String expectedhotelfsize="15px";
     
     if(fontsizehotel.equals(expectedhotelfsize))
     {
     System.out.println(fontsizehotel);
     System.out.println(expectedhotelfsize);
     System.out.println("test case2 is passed");

     }
     else {
         System.out.println("test case2 is failed");

     }
     String ffhotel=hotellink1.getCssValue("font-family");
     
     String exeffhotel="absdfhjgk";  //"Helvetica Neue", Arial, "Lucida Grande", sans-serif
    
     if(ffhotel.equals(exeffhotel))
     {
    	 System.out.println(ffhotel);
         System.out.println(exeffhotel);
         System.out.println("test case3 is passed");

     }
     else {
    	 System.out.println(ffhotel);
         System.out.println(exeffhotel);
         System.out.println("test case3 is failed");

     }
    	 
    	 String exehotelText="Hotels"; 
    	 		if(displayedText.equals(exehotelText))
    	 		{
    	 			System.out.println(displayedText);
    	 			System.out.println("Test Case4 is Passed");
    	 		}
    	 		else
    	 		{
    	 			System.out.println(displayedText);
    	 			System.out.println("Test Case4 is Failed");
    	 		}
    	 
    	 
    	 
     driver.quit();
	}

}
