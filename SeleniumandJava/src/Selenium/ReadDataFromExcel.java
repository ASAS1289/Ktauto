package Selenium;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;





public class ReadDataFromExcel {

	public static void main(String[] args) throws InterruptedException {
		
		
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//get: used to open the application
		//driver.get("https://www.bing.com/");
		
		
		//driver.manage().window().maximize();
		
      Xls_Reader obj= new Xls_Reader("C:\\Users\\advit\\Documents\\data\\sushma.xlsx");
		
		String p1= obj.getCellData("Sheet1", "uname", 3);
		
		System.out.println("data from exccel file is : " + p1);
		
		/* what are the rows we have it needs to get the data
		 * from the entire row
		 */
		
		int rowsCount=obj.getRowCount("Sheet1");
		
		for(int i=2;i<=rowsCount;i++){
			
			String data=obj.getCellData("Sheet1", "uname", i);
			
			//System.out.println("data from the file is: " +data);
			//driver.findElement(By.id("sb_form_q")).clear();
			//driver.findElement(By.id("sb_form_q")).sendKeys(data);
			System.out.println("data from the file is: " +data);
			System.out.println(obj.getCellData("Sheet2", "fname", i));
			System.out.println(obj.getCellData("Sheet2", "lname", i));
			System.out.println(obj.getCellData("Sheet2", "mname", i));
			
		}
		
		
		Thread.sleep(6500);
		//driver.quit(); //which will terminate the browser instance
		

	}
	
}
