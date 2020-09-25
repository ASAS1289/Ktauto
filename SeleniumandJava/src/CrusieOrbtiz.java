import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CrusieOrbtiz {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orbitz.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement crusietab=driver.findElement(By.id("tab-cruise-tab-hp"));
		crusietab.click();
		WebElement value=driver.findElement(By.xpath("//*[@id='tab-cruise-tab-hp']/span[2]/span/span"));
		String val=value.getAttribute("class");
		System.out.println(val);
		if(val.equals("selected"))
		{
			System.out.println("Test case is Passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		Thread.sleep(5000);
		WebElement dropdown=driver.findElement(By.id("cruise-destination-hp-cruise"));
		dropdown.click();
		
		Select dis= new Select(dropdown);
		dis.selectByVisibleText("Bahamas");
		
		driver.findElement(By.id("cruise-start-date-hp-cruise")).click();
		//driver.findElement(By.xpath("//*[@id='cruise-start-date-wrapper-hp-cruise']/div/div/div[2]/table/tbody/tr[4]/td[4]/button")).click();
		Thread.sleep(5000);
	//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.(By.xpath("//*[@id='cruise-end-date-wrapper-hp-cruise']/div")));
		//*[@id="cruise-end-date-wrapper-hp-cruise"]/div
		List<WebElement> dates=driver.findElements(By.xpath("//*[@class='datepicker-cal-date']"));
		//*[@class='datepicker-cal-date']
		//*[@class='datepicker-cal-dates']//tr//td//button"
		//*[@id="cruise-start-date-wrapper-hp-cruise"]/div/div/div[2]/table/tbody/tr//button
		int size= dates.size();
		  System.out.println(size);
			  //for(int i=0; i<dates.size(); i++)
		  for(WebElement ele:dates)
					if(ele.getAttribute("data-day").equals("22"))
					{
						ele.click();
						break;
		  }
			
		driver.findElement(By.id("cruise-end-date-hp-cruise")).click();
		List<WebElement> date1=driver.findElements(By.xpath("//*[@class='datepicker-cal-date highlight']"));
		int size1=date1.size();
		System.out.println(size1);
		//List<WebElement> date1=driver.findElements(By.xpath("//*[@class='datepicker-cal-date']"));
		 for(WebElement ele:date1)
				if(ele.getAttribute("data-day").equals("29"))
				{
					ele.click();
					break;
	  }
		WebElement dropdown1= driver.findElement(By.id("cruise-adults-hp-cruise"));
		Select se=new Select(dropdown1);
		se.selectByVisibleText("2");
		
		WebElement childrendd=driver.findElement(By.id("cruise-children-hp-cruise"));
		Select cd= new Select(childrendd);
		cd.selectByVisibleText("2");
		Thread.sleep(4000);
		WebElement child1=driver.findElement(By.id("cruise-children-age-select-1-hp-cruise"));
		Select  ch= new Select(child1);
		ch.selectByValue("7");
		WebElement child2=driver.findElement(By.id("cruise-children-age-select-2-hp-cruise"));
		Select  chi= new Select(child2);
		chi.selectByValue("11");
		driver.findElement(By.xpath("//*[@id=\"gcw-cruises-form-hp-cruise\"]/div[3]/label/button")).submit();
		
		Thread.sleep(6000);
		driver.quit();
	}

}
