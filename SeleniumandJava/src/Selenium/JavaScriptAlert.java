package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("https://javascript.info/alert-prompt-confirm#confirm");
	   driver.manage().window().maximize();
	   WebElement button=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/main/div[1]/article/div[2]/div[7]/div/div[1]/div[1]/a"));
	   button.click();
	   Alert palert=driver.switchTo().alert();
	   palert.dismiss();
	  String text= palert.getText();
	  System.out.println(text);
	  
	  Thread.sleep(4500);
	  palert.accept();
	  driver.quit();
	}

}
