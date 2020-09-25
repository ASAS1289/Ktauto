package testNgpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testforedge {
  @Test
  public void f() {
	  System.setProperty("webdriver.edge.driver", "C://Program Files//msedgedriver.exe");
	  WebDriver driver= new EdgeDriver();
	  driver.get("https://www.newyorklife.com/");
  }
}
