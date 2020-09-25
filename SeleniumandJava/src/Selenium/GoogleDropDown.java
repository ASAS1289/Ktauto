package Selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class GoogleDropDown {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3Dgoogle%26rlz%3D1C1SQJL_enUS889US889%26oq%3Dgo%26aqs%3Dchrome.1.69i57j0l7.2294j0j4%26sourceid%3Dchrome%26ie%3DUTF-8&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//driver.findElement(By.id("lang-chooser")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         driver.findElement(By.xpath("//*[@id='lang-chooser']")).click();
        List<WebElement> list= driver.findElements(By.xpath("//*[@id='lang-chooser']/div[2]//span"));
        Thread.sleep(3000);
       int a= list.size();
       System.out.println(a);
       for(int i=0; i<list.size(); i++)
       {
    	   System.out.println(list.get(i).getText());
    	  if(list.get(i).getText().contains("‪తెలుగు"))
    	   {
    	   list.get(i).click();
    	   //driver.navigate().back();
    	  break;
    	   
       
    	   }
       }
       Thread.sleep(4500);
       driver.quit();
	}
}


