package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.amazon.com/");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
   search.clear();
   search.sendKeys("toysdepartmentsinthe");
   String value= search.getAttribute("value");
	 
		   
   int size=value.length();
   
   int maxsize=10;
   if(size <= maxsize)
   {
	   System.out.println(maxsize);
	   System.out.println(size);
	   System.out.println("Test case1 is passed");
   }
   else
   {
	   System.out.println(maxsize);
	   System.out.println(size);
	   System.out.println("Test case1 is Failed");
   }
   
   WebElement searchbutton=driver.findElement(By.className("nav-input"));
   searchbutton.click();
   String title=driver.getTitle();
   String exetitle="Amazon.com : toys";
   
   if(title.equals(exetitle))
	   
   {
	   System.out.println(title);
	   System.out.println(exetitle);
	   System.out.println("Test Case1 is Passed");

   }
   else {
   
   System.out.println(title);
   System.out.println(exetitle);
   System.out.println("Test Case1 is Falied");
   }
   driver.quit();
	}

}
