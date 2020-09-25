package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlters {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\advit\\Desktop\\Ktraining\\SeleniumFiles\\ProgramingFiles\\unexpectedalertcode.html");
		driver.manage().window().maximize();
		Thread.sleep(6500);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*
		 * a.gettext: which will get text from the alrey
		 * a.accept: ok 
		 * a.dismiss: cancel 
		 * a.sendKeys: text field 
		 */
		  Alert alerts=driver.switchTo().alert();
		  String value=alerts.getText();
		  System.out.println("Alert message is: " + value);
		  alerts.accept();
		  driver.findElement(By.name("fname")).sendKeys("sushma");
		  Thread.sleep(6500);
		  driver.quit();
	}

}
