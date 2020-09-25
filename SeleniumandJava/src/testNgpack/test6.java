package testNgpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test6 {
  @Test
  public void openBrowser() {

       Reporter.log( "Message from openBrowser method"  );
  }
  @Test
  public void loginPage() {
	  Reporter.log( "Message from openBrowser method"  );
  }
  @Test
  public void homePage() {
  
  Reporter.log( "Message from homePage method" );
  }
  @Test
  public void homevalidate() {
	  Reporter.log( "Message from homevalidate method"  );
  }
  @Test
  public void checkoutPage() {
	  Reporter.log( "Message from checkoutPage method"  );
  }
  @Test
  public void funvalidate() {
	  Reporter.log( "Message from funvalidate method"  );
  }
  @Test
  public void closeBrowser() {
	  Reporter.log( "Message from closeBrowser method"  );
  }
}
