package Selenium;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GoogleDropDownClickallLinks {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		//driver.findElement(By.id("lang-chooser")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         driver.findElement(By.xpath("//*[@id='lang-chooser']")).click();
      //  List<WebElement> list= driver.findElements(By.xpath("//*[@id='lang-chooser']/div[2]//span"));
        Thread.sleep(3000);
      // int a= list.size();
       //System.out.println(a);
      
       List<WebElement> list1= driver.findElements(By.xpath("//*[@id='lang-chooser']/div[2]/div/span"));
       int b= list1.size();
       System.out.println(b);
      // Cookie count=
       //driver.manage().addCookie(count);
       for(int i=0; i<list1.size(); i++)
       {
    	   list1.get(i).click();
    	   System.out.println(list1.get(i).getText());
    	  // Actions action= new Actions(driver);
       	  // action.moveToElement(list1.get(i)).build().perform();
    	   driver.navigate().refresh();
    	   
    	  Thread.sleep(3000);
       
       
    	   driver.findElement(By.xpath("//*[@id='lang-chooser']")).click();
    	   List<WebElement> list2= driver.findElements(By.xpath("//*[@id='lang-chooser']/div[2]/div/span"));
    	   //WebDriverWait wait= new WebDriverWait();
       
       }
      
      
       Thread.sleep(6000);
       driver.quit();
	}

	

	
}


