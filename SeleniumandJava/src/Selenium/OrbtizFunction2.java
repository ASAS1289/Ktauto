package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrbtizFunction2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orbitz.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement entertext = driver
				.findElement(By.xpath("//*[@class='clear-btn-input gcw-storeable text gcw-destination gcw-required']"));

		entertext.sendKeys("fl");
		Thread.sleep(4000);
		////WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("// *[@id='typeaheadDataPlain']/div")));
		List<WebElement> list=driver.findElements(By.xpath("// *[@id='typeaheadDataPlain']/div/li/a"));
		int size=list.size();
		System.out.println(size);
		for(int i=0; i<list.size(); i++)
			if(list.get(i).getAttribute("data-value").equals("Florida"))
			{
				list.get(i).click();
				break;
		
			}
		driver.findElement(By.id("hotel-checkin-hp-hotel")).click();
		List<WebElement> dates=driver.findElements(By.xpath("//*[@class='datepicker-cal-date']"));
		int sizes= dates.size();
		  System.out.println(sizes);
			  //for(int i=0; i<dates.size(); i++)
		  for(WebElement ele:dates)
					if(ele.getAttribute("data-day").equals("22"))
					{
						ele.click();
						break;
		  }
        //driver.findElement(By.xpath("//*[@id='hotel-checkin-wrapper-hp-hotel']/div/div/div[2]/table/tbody/tr[3]/td[6]/button")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("hotel-checkout-hp-hotel")).click();
        List<WebElement> date1=driver.findElements(By.xpath("//*[@class='datepicker-cal-date']"));
		int size1= dates.size();
		  System.out.println(size1);
			  //for(int i=0; i<dates.size(); i++)
		  for(WebElement ele:date1)
					if(ele.getAttribute("data-day").equals("29"))
					{
						ele.click();
						break;
		  }
       // driver.findElement(By.xpath("//*[@id='hotel-checkout-wrapper-hp-hotel']/div/div/div[2]/table/tbody/tr[4]/td[4]/button")).click();
        WebElement Room=driver.findElement(By.id("hotel-rooms-hp-hotel"));
        Room.click();
        Select s= new Select(Room);
        s.selectByVisibleText("1");
        WebElement dAdult= driver.findElement(By.id("hotel-1-adults-hp-hotel"));
        dAdult.click();
        Select sel= new Select(dAdult);
        sel.selectByValue("2");
        WebElement children= driver.findElement(By.id("hotel-1-children-hp-hotel"));
        children.click();
        Select sele=new Select(children);
        sele.selectByIndex(2);
        Thread.sleep(4000);
        WebElement age=driver.findElement(By.id("hotel-1-age-select-1-hp-hotel"));
        age.click();
        Select selec= new Select(age);
        selec.selectByValue("8");
        WebElement cage=driver.findElement(By.id("hotel-1-age-select-2-hp-hotel"));
        cage.click();
        Select select=new Select(cage);
        select.selectByValue("11");
        driver.findElement(By.id("hotel-add-flight-checkbox-hp-hotel")).click();
        driver.findElement(By.id("hotel-add-car-checkbox-hp-hotel")).click();
        driver.findElement(By.xpath("//*[@id='hotel-flight-origin-hp-hotel']")).sendKeys("IAD");
        WebDriverWait waits= new WebDriverWait(driver, 30);
        waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='aria-option-1']")));
        driver.findElement(By.xpath("//*[@id='aria-option-1']")).click();
        driver.findElement(By.id("packageDirectFlight-hp-hotel")).click();
        driver.findElement(By.xpath("//*[@id=\"gcw-hotel-form-hp-hotel\"]/div[7]/label/button")).click();
        Thread.sleep(8000);
       String url= driver.getCurrentUrl();
       System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);
		Thread.sleep(4500);
		
		 driver.quit(); 
		 
	}

}
