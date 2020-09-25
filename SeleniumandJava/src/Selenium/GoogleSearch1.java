package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearch1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
			WebElement search=driver.findElement(By.xpath("//*[@name='q']"));
			search.sendKeys("Selenium");
			search.submit();
			List<WebElement> links=driver.findElements(By.xpath("//*[@id=\"hdtb-msb\"]//a"));
			int size=links.size();
			System.out.println(size);
			for(WebElement element:links)
			{
				String text=element.getText();
				System.out.println(text);
			}
			Thread.sleep(5000);
			WebElement shopping=driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[2]/a"));
			shopping.click();
			Thread.sleep(3000);
			WebElement shoppings=driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[4]"));
			String title=shoppings.getText();
			System.out.println(title);
			String exetitle="Shopping";
			if(title.equals(exetitle))
			{
				System.out.println("Test case is passed");
			}
			else
			{
				System.out.println("Test case is failed");
			}
			driver.navigate().back();
			Thread.sleep(3000);
			WebElement image=driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[3]/a"));
			image.click();
			Thread.sleep(3000);
			WebElement images=driver.findElement(By.xpath("//*[@id='yDmH0d']/div[2]/c-wiz/div[1]/div/div[1]/div[1]/div/div/span"));
			String title1=images.getText();
			System.out.println(title1);
			String exetitle1="Images";
			if(title1.equals(exetitle1))
			{
				System.out.println("Test case is passed");
			}
			else
			{
				System.out.println("Test case is failed");
			}
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"ow20\"]/a")).click();
			WebDriverWait wait= new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"lb\"]/div/a[2]"))).click();
	}

}
