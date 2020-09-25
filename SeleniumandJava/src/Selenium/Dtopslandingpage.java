package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dtopslandingpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
 WebDriver driver= new ChromeDriver();
 driver.get("https://test.primesource.com/DDOTPermitSystem/DDOTPermitOnline/Landing.aspx");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
 String acurl=driver.getCurrentUrl();
 System.out.println(acurl);
 String exeurl="https://test.primesource.com/DDOTPermitSystem/DDOTPermitOnline/Landing.aspx";
 
 if(acurl.equals(exeurl))
 {
	 System.out.println(acurl);

	 System.out.println("Test Case1 is Passed");
 }
 else
 {
	 System.out.println(acurl);
	 System.out.println("Test Case1 is Failed");


 }
 
 List<WebElement> tableleft= driver.findElements(By.xpath("//*[@align='left'][@style='color: rgb( 87, 87, 84 ); font-size: 20px;']"));
 int size=tableleft.size();
 //String value=tableleft.getCssValue("color");
 System.out.println(size);
 //Dimension size=tableleft.getSize();
// System.out.println(size);

 driver.quit();
	}

}
