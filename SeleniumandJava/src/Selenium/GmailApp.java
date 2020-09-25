package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
          WebDriver driver= new ChromeDriver();
          driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          
          WebElement help=driver.findElement(By.linkText("Help"));
          
          String texthelp=help.getText();
          Point lochelp= help.getLocation();
          //Rectangle(Point p, Dimension d) ;
         // Object rechelp=help.getRect(point p, dimension d)
          Dimension shelp=help.getSize();
          String taghelp=help.getTagName();
          Boolean help1= help.isDisplayed();
          Boolean help2=help.isEnabled();
          Boolean help3=help.isSelected();
          
          String color=help.getCssValue("color");
          System.out.println(color);
          String execolor="rgba(117, 117, 117, 1)";
          if(color.equals(execolor))
          {
              System.out.println(color);
              System.out.println(lochelp);
             // System.out.println(rechelp);
              System.out.println(shelp);
              System.out.println(taghelp);
              System.out.println(help1);
              System.out.println(help2);
              System.out.println(help3);

              System.out.println(texthelp);
              System.out.println(execolor);
              System.out.println("Test Case1 Passed");

          }
          else
          {
        	  System.out.println(color);
              System.out.println(execolor);
              System.out.println("Test Case1 Failed");
          }
          
          WebElement privacy=driver.findElement(By.linkText("Privacy"));
         String privacycolor=privacy.getCssValue("color");
         System.out.println(privacycolor);
         String exeprivacycolor="asnjfkllll";
         
         if(privacycolor.equals(exeprivacycolor))
         {
        	 System.out.println(privacycolor);
             System.out.println(exeprivacycolor);
             System.out.println("Test Case2 Failed");
         }
         else {
        	 System.out.println(privacycolor);
             System.out.println(exeprivacycolor);
             System.out.println("Test Case2 Failed");
         }
         WebElement Terms=driver.findElement(By.linkText("Terms"));
         String Termscolor=Terms.getCssValue("color");
         System.out.println(Termscolor);
         String exeTermscolor="asnjfkllll";
         
         if(privacycolor.equals(exeprivacycolor))
         {
        	 System.out.println(Termscolor);
             System.out.println(exeTermscolor);
             System.out.println("Test Case3 Failed");
         }
         else {
        	 System.out.println(Termscolor);
             System.out.println(exeTermscolor);
             System.out.println("Test Case3 Failed");
         }
          driver.quit();
	}

}
