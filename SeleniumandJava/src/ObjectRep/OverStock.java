package ObjectRep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverStock {
static WebElement element = null;
	
	public static WebElement bedBathlink(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id='TopNav']/div[1]/div[4]/a"));
		return element;
	}
	public static WebElement pswd1(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@type='password']"));
		return element;
		
}
}
