package Selenium;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieDeleteFreecrmApp {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://freecrm.com/");
     driver.manage().window().maximize();
    driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
    driver.findElement(By.name("email")).sendKeys("studentuser2020@gmail.com");
    driver.findElement(By.name("password")).sendKeys("nevergiveup2020");
    driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
    Thread.sleep(3500);
 // create file named Cookies to store Login Information		
    File file = new File("Cookies.data");							
    try		
    {	  
        // Delete old file if exists
		file.delete();		
        file.createNewFile();			
        FileWriter fileWrite = new FileWriter(file);							
        BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
        // loop for getting the cookie information 		
        	
        // loop for getting the cookie information 		
        for(Cookie ck : driver.manage().getCookies())							
        {			
            Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
            Bwrite.newLine();             
        }			
        Bwrite.close();			
        fileWrite.close();	
        
    }
    catch(Exception ex)					
    {		
        ex.printStackTrace();			
    }		
    driver.quit();
	}

}
