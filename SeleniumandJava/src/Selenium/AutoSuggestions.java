package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         driver.get("https://www.bing.com/");
         driver.manage().window().maximize();
         driver.findElement(By.id("sb_form_q")).sendKeys("Krishna");
         Thread.sleep(3500);
         
         List<WebElement> Autosugg = driver.findElements(By.xpath("//span[@class='sa_tm_text']"));
         System.out.println("Auto Suggestions for Krishna is :\n" + Autosugg.size());
         
         for(int i=0; i<Autosugg.size(); i++)
         {
        	 String values = Autosugg.get(i).getText();
        	 System.out.println("Autosuggestions are:" + values);
         }
         Thread.sleep(6500);
         driver.quit();
	}

}
