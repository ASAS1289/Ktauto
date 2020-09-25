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

public class test3 {
  @Test
  public void f() {
	  System.out.println("This is test case1 from  test3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is method for before method test3");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is method for after method test3");
  }
  @Test
  public void f1() {
	  System.out.println("This is test case2 from  test3");
  }
  @Test
  public void f2() {
	  System.out.println("This is test case3 from  test3");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is method for before class test3");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is method for after class test3");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is method for before test test3");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is method for after test test3");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is method for before suite test3");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is method for after suite test3");
  }

}
