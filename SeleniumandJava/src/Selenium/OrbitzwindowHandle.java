package Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrbitzwindowHandle {
	public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.orbitz.com/");
    driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     WebElement expedia=driver.findElement(By.id("EG-logo"));
     expedia.click();
     Set<String> win= driver.getWindowHandles();
    int wins= win.size();
    System.out.println(wins);
     
     Iterator<String> iter = win.iterator();
		win.iterator().next();
		String firstWindow =iter.next();
		String SecondWindow=iter.next();
		//String thirdWindow=iter.next();
		//driver.switchTo().window(SecondWindow);
		 //WebElement expedia=driver.findElement(By.id("EG-logo"));
	     //expedia.click();
	     driver.switchTo().window(SecondWindow);
		WebElement carrers=driver.findElement(By.xpath("//*[@id='menu-item-5622']/a"));
		carrers.click();
		Thread.sleep(6000);
		 Set<String> win1= driver.getWindowHandles();
		    int wins1= win1.size();
		    System.out.println(wins1);
		     
		     Iterator<String> iter1 = win1.iterator();
				win1.iterator().next();
				String firstWindow1 =iter1.next();
				String SecondWindow1=iter1.next();
				String thirdWindow=iter1.next();
		//String thirdWindow=iter.next();
		driver.switchTo().window(thirdWindow);
		Thread.sleep(6000);
		WebElement jobsearch=driver.findElement(By.id("hero_keyword_search_3"));
		jobsearch.sendKeys("selenium");
		WebElement location=driver.findElement(By.id("hero_location_search_3"));
		location.sendKeys("Virginia");
		WebElement button=driver.findElement(By.xpath("//div[@class='box']/form/ul/li[3]/button"));
		button.click();
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(firstWindow1);
     driver.quit();
}
}
