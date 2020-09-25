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

public class OrbtizFunction {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.orbitz.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      WebElement entertext= driver.findElement(By.xpath("//*[@class='clear-btn-input gcw-storeable text gcw-destination gcw-required']"));
	     //WebElement dropdown1= driver.findElement(By.xpath("//*[@id=\"gcw-hotel-form-hp-hotel\"]/div[2]/div/div/div[2]"));
	        entertext.sendKeys("fl");
	       // WebElement box=driver.findElement(By.xpath("//*[@id='typeaheadDataPlain']"));
	      //*[@id="gcw-hotel-form-hp-hotel"]/div[2]/div/div/div[2]
	       // List<WebElement> listbox=driver.findElements(By.xpath("//*[@id='gcw-hotel-form-hp-hotel']/div[2]/div/div/div[2]//li//a"));
	       // WebElement dropdown= driver.findElement(By.xpath("//*[@id=\"gcw-hotel-form-hp-hotel\"]/div[2]/div/div/div[2]"));
	       // WebElement place=driver.findElement(By.xpath("//*[@id='aria-option-5']"));
	        WebDriverWait wait= new WebDriverWait(driver, 30);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='aria-option-1']")));
	        driver.findElement(By.xpath("//*[@id='aria-option-1']")).click();
	        driver.findElement(By.id("hotel-checkin-hp-hotel")).click();
	        driver.findElement(By.xpath("//*[@id='hotel-checkin-wrapper-hp-hotel']/div/div/div[2]/table/tbody/tr[2]/td[3]/button")).click();
	        Thread.sleep(4000);
	        driver.findElement(By.id("hotel-checkout-hp-hotel")).click();
	        driver.findElement(By.xpath("//*[@id='hotel-checkout-wrapper-hp-hotel']/div/div/div[2]/table/tbody/tr[3]/td[2]/button")).click();
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
	        //Thread.sleep(4000);
	       String url= driver.getCurrentUrl();
	       System.out.println(url);
	        String title=driver.getTitle();
	        System.out.println(title);
	        Thread.sleep(50000);
	        driver.quit();
			/*
			 * // Actions action= new Actions(driver); // action.keyDown(dropdown,
			 * Keys.DOWN); List<WebElement>
			 * listbox=driver.findElements(By.xpath("//*[@class='results-item']"));
			 * //WebElement
			 * box=driver.findElement(By.xpath("//*[@id='typeaheadDataPlain']"));
			 * //*[@class='results-item']
			 * //*[@id='gcw-hotel-form-hp-hotel']/div[2]/div/div/div[2]//li//strong
			 * //Actions action= new Actions(driver); // action.keyDown(box, Keys.DOWN); int
			 * size=listbox.size(); System.out.println(size);
			 * 
			 * for(WebElement ele:listbox) { String value=ele.getAttribute("data-value");
			 * System.out.println(value); }
			 */
	        
	}

}
