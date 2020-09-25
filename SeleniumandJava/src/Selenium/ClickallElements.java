package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickallElements {
	
	
	 
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		 driver.findElement(By.xpath("//*[@id='lang-chooser']")).click();
         
         List<WebElement> elements = driver.findElements(By.xpath("//*[@class='OA0qNb ncFHed']/div"));
         int size=elements.size();
         System.out.println(size);
        // links= new String[size];
         for(int i=1;i<elements.size();i++)
         {
         //links[i] = elements.get(i).getText();
        	// System.out.println(driver.findElement(By.xpath("//*[@class='OA0qNb ncFHed']/div["+i+"]")));
        	WebElement text= driver.findElement(By.xpath("//*[@class='OA0qNb ncFHed']/div["+i+"]"));
        	text.click();
        	 System.out.println(text.getText());
        	 Thread.sleep(6000);
        	//WebElement label=driver.findElement(By.xpath("//*[@id='headingText']"));
        	//label.getText();
         //elements.get(i).click();
        Thread.sleep(5000);
         driver.navigate().refresh();
         Thread.sleep(3000);
         WebElement first=driver.findElement(By.xpath("//*[@id='lang-chooser']"));
         WebDriverWait wait= new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(first));
        first.click();
        
       // List<WebElement> element1 = driver.findElements(By.xpath("//*[@class='OA0qNb ncFHed']/div"));
        //WebDriverWait wait1= new WebDriverWait(driver, 30);
       // wait1.until(ExpectedConditions.visibilityOfAllElements(element1));
         //Thread.sleep(3000);
         }
         
         
         
	}
}
         