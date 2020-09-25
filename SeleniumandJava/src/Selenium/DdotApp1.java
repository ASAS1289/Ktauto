package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DdotApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://test.primesource.com/DDOTPermitSystem/DDOTPermitOnline/Login.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement home=driver.findElement(By.xpath("//*[@id=\'ctl00_mnOPA\']/ul/li[1]/a/span"));
		String Homebtext=home.getText();
		System.out.println(Homebtext);
		String fshome=home.getCssValue("font-size");
		System.out.println(fshome);
		String ffhome=home.getCssValue("font-family");
		System.out.println(ffhome);
		WebElement userName=driver.findElement(By.id("txtUserName"));
		String fsuserName=userName.getCssValue("font-size");
		System.out.println(fsuserName);
		String ffuserName=userName.getCssValue("font-family");
		System.out.println(ffuserName);
		String lheighthome=userName.getCssValue("line-height");
		System.out.println(lheighthome);
		WebElement textdisplay=driver.findElement(By.xpath("//*[@align='center'][@class='caption']"));
		String textdis=textdisplay.getText();
		System.out.println(textdis);
		 WebElement image=driver.findElement(By.id("ctl00_imgTOPSIcon"));
		 Boolean image1=image.isDisplayed();
		 Dimension image2=image.getSize();
			System.out.println(image1);

			System.out.println(image2);
			WebElement images=driver.findElement(By.id("ctl00_Image1"));
			 Boolean images1=images.isDisplayed();
			 Dimension images2=images.getSize();
				System.out.println(images1);

				System.out.println(images2);
		
		//List<WebElement> tabletags=driver.findElements(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_tblLoginParent\"]//a"));
		//int size=tabletags.size();
		//System.out.println(size);
		
		driver.quit();
		
	}

}
