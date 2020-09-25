package ObjectRep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ArtofTesting {
static WebElement element = null;
	
	public static WebElement doubleClick(WebDriver driver) {
		element=driver.findElement(By.id("dblClkBtn"));
		return element;
	}
	public static WebElement rightClick(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"ez-toc-container\"]/nav/ul/li[1]/a"));
		return element;
	}
	
}
