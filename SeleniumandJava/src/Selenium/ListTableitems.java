package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListTableitems {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("//table[@class='w3-table-all notranslate']/tbody"));
		List<WebElement> values = table.findElements(By.tagName("tr"));
		
		System.out.println("Total no of tags are: " + values.size());
		
		String UserName="<var>";
		String BeforeNumber="//tr[";
		String AfterTag="]/td[1]";
		
		for(int i =2; i<values.size(); i++)
		{
			String XpName= new StringBuilder().append(BeforeNumber).append(i).append(AfterTag).toString();
			String TagName=driver.findElement(By.xpath(XpName)).getText();
			//System.out.println("List out:" + TagName);
			
			if(TagName.equals(UserName)) {
				
				System.out.println("Record Matched ");
				break;
			}
		}
		
		Thread.sleep(6500);
		driver.quit();
	}

}
