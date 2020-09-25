package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreecrmApp {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://freecrm.com/");
     driver.manage().window().maximize();
    driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
    driver.findElement(By.name("email")).sendKeys("studentuser2020@gmail.com");
    driver.findElement(By.name("password")).sendKeys("nevergiveup2020");
    driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
    Thread.sleep(3500);
    driver.quit();
	}

}
