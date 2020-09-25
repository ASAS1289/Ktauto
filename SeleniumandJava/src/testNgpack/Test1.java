package testNgpack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void f() {
	  System.out.println("This is test from test1");
	  
	  
  }
  @BeforeMethod
  public void btMethod()
  {
	  System.out.println("This is test Before Method from test1");
  }
  @AfterMethod
  public void atMethod()
  {
	  System.out.println("This is test After Method from test1");
  }
}
