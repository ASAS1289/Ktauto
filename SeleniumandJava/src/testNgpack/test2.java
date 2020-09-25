package testNgpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class test2 {
  @Test
  public void f() {
	  System.out.println("This is actual Test");
  }
  
  @BeforeMethod
  public void btestMethod() {
	  System.out.println("This is method for before Method");
  }
  
  @AfterSuite
  public void aSuite1() {
	  System.out.println("This is method for after suite");
  } 
  
  @AfterMethod
  public void testMethod() {
	  System.out.println("This is method for After Method");
  }

  @BeforeClass
  public void testClass() {
	  System.out.println("This is method for before Class");
  }

  @AfterClass
  public void atestClass() {
	  System.out.println("This is method for After Class");
  }

  @BeforeTest
  public void btestTest() {
	  System.out.println("This is method for before Test");
  }

  @AfterTest
  public void atestTest() {
	  System.out.println("This is method for after Test");
  }

  @BeforeSuite
  public void bSuite() {
	  System.out.println("This is method for before suite");
  }

  
  

}
