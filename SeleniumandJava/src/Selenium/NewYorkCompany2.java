package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewYorkCompany2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.nyandcompany.com/");
		WebElement loginlink=driver.findElement(By.xpath("/html/body/header/nav[1]/div[1]/div/div/div[1]/ul/li[1]/a"));
		Point loginloc=loginlink.getLocation();
		int xcor=loginloc.getX();
		System.out.println(xcor);
		int ycor=loginloc.getY();
		System.out.println(ycor);

		System.out.println(loginloc);
		//boolean exelogin= true;
		if(xcor==16)
		{
			System.out.println("Test case is Passed " + xcor);
		}
		else
		{
			System.out.println("Test case is Failed  " + xcor);
		}
		
		WebElement myWishlist=driver.findElement(By.id("myWishList"));
		String font=myWishlist.getCssValue("font-size");
		String exefont="10px";
		if(font.equals(exefont))
		{
			System.out.println("Test Case is Passed :" + font);
		}
		else
		{
			System.out.println("Test Case is Failed :" + exefont);
		}
		
		WebElement footertext=driver.findElement(By.xpath("/html/body/footer/div[2]/div/div[3]/div[1]/p"));
		String ftext=footertext.getText();
		System.out.println(ftext);
		String exeftext="IF YOU ARE USING A SCREEN READER AND ARE HAVING PROBLEMS USING THIS WEBSITE, PLEASE CALL 1-800-961-9906 FOR ASSISTANCE.";
		
		if(ftext.equals(exeftext))
		{
			System.out.println("Test case for footer text is Passed");
		}
		else
		{
			System.out.println("Test case for footer text is Failed");
		}
		driver.quit();
		
	}

}
