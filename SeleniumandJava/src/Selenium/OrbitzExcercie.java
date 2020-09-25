package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrbitzExcercie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.orbitz.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      WebElement hotel=driver.findElement(By.xpath("//*[@id='tab-hotel-tab-hp']/span[2]/span/span"));
	      System.out.println(hotel);
	      WebElement vacation=driver.findElement(By.xpath("//*[@id=\"tab-package-tab-hp\"]/span[1]"));
	      List<WebElement> Text=driver.findElements(By.xpath("//*[@class='tab ']"));
	      int num=Text.size();
	      System.out.println(num);
	      
	      Boolean value=hotel.isSelected();
	      Boolean value1=hotel.isEnabled();
	      System.out.println(value);
	      System.out.println(value1);
	      Boolean vac=vacation.isSelected();
	      Boolean vac1=vacation.isEnabled();
	      System.out.println(vac);
	      System.out.println(vac1);
	     String attr= hotel.getAttribute("class");
	     System.out.println(attr);
         if(attr.contains("selected"))
    		 {
        	 System.out.println("WebElement selected");
    		 }
        	    else
        	    {
        	        System.out.println("WebElement NOT selected");
    		 
        	    }
         for(WebElement texts  : Text)
         {
        	String tabsname= texts.getText();
        	String font=texts.getCssValue("font-family");
        	System.out.println("Tabs names are: " + tabsname);
        	System.out.println("Tabs font family is : " + font);
        	 
         }
        WebElement entertext= driver.findElement(By.xpath("//*[@class='clear-btn-input gcw-storeable text gcw-destination gcw-required']"));
        entertext.sendKeys("the hotel name");
       String hoteltext=entertext.getText();
       System.out.println(hoteltext);
       String hoteltext1=entertext.getAttribute("placeholder");
       System.out.println(hoteltext1);
       String val=entertext.getAttribute("value");
       System.out.println(val);
       String excetext="Destination, hotel name, airport, train station, landmark, or address";
       if(hoteltext1.equals(excetext))
       {
    	   System.out.println("The Test Case1 is passed");
       }
       else {
    	   System.out.println("The Test Case1 is Failed");
    	   
       }
       List<WebElement> tablabelicon=driver.findElements(By.xpath("//*[@class='tab-label']/span"));
       for(WebElement icondisplayed:tablabelicon)
       {
    	  String iconval= icondisplayed.getAttribute("class");
    	  System.out.println("The value is: " + iconval);
       }
       List<WebElement> label=driver.findElements(By.xpath("//*[@id='gcw-hotel-form-hp-hotel']//div/label/span[1]"));
       for(WebElement labels:label)
       {
       String labeltext=labels.getText();
       System.out.println(labeltext);
         
       }
       driver.quit();
	}

}
