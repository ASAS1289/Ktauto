package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.bing.com/account/general?ru=");
     driver.manage().window().maximize();
     
     boolean StatusRadioButton = driver.findElement(By.id("adlt_set_strict")).isSelected();
     
     if(StatusRadioButton)
     {
    	 System.out.println("The Radio button is selected");
     }
     else
     {
    	 driver.findElement(By.id("adlt_set_strict")).click();
    	 System.out.println("We clicked on the Radio button");
     }
     Thread.sleep(6500);
     driver.quit();
     
	}

}
