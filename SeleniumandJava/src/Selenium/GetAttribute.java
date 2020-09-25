package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         driver.get("https://www.bing.com/");
         driver.manage().window().maximize();
       String TitlePro = driver.findElement(By.id("sb_form_q")).getAttribute("title");
         //driver.findElement(By.tagName("title")).getAttribute(arg0)
         System.out.println(" The information in the title attribute is: \n" + TitlePro);
         Thread.sleep(2500);
         
       Point pointer = driver.findElement(By.id("sb_form_q")).getLocation();
       
       int x = pointer.getX();
       int y = pointer.getY();
       
       System.out.println("x cordinate is " + x);
       System.out.println("Y cordinate is " + y);
       
       Thread.sleep(2500);
       
       Dimension dim =driver.findElement(By.id("sb_form_q")).getSize();
       int h = dim.getHeight();
       int w = dim.getWidth();
       
       System.out.println("Height of the dim is " + h);
       System.out.println("width of the dim is " + w);
         
         Thread.sleep(6500);
         driver.quit();
	}

}
