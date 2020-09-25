package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatadrivenByexcel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get: used to open the application
		driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();
		
		Xls_Reader obj= new Xls_Reader("C:\\Users\\advit\\Documents\\data\\sushma1.xlsx");
		
		String p1=obj.getCellData("Sheet1", "uname", 2);
		String p2=obj.getCellData("Sheet1", "password", 2);
		
		System.out.println("date from excel is " + p1);
		System.out.println("date from excel is " + p2);
		int rowCount=obj.getRowCount("Sheet1");
		
		for(int i =2; i<=rowCount; i++)
		{
			String data=obj.getCellData("Sheet1", "uname", i);
			String data1=obj.getCellData("Sheet1", "password", i);
			System.out.println("data from the file is: " +data);
			System.out.println("data from the file is: " +data1);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(data);
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(data1);
			driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
			
			Thread.sleep(6000);
			driver.quit();
			
		}
	}

}
