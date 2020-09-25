package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ProfilesUsingSalesforce {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
	ChromeOptions options= new ChromeOptions();
	options.addArguments("--user-data-dir1=C:\\Users\\advit\\AppData\\Local\\Google\\Chrome\\User Data\\");
	options.addArguments("--profile-directory=Profile 1");
	options.addArguments("--disable-notifications");
	options.addArguments("disable-infobar");
	
	DesiredCapabilities dc= new DesiredCapabilities();
	dc.setCapability(ChromeOptions.CAPABILITY, options);
	
    WebDriver driver = new ChromeDriver(dc);
    driver.get("https://www.gmail.com/");
    driver.manage().window().maximize();
    
}
}
