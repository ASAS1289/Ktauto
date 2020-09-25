package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Recording {

	public static void main(String[] args) throws InterruptedException, ATUTestRecorderException  {
		// TODO Auto-generated method stub
		/*
		 * ATUTestrecorder is used to capture videos
		 * we need to pass 3 paramters for that 
		 * 1/: video location
		 * 2": file name 
		 * 3: true: both video n audio or false: only video
		 */
		ATUTestRecorder rec= new ATUTestRecorder("C:\\Users\\advit\\Desktop\\Ktraining","RcordingScripts", false);
		rec.start();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get: used to open the application
		driver.get("https://www.bing.com/");
			
		driver.manage().window().maximize();
		
		//WebElement ddOption=driver.findElement(By.id("sushma"));
		Thread.sleep(6500);
		driver.quit();
		rec.stop();
	}

}
