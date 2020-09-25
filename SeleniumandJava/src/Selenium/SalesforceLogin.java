package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SalesforceLogin {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://login.salesforce.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	      WebElement username=driver.findElement(By.id("username"));
	      username.sendKeys("vodnalas@techsolutions.com");
	      WebElement password=driver.findElement(By.id("password"));
	      password.sendKeys("Krishna@2020");
	      WebElement login=driver.findElement(By.id("Login"));
	      login.click();
	     // Thread.sleep(50000);
	      WebElement Users=driver.findElement(By.xpath("//div[@title='Users']/a"));
	    //*[@id='split-left']/div/div/div/ul/li[8]/div/a
	      Users.click();
	      WebElement Usersbutton=driver.findElement(By.xpath("//ul[@role='group']//li[8]//a"));
	    //*[@id='split-left']/div/div/div/ul/li[8]/ul/li[8]/div/a
	      Usersbutton.click();
	      WebElement iframe=driver.findElement(By.xpath("//iframe[@title='All Users ~ Salesforce - Developer Edition']"));
	    		  driver.switchTo().frame(iframe);
	      WebElement newUser=driver.findElement(By.xpath("//input[@value='New User']"));
	   
	      newUser.click();
	     
	      
	      for(int i=5; i<=10; i++)
	    	  
	      {
	    	  WebElement iframe1=driver.findElement(By.xpath("//iframe[@title='New User ~ Salesforce - Developer Edition']"));
			  driver.switchTo().frame(iframe1);
	      WebElement firstname=driver.findElement(By.id("name_firstName"));
	      firstname.sendKeys("RamChandras" + i);
	      WebElement lastname=driver.findElement(By.id("name_lastName"));
	      lastname.sendKeys("Chandrasr" + i);
	      WebElement alias=driver.findElement(By.id("Alias"));
	      alias.sendKeys("ChandraRamsr" + i);
	      WebElement email=driver.findElement(By.id("Email"));
	      email.sendKeys("Krishnatring" + i + "@atg.com");
	      WebElement newusername=driver.findElement(By.id("Username"));
	      newusername.sendKeys("Krishnatri" + i);
	      WebElement nickname=driver.findElement(By.id("CommunityNickname"));
	      nickname.sendKeys("testkrishnas" + i);
	      WebElement userlicense=driver.findElement(By.id("user_license_id"));
	      Select ul= new Select(userlicense);
	      ul.selectByVisibleText("Chatter Free");
	      WebElement profiles=driver.findElement(By.id("Profile"));
	      Select pr= new Select(profiles);
	      pr.selectByVisibleText("Chatter Free User");
	      WebElement savenew=driver.findElement(By.xpath("//*[@id='topButtonRow']/input[2]"));
	      savenew.click();
	      
	     
	     driver.navigate().refresh();
	      }
	    
	    
	      
	      
	      
	}

}
