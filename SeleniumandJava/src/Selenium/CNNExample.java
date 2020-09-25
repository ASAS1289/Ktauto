package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CNNExample {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cnn.com/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3500);
		String expected="CNN - Breaking News, Latest News and Videos";
		
		if(title.equals(expected))
		{
			System.out.println("Testcase is passed");
		}
		else
		{
			System.out.println("Testcase is failed");

		}
		
		driver.quit();
	}



	}


