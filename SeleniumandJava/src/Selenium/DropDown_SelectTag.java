package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_SelectTag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.orbitz.com/");
		driver.get("https://www.orbitz.com/Flights");
		Thread.sleep(3500);
		//WebElement DDOptions=driver.findElement(By.id("hotel-rooms-hp-hotel"));
		WebElement DDOption=driver.findElement(By.id("flight-adults-flp"));
		//DDOptions.isSelected();
		Select s= new Select(DDOption);
		s.selectByVisibleText("4");
	}

}
