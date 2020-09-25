package ObjectRep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CrmLoginPage {
	static WebElement element = null;
	
	public static WebElement email1(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@type='text']"));
		return element;
	}
	public static WebElement pswd1(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@type='password']"));
		return element;
		
	}
public static WebElement submitbt(WebDriver driver) {
	element=driver.findElement(By.cssSelector("div.ui.fluid.large.blue.submit.button"));
	return element;
}
}
