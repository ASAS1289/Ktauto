package Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("sushmav@techsolutions.com");
		driver.findElement(By.id("password")).sendKeys("Advithi@05");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[@class='label']")).click();
		
		driver.findElement(By.xpath("//span[@class='slds-align-middle']")).click();
		
WebElement frame1=driver.findElement(By.xpath("//*[@name='vfFrameId_1589762827820']"));
		
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("name_firstName")).sendKeys("Sushma");
		
		Set<String> win= driver.getWindowHandles();
		
		/*
		 * it will get all the instances which r launched in that program itself
		 * set is a collection API in java which is used to storw multiple vaLUES AT atime: will not accept duplicate values 
		 * list is also used for the same purpose : will accept duplicate values
		 * 
		 * various methods we have on set are:
		 * Iterator : place curosor at the starting position of the set 
		 * hasnext: which will verfu wther ther eia  next value in the set ot not: true or false  
		 * next: which will move the corsor to the next value
		 * 
		 */
		Iterator<String> iter = win.iterator();
		win.iterator().next();
		String firstIterator =iter.next();
		String SecondIterator=iter.next();
		
		driver.switchTo().window(SecondIterator);
		
        WebElement fr2=driver.findElement(By.id("searchFrame"));
		
		driver.switchTo().frame(fr2);
		
		driver.findElement(By.id("lksrch")).sendKeys("sushma");
		
		/*
		 * if we want to switch to previous window then ?? 
		 * close: will lose the browser instance in which the webdriver instance is there ... as of now or insrance is in 2nd window hence it will onl close 2nd window
		 * quit: it will close all he browser which r launched by thus webdriver instance 
		 * 99% OF THE CASES in order to handles this is the only way 
		 * 
		 */
//		driver.close(); 
		
		driver.switchTo().window(firstIterator);
		
//		driver.switchTo().defaultContent();
		
		Thread.sleep(6500);
		driver.quit(); //which will terminate the browser instance
	}

}
