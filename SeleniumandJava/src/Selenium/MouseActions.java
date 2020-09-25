package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.emirates.com/us/english/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@data-link='MANAGE']")).click();
		
		WebElement obj=driver.findElement(By.xpath("//a[@data-link='MANAGE:Before you fly']"));
		
		Actions mouse= new Actions(driver);
		
		mouse.moveToElement(obj).build().perform();
		Thread.sleep(2500);
		
		/* ihave identified on which object i want to perform mouserhover
		 * just created an object simply passit to the actions class movetoElement commands
		 */
		WebElement obj1=driver.findElement(By.xpath("//a[@data-link='MANAGE:Baggage']"));
		
		//Actions mouse1Actions = new Actions(driver);
		
		mouse.moveToElement(obj1).build().perform();
		
		Thread.sleep(6500);
		driver.quit();
	}
	}
