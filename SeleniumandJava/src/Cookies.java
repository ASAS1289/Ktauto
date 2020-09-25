import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cookies {

	/**
	 * @param args
	 * @throws Throwable
	 */
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		
		System.out.println("satrt");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		 driver.findElement(By.xpath("//*[@id='lang-chooser']")).click();
		 List<WebElement> elements = driver.findElements(By.xpath("//*[@class='OA0qNb ncFHed']/div"));
         int size=elements.size();
         System.out.println(size);
         String value= "";
         int i = 1;
         for(int j=1; j< elements.size(); j++)
         {
         if(driver.manage().getCookieNamed("gag") !=null)
        {
        	 value=driver.manage().getCookieNamed("gag").getValue();
        	 System.out.println(value);
         }
         
         if(value!="")
         {
        	 i=Integer.parseInt(value);
        	 i=i+1;
        	 driver.manage().deleteCookieNamed("gag");
        	 driver.manage().addCookie(new Cookie("gag", String.valueOf(i)));
        	 System.out.println(i);
         }
         else
        {
        	 driver.manage().addCookie(new Cookie("gag", String.valueOf(i)));
         }
         
         System.out.println(driver.findElement(By.xpath("//*[@id=\"lang-chooser\"]/div[1]/div[1]/div["+j+"]")));
         driver.findElement(By.xpath("//*[@class='OA0qNb ncFHed']/div["+j+"]")).click();
         Thread.sleep(4000);
         driver.navigate().back();
         Thread.sleep(4000);
         WebElement first=driver.findElement(By.xpath("//*[@id='lang-chooser']"));
         WebDriverWait wait= new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(first));
        first.click();
         }
	}

}
